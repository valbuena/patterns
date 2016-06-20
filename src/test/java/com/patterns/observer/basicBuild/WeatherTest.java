package com.patterns.observer.basicBuild;

import com.patterns.observer.basicBuild.alerts.*;
import com.patterns.observer.basicBuild.weather.WeatherCentral;
import com.patterns.observer.basicBuild.weather.WeatherData;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherTest {

    private WeatherCentral station = new WeatherCentral();
    private BeObserver forecastAlert = new ForecastAlert();
    private BeObserver stateAlert = new StateAlert();
    private BeObserver statisticsAlert = new StatisticsAlert();
    private BeObserver heatIndexAlert = new HeatIndexAlert();

    @Before
    public void setup()
    {
        station.registerObserver(forecastAlert);
        station.registerObserver(stateAlert);
        station.registerObserver(statisticsAlert);
        station.registerObserver(heatIndexAlert);
    }

    @Test
    public void testChangeWheater(){
        WeatherData morningData = new WeatherData(20, 65, 30.5f);
        station.notifyChangeWeather(morningData);

        WeatherData afternoonData = new WeatherData(15, 60, 30f);
        station.notifyChangeWeather(afternoonData);


        station.removeObserver(forecastAlert);
        WeatherData eveningData = new WeatherData(10, 55, 25f);
        station.notifyChangeWeather(eveningData);

    }
}
