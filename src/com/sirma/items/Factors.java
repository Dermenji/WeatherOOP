package com.sirma.items;


import java.util.Calendar;

public class Factors {
    private int temperature;

    private int airHumidity;

    private Rainfall rainfall;

    private WindSpeed windSpeed;

    private WindDirection windDirection;

    private Calendar interval;

    public Factors(int temperature, int airHumidity, Rainfall rainfall, WindSpeed windSpeed, WindDirection windDirection, Calendar interval) {
        this.temperature = temperature;
        this.airHumidity = airHumidity;
        this.rainfall = rainfall;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.interval = interval;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(int airHumidity) {
        this.airHumidity = airHumidity;
    }

    public Rainfall getRainfall() {
        return rainfall;
    }

    public void setRainfall(Rainfall rainfall) {
        this.rainfall = rainfall;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public Calendar getInterval() {
        return interval;
    }

    public void setInterval(Calendar interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "Factors{" +
                "temperature=" + temperature +
                ", airHumidity=" + airHumidity +
                ", rainfall=" + rainfall.toString() +
                ", windSpeed=" + windSpeed.toString() +
                ", windDirection=" + windDirection +
                ", interval=" + interval.toString() +
                '}';
    }
}
