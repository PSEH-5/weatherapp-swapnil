package com.weatherapp.pojo;

import java.util.List;

public class Response {
private List<Time> forecast;
private String advice;
public List<Time> getForecast() {
	return forecast;
}
public void setForecast(List<Time> forecast) {
	this.forecast = forecast;
}
public String getAdvice() {
	return advice;
}
public void setAdvice(String advice) {
	this.advice = advice;
}
@Override
public String toString() {
	return "Response [forecast=" + forecast + ", advice=" + advice + "]";
}

}
