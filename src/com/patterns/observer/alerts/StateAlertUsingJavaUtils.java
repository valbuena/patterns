package com.patterns.observer.alerts;

import com.patterns.observer.weather.WeatherCentralUsingJavaUtils;
import com.patterns.observer.weather.WeatherData;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class StateAlertUsingJavaUtils extends AlertUsingJavaUtils {


    @Override
    public void update(Observable observable, Object arg) {
        WeatherCentralUsingJavaUtils weatherCentralUsingJavaUtils = (WeatherCentralUsingJavaUtils)observable;
        setWeatherData(weatherCentralUsingJavaUtils.getWeatherData());
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
