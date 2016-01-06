package com.patterns.observer.weather;

import com.patterns.observer.BeObservable;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherCentralUsingJavaUtils extends Observable{

    private WeatherData weatherData;

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void notifyChangeWeather(final WeatherData weatherData)
    {
        System.out.println("-------------------");
        System.out.println("New weather java.util.Observable !!!!!");
        System.out.println("-------------------");
        this.weatherData = weatherData;
        this.setChanged();
        this.notifyObservers(weatherData);

    }

}
