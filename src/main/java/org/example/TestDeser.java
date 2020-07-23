package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * To hide the exception, just rename Room.something to Room.outer
 */
public class TestDeser {

    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String buildingJson = "{\"lobby\":{\"id\":\"L1\"}}";

        Museum museum = objectMapper.readValue(buildingJson, Museum.class);
        Building building = objectMapper.readValue(buildingJson, Building.class);
    }
}
