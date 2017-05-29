package com.patterns.observer.javaBuild;

import com.patterns.observer.javaBuild.alerts.StateAlert;
import com.patterns.observer.javaBuild.alerts.StatisticsAlert;
import com.patterns.observer.javaBuild.weather.WeatherCentral;
import com.patterns.observer.basicBuild.weather.WeatherData;
import org.junit.Before;
import org.junit.Test;

import java.util.Observer;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherTest {

    private WeatherCentral station = new WeatherCentral();
    private Observer stateAlert = new StateAlert();
    private Observer statisticsAlert = new StatisticsAlert();

    @Before
    public void setup()
    {

        station.addObserver(stateAlert);
        station.addObserver(statisticsAlert);
    }

    @Test
    public void testChangeWheater(){
        WeatherData morningData = new WeatherData(20, 65, 30.5f);
        station.notifyChangeWeather(morningData);

        WeatherData afternoonData = new WeatherData(15, 60, 30f);
        station.notifyChangeWeather(afternoonData);


        station.deleteObserver(statisticsAlert);
        WeatherData eveningData = new WeatherData(10, 55, 25f);
        station.notifyChangeWeather(eveningData);

    }
}
