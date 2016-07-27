package com.sirma.dto;


import com.sirma.objectmodel.WindDirection;

public interface WindDTO {
    String getUnit();

    String getValue();

    void setValue(String value);

    WindDirection getDirection();

    void setDirection(WindDirection direction);
}
