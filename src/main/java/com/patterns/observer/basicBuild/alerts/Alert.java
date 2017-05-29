package com.patterns.observer.basicBuild.alerts;

import com.patterns.observer.basicBuild.BeObserver;
import com.patterns.observer.basicBuild.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public abstract class Alert implements DisplayAlert, BeObserver {

    private WeatherData weatherData;


    protected WeatherData getWeatherData() {
        return weatherData;
    }

    protected void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }



}
