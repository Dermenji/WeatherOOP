package com.sirma.dto;

import com.sirma.objectmodel.*;

import java.util.Date;

public interface MeasurmentsDTO {
    Date getDate();

    void setDate(Date date);

    City getCity();

    void setCity(City city);

    Rainfall getRainfall();

    WindSpeed getWindSpeed();

    void setWindSpeed(WindSpeed windSpeed);

    void setRainfall(Rainfall rainfall);

    Temperature getTemp();

    void setTemp(Temperature temp);

    AirHumidity getAirHumidity();

    void setAirHumidity(AirHumidity airHumidity);

    Wind getWindDirection();

    void setWindDirection(Wind wind);
}

