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
public class Room_category {
   private int cat_id;
   private String category;
   private float price;
   private int num_of_beds;

    public Room_category() {
    }

    public Room_category(int cat_id, String category, float price, int num_of_beds) {
        this.cat_id = cat_id;
        this.category = category;
        this.price = price;
        this.num_of_beds = num_of_beds;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum_of_beds() {
        return num_of_beds;
    }

    public void setNum_of_beds(int num_of_beds) {
        this.num_of_beds = num_of_beds;
    }
   
   
    
}
