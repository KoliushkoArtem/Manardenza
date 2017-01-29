package com.manardenza.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Hotel extends AbstractObject implements Serializable {

    private String name;
    private String city;
    private List<Room> rooms;

    public Hotel(String name, String city, List<Room> rooms) {
        this.name = name;
        this.city = city;
        this.rooms = rooms;
    }
}
