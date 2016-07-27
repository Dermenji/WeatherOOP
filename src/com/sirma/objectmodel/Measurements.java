package com.sirma.objectmodel;

import java.util.Date;

public abstract class Measurements {

    private Date date;
    private City city;
    private Rainfall rainfall;
    private Temperature temp;
    private AirHumidity airHumidity;
    private WindSpeed windSpeed;
    private Wind wind;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Rainfall getRainfall() {
        return rainfall;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setRainfall(Rainfall rainfall) {
        this.rainfall = rainfall;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public AirHumidity getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(AirHumidity airHumidity) {
        this.airHumidity = airHumidity;
    }

    public Wind getWindDirection() {
        return wind;
    }

    public void setWindDirection(Wind wind) {
        this.wind = wind;
    }

    @Override
    public String toString() {
        return "Measurements{" +
                "date=" + date +
                ", city=" + city +
                ", rainfall=" + rainfall +
                ", temp=" + temp +
                ", airHumidity=" + airHumidity +
                ", windSpeed=" + windSpeed +
                ", windDirection=" + wind +
                '}';
    }
}
