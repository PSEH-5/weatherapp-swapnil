package com.weatherapp.pojo;

import java.util.List;

public class Response {
private Time highTemperate;
private Time lowTemperature;
private String advice;

public Time getHighTemperate() {
	return highTemperate;
}
public void setHighTemperate(Time highTemperate) {
	this.highTemperate = highTemperate;
}
public Time getLowTemperature() {
	return lowTemperature;
}
public void setLowTemperature(Time lowTemperature) {
	this.lowTemperature = lowTemperature;
}
public String getAdvice() {
	return advice;
}
public void setAdvice(String advice) {
	this.advice = advice;
}
@Override
public String toString() {
	return "Response [highTemperate=" + highTemperate + ", lowTemperature=" + lowTemperature + ", advice=" + advice
			+ "]";
}

}
