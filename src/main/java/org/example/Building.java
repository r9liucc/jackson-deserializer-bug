package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Building {
    @JsonIgnoreProperties({"something"})
    @JsonProperty
    private Room lobby;
}
