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
public class Bill {
    private int bill_id;
    private float due_payement,advance_payement;
    private Date payment_date;
    private Guest guest_id;

    public Bill() {
    }

    public Bill(int bill_id, float due_payement, float advance_payement, Date payment_date, Guest guest_id) {
        this.bill_id = bill_id;
        this.due_payement = due_payement;
        this.advance_payement = advance_payement;
        this.payment_date = payment_date;
        this.guest_id = guest_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public float getDue_payement() {
        return due_payement;
    }

    public void setDue_payement(float due_payement) {
        this.due_payement = due_payement;
    }

    public float getAdvance_payement() {
        return advance_payement;
    }

    public void setAdvance_payement(float advance_payement) {
        this.advance_payement = advance_payement;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Guest getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Guest guest_id) {
        this.guest_id = guest_id;
    }
    
    
}
