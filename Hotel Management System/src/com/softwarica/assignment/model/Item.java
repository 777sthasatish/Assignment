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
public class Item {
    private int item_id;
    private String item_name;
    private float price;
    private Item_type itemtype_id;

    public Item() {
    }

    public Item(int item_id, String item_name, float price, Item_type itemtype_id) {
        this.item_id = item_id;
        this.item_name = item_name;
        this.price = price;
        this.itemtype_id = itemtype_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Item_type getItemtype_id() {
        return itemtype_id;
    }

    public void setItemtype_id(Item_type itemtype_id) {
        this.itemtype_id = itemtype_id;
    }
    
    
    
}
