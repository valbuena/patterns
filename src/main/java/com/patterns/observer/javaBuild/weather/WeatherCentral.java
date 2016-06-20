package com.patterns.observer.javaBuild.weather;

import com.patterns.observer.basicBuild.weather.WeatherData;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherCentral extends Observable{

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
