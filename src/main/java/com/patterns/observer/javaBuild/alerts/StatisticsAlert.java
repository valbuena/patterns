package com.patterns.observer.javaBuild.alerts;

import com.patterns.observer.javaBuild.weather.WeatherCentral;
import com.patterns.observer.basicBuild.weather.WeatherData;

import java.util.Observable;

/**
 * Created by pep on 6/01/16.
 */
public class StatisticsAlert extends Alert {

    private int numAlerts = 0;

    @Override
    public void update(Observable observable, Object arg) {
        WeatherCentral weatherCentral = (WeatherCentral)observable;

        numAlerts++;
        WeatherData dataCurrent = (WeatherData) weatherCentral.getWeatherData();
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
