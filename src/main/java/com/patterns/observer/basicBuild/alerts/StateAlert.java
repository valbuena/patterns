package com.patterns.observer.basicBuild.alerts;

import com.patterns.observer.basicBuild.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public class StateAlert extends Alert {

    @Override
    public void notify(Object data) {
        setWeatherData((WeatherData) data);
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
