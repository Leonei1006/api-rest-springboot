package one.digitalinovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum PhoneType {

    NAME(description:"NAME"),

    MOBILE(description:"Mobile"),

    COMMERCIAL(description:"Commercial");

    private static final String description;

}

