package com.patterns.observer.alerts;

import com.patterns.observer.weather.WeatherData;

/**
 * Created by pep on 6/01/16.
 */
public class HeatIndexAlert extends Alert {

    private float heatIndex;

    private float computeHeatIndex(final float temperature, final float humidity) {
        float index = (float)((16.923 + (0.185212 * temperature) + (5.37941 * humidity) - (0.100254 * temperature * humidity)
                + (0.00941695 * (temperature * temperature)) + (0.00728898 * (humidity * humidity))
                + (0.000345372 * (temperature * temperature * humidity)) - (0.000814971 * (temperature * humidity * humidity)) +
                (0.0000102102 * (temperature * temperature * humidity * humidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                (humidity * humidity * humidity)) + (0.00000142721 * (temperature * temperature * temperature * humidity)) +
                (0.000000197483 * (temperature * humidity * humidity * humidity)) - (0.0000000218429 * (temperature * temperature * temperature * humidity * humidity)) +
                0.000000000843296 * (temperature * temperature * humidity * humidity * humidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * humidity * humidity * humidity)));
        return index;
    }

    @Override
    public void notify(Object data) {
        setWeatherData((WeatherData) data);
        this.heatIndex = computeHeatIndex(getWeatherData().getTemperature(), getWeatherData().getHumidity());
        display();
    }

    @Override
    public void display() {
        System.out.format("Heat Index : %.2f \n", this.heatIndex);
    }
}
