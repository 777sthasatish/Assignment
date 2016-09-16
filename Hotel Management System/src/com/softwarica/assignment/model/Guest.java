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
public class Guest {
    private int guest_id;
    private String fname;
    private String lname;
    private String contact;
    private String email;
    private String gender;

    public Guest() {
    }

    public Guest(int id, String fname, String lname, String contact, String email, String gender) {
        this.guest_id = id;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
    }

    public int getId() {
        return guest_id;
    }

    public void setId(int id) {
        this.guest_id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
    
    
    
}
