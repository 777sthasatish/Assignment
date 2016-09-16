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
public class Order {
    private int order_id;
    private int quantity;
    private Guest guest_id;
    private Item item_id;

    public Order() {
    }

    public Order(int order_id, int quantity, Guest guest_id, Item item_id) {
        this.order_id = order_id;
        this.quantity = quantity;
        this.guest_id = guest_id;
        this.item_id = item_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Guest getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(Guest guest_id) {
        this.guest_id = guest_id;
    }

    public Item getItem_id() {
        return item_id;
    }

    public void setItem_id(Item item_id) {
        this.item_id = item_id;
    }
    
    
    
}
