package com.weatherapp.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weatherapp.pojo.Response;
import com.weatherapp.pojo.WeatherData;
import com.weatherapp.service.ForecastService;

@RestController
public class WeatherController {
	@Autowired
	ForecastService foreCastService;
	@GetMapping("/forecast")
	public Response getMessage(@RequestParam(value="location") String location) throws IOException {
		return this.foreCastService.getWeatherData(location);
	}
}
