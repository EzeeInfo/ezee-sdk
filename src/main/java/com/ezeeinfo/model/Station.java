package com.ezeeinfo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {

    private final String code;
    private final String name;
    private final String shortName;

    @JsonCreator
    public Station(@JsonProperty("code") final String code
            , @JsonProperty("name") final String name) {
        this.code = code;
        this.name = name;

        char[] shortChars = name.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        int length = shortChars.length;

        //loop execute till the length of the string
        for (int i = 0; i < length; i++) {
            int charType = Character.getType(shortChars[i]);
            if (charType == Character.LOWERCASE_LETTER) {
                stringBuilder.append(shortChars[i]);
            } else if (charType == Character.UPPERCASE_LETTER) {
                stringBuilder.append(Character.toLowerCase(shortChars[i]));
            }
        }

        this.shortName = stringBuilder.toString();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    @Override
    public String toString() {
        return "Station{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
