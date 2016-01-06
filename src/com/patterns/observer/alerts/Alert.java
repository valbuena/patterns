package com.patterns.observer.alerts;

import com.patterns.observer.BeObservable;
import com.patterns.observer.BeObserver;
import com.patterns.observer.weather.WeatherData;

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
