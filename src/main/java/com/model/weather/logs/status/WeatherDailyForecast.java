package com.model.weather.logs.status;

import java.sql.Timestamp;
import java.time.LocalDate;

public class WeatherDailyForecast {

	private City cityId;
	
	private LocalDate date;
	
	private WeatherStatus weatherStatus;
	
	private Float minTemperature;
	
	private Float maxTemperature;
	
	private Integer averageHumidityInPercentage;
	
	private Timestamp sunriseTime;
	
	private Timestamp sunsetTime;
	
	private Timestamp lastUpdatedAt;
	
	private String sourceSystem;
}
