package com.weatherapp.WeatherAppApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.weatherapp")
public class WeatherAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApiApplication.class, args);
	}

}
