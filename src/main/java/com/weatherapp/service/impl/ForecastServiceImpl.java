package com.weatherapp.service.impl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.weatherapp.pojo.Response;
import com.weatherapp.pojo.Time;
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
		List<Time> threeDaysData = getThreeDaysData(data);
		Time min = threeDaysData.stream().min(getTempratureComprator()).get();
		Time max = threeDaysData.stream().max(getTempratureComprator()).get();
		response.setLowTemperature(min);
		response.setHighTemperate(max);
		populateAdvice(response,threeDaysData);
		return response;
	}
	
	private void populateAdvice(Response response, List<Time> threeDaysData) {
		for(Time data: threeDaysData) {
			if(isHotEnoughForSunScreenLotion(data.getTemperature().getValue())) {
				response.setAdvice("Use sunscreen lotion");
			}
			if(data.getPrecipitation() != null && isGoodEnoughForRain(data.getPrecipitation().getType())) {
				response.setAdvice("Carry umbrella");
			}
		}
	}
	private List<Time> getThreeDaysData(WeatherData data){
		List<Time> threeDaysData = new ArrayList();
		LocalDate thirdDate = LocalDate.now().plusDays(3);
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		threeDaysData.addAll(Arrays.stream(data.getForecast())
				.filter(t->{
					LocalDate day = LocalDate.parse(t.getTo(),formatter);
					return day.isBefore(thirdDate);
				})
				.collect(Collectors.toList()));
		return threeDaysData;
	}
	private Comparator<Time> getTempratureComprator() {
		return new Comparator<Time>() {
			@Override
			public int compare(Time o1, Time o2) {
				return Float.compare(o1.getTemperature().getValue(), o2.getTemperature().getValue());
			}
		};
	}
	private Boolean isHotEnoughForSunScreenLotion(Float value) {
		return (5/9 * (value - 32) + 273) > 40;
	}
	private Boolean isGoodEnoughForRain(String value) {
		return value.equalsIgnoreCase("rain");
	}
	
}
