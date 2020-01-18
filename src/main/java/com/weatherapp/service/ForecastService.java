package com.weatherapp.service;

import java.io.IOException;

import com.weatherapp.pojo.Response;

public interface ForecastService {
public Response getWeatherData(String location) throws IOException;
}
