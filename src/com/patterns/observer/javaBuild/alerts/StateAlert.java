package com.patterns.observer.javaBuild.alerts;

import com.patterns.observer.javaBuild.weather.WeatherCentral;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class StateAlert extends Alert {


    @Override
    public void update(Observable observable, Object arg) {
        WeatherCentral weatherCentral = (WeatherCentral)observable;
        setWeatherData(weatherCentral.getWeatherData());
        display();
    }

    @Override
    public void display() {
        System.out.format("Current Conditions %.2f %.2f %.2f \n",
                getWeatherData().getTemperature(),
                getWeatherData().getHumidity(),
                getWeatherData().getPressure());
    }


}
