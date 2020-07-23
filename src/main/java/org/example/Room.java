package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Room {
    @JsonProperty
    private String id;

    @JsonProperty
    private Building something;
}
