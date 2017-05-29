package com.patterns.observer.basicBuild.weather;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(final float temperature, final float humidity, final float preassure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = preassure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
