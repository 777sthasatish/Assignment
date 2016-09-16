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
public class Item_type {
    private int itemtype_id;
    private String item_type;

    public Item_type() {
    }

    public Item_type(int itemtype_id, String item_type) {
        this.itemtype_id = itemtype_id;
        this.item_type = item_type;
    }

    public int getItemtype_id() {
        return itemtype_id;
    }

    public void setItemtype_id(int itemtype_id) {
        this.itemtype_id = itemtype_id;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }
    
    
    
}
