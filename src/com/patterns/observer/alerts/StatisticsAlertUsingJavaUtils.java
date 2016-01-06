package com.patterns.observer.alerts;

import com.patterns.observer.weather.WeatherCentralUsingJavaUtils;
import com.patterns.observer.weather.WeatherData;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class StatisticsAlertUsingJavaUtils extends AlertUsingJavaUtils {

    private int numAlerts = 0;

    @Override
    public void update(Observable observable, Object arg) {
        WeatherCentralUsingJavaUtils weatherCentralUsingJavaUtils = (WeatherCentralUsingJavaUtils)observable;

        numAlerts++;
        WeatherData dataCurrent = (WeatherData) weatherCentralUsingJavaUtils.getWeatherData();
        if(this.getWeatherData() != null) {
            WeatherData dataAverage = new WeatherData(
                    getWeatherData().getTemperature() + dataCurrent.getTemperature(),
                    getWeatherData().getHumidity() + dataCurrent.getHumidity(),
                    getWeatherData().getPressure() + dataCurrent.getPressure());

            setWeatherData((WeatherData) dataAverage);
        }
        else{
            setWeatherData(dataCurrent);
        }

        display();
    }
    @Override
    public void display() {
        System.out.format("Average Conditions : %.2f %.2f %.2f \n",
                getWeatherData().getTemperature()/ this.numAlerts,
                getWeatherData().getHumidity()/ this.numAlerts,
                getWeatherData().getPressure()/this.numAlerts);
    }
}
