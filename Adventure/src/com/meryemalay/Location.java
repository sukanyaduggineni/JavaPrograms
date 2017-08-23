package com.meryemalay;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exists;

    public Location(int locationID, String description, Map<String, Integer> exists) {
        this.locationID = locationID;
        this.description = description;
        if(exists != null){
            this.exists = new HashMap<>(exists);
        }else{
            this.exists = new HashMap<>();
        }

        exists.put("Q", 0);
    }

//    public void addExit(String direction, int location){
//        exists.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExists() {
        return new HashMap<>(exists);
    }
}
