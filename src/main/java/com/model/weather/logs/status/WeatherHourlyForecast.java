package com.model.weather.logs.status;

import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class WeatherHourlyForecast {

	private Long id;
	
	private City cityId;
	
	private Timestamp startTime;
	
	private Timestamp endTime;
	
	private Float temperature;
	
	private Float feelsLikeTemperature;
	
	private Integer humidityInPercentage;
	
	private Float windSpeedInMilesPerHour;
	
	private String windDirection;
	
	private Float pressureInmmHg;
	
	private Float visibilityInMilesPerHour;
}
