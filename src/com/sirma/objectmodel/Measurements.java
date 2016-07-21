package com.sirma.objectmodel;

import java.util.Calendar;
import java.util.Date;

public abstract class Measurements {
    private Rainfall rainfall;
    private Calendar interval;
    private Date date;
    private City city;
    private Temperature temp;
    private AirHumidity airHumidity;
    private WindSpeed windSpeed;
}
