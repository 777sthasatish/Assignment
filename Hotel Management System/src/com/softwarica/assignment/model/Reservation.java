/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softwarica.assignment.model;

import java.sql.Date;

/**
 *
 * @author NV
 */
public class Reservation {
    private int res_id;
    private int no_of_guest;
    private float room_cost;
    private Date check_in,check_out;
    private Guest guest_id;
    private Room room_id;

    public Reservation() {
    }

    public Reservation(int res_id, int no_of_guest, float room_cost, Date check_in, Date check_out, Guest guest_id, Room room_id) {
        this.res_id = res_id;
        this.no_of_guest = no_of_guest;
        this.room_cost = room_cost;
        this.check_in = check_in;
        this.check_out = check_out;
        this.guest_id = guest_id;
        this.room_id = room_id;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public int getNo_of_guest() {
        return no_of_guest;
    }

    public void setNo_of_guest(int no_of_guest) {
        this.no_of_guest = no_of_guest;
    }

    public float getRoom_cost() {
        return room_cost;
    }

    public void setRoom_cost(float room_cost) {
        this.room_cost = room_cost;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
        this.check_out = check_out;
    }

    public Guest getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Guest guest_id) {
        this.guest_id = guest_id;
    }

    public Room getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Room room_id) {
        this.room_id = room_id;
    }
    
    
    
}
