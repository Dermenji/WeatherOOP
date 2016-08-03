package com.sirma.dto;


import com.sirma.objectmodel.WindDirection;

public interface WindDTO extends MainDTO {

    WindDirection getDirection();

    void setDirection(WindDirection direction);
}
