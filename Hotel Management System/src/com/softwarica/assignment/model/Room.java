/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwarica.assignment.model;

/**
 *
 * @author NV
 */
public class Room {
    private int room_id;
    private int floor;
    private boolean Status;
    private Room_category cat_id;

    public Room() {
    }

    public Room(int room_id, int floor, boolean Status, Room_category cat_id) {
        this.room_id = room_id;
        this.floor = floor;
        this.Status = Status;
        this.cat_id = cat_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public Room_category getCat_id() {
        return cat_id;
    }

    public void setCat_id(Room_category cat_id) {
        this.cat_id = cat_id;
    }
    
    
}
