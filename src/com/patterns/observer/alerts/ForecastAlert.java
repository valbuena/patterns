package com.patterns.observer.alerts;

import com.patterns.observer.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public class ForecastAlert extends Alert {

    private float lastPressure = 0;

    @Override
    public void notify(Object data) {
        if (this.getWeatherData() != null) {
            this.lastPressure = this.getWeatherData().getPressure();
        }
        setWeatherData((WeatherData) data);
        display();
    }

    @Override
    public void display() {

        if (getWeatherData().getPressure() > lastPressure) {
            System.out.println("Forecast: Improving weather on the way!");
        } else if (getWeatherData().getPressure() == lastPressure) {
            System.out.println("Forecast: More of the same");
        } else if (getWeatherData().getPressure()  < lastPressure) {
            System.out.println("Forecaste: Go to worse");
        }
    }
}
