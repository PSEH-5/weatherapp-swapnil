package com.weatherapp.service.impl;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.weatherapp.pojo.Response;
import com.weatherapp.pojo.WeatherData;
import com.weatherapp.service.ForecastService;
@Service
public class ForecastServiceImpl implements ForecastService{

	@Autowired
	private Environment env;
	private RestTemplate restTemplate = new RestTemplate();
	@Override
	public Response getWeatherData(String location) throws IOException{
		String url = env.getProperty("forecast.url");
		String response = restTemplate.getForObject(url+"?q="+location+"&mode=xml&appid=d2929e9483efc82c82c32ee7e02d563e", String.class);
		XmlMapper xmlMapper = new XmlMapper();
	    xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    WeatherData data = xmlMapper.readValue(response, WeatherData.class);
		return getProcessedResponse(data);
	}
	private Response getProcessedResponse(WeatherData data) {
		Response response = new Response();
		response.setForecast(Arrays.stream(data.getForecast()).collect(Collectors.toList()));
		response.setAdvice("Carry umbrella");
		return response;
	}

}
