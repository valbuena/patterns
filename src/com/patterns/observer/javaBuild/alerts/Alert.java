package com.patterns.observer.javaBuild.alerts;

import com.patterns.observer.basicBuild.alerts.DisplayAlert;
import com.patterns.observer.basicBuild.weather.WeatherData;

import java.util.Observer;

/**
 * Created by pep on 6/01/16.
 */
public abstract class Alert implements DisplayAlert, Observer {

    private WeatherData weatherData;


    protected  WeatherData getWeatherData() {
        return weatherData;
    }

    protected void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }



}
