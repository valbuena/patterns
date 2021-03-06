package com.patterns.observer.basicBuild.alerts;

import com.patterns.observer.basicBuild.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public class StatisticsAlert extends Alert {

    private int numAlerts = 0;

    @Override
    public void notify(Object data) {

        numAlerts++;
        WeatherData dataCurrent = (WeatherData) data;
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
