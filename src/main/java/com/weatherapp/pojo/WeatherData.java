package com.weatherapp.pojo;

import java.util.Arrays;

public class WeatherData {
private Location location;
private String credit;
private Meta meta;
private Sun sun;
private Time[] forecast;
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}
public String getCredit() {
	return credit;
}
public void setCredit(String credit) {
	this.credit = credit;
}
public Meta getMeta() {
	return meta;
}
public void setMeta(Meta meta) {
	this.meta = meta;
}
public Sun getSun() {
	return sun;
}
public void setSun(Sun sun) {
	this.sun = sun;
}
public Time[] getForecast() {
	return forecast;
}
public void setForecast(Time[] forecast) {
	this.forecast = forecast;
}
@Override
public String toString() {
	return "WeatherData [location=" + location + ", credit=" + credit + ", meta=" + meta + ", sun=" + sun
			+ ", forecast=" + Arrays.toString(forecast) + "]";
}


}
