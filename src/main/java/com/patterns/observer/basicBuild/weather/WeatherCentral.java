package com.patterns.observer.basicBuild.weather;

import com.patterns.observer.basicBuild.BeObservable;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherCentral extends BeObservable{

    private WeatherData weatherData;

    public void notifyChangeWeather(final WeatherData weatherData)
    {
        System.out.println("-------------------");
        System.out.println("New weather !!!!!");
        System.out.println("-------------------");
        this.weatherData = weatherData;
        this.notifyObservers(weatherData);
    }

}
