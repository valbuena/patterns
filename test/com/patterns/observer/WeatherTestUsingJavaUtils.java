package com.patterns.observer;

import com.patterns.observer.alerts.*;
import com.patterns.observer.weather.WeatherCentral;
import com.patterns.observer.weather.WeatherCentralUsingJavaUtils;
import com.patterns.observer.weather.WeatherData;
import org.junit.Before;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherTestUsingJavaUtils {

    private WeatherCentralUsingJavaUtils station = new WeatherCentralUsingJavaUtils();
    private Observer stateAlert = new StateAlertUsingJavaUtils();
    private Observer statisticsAlert = new StatisticsAlertUsingJavaUtils();

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
