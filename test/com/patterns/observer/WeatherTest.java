package com.patterns.observer;

import com.patterns.observer.alerts.DisplayAlert;
import com.patterns.observer.alerts.ForecastAlert;
import com.patterns.observer.alerts.StateAlert;
import com.patterns.observer.alerts.StatisticsAlert;
import com.patterns.observer.weather.WeatherCentral;
import com.patterns.observer.weather.WeatherData;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pep on 6/01/16.
 */
public class WeatherTest {

    private WeatherCentral station = new WeatherCentral();
    private ForecastAlert forecastAlert = new ForecastAlert();
    private StateAlert stateAlert = new StateAlert();
    private StatisticsAlert statisticsAlert = new StatisticsAlert();

    @Before
    public void setup()
    {
        station.registerObserver(forecastAlert);
        station.registerObserver(stateAlert);
        station.registerObserver(statisticsAlert);
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
