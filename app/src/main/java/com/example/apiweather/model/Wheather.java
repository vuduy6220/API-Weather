package com.example.apiweather.model;

public class Wheather {
    private String DateTime;
    private int WeatherIcon;
    private String IconPharse;
    private Temperature Temperature;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPharse() {
        return IconPharse;
    }

    public void setIconPharse(String iconPharse) {
        IconPharse = iconPharse;
    }

    public com.example.apiweather.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.apiweather.model.Temperature temperature) {
        Temperature = temperature;
    }
}
