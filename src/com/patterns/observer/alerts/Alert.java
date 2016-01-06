package com.patterns.observer.alerts;

import com.patterns.observer.BeObserver;
import com.patterns.observer.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public abstract class Alert implements DisplayAlert, BeObserver {

    private WeatherData weatherData;

    public WeatherData getWeatherData() {
        return weatherData;
    }

    protected void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }



}
