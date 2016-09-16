/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federation.feduniolympics;

/**
 *
 * @author Satish
 */
public class Participant {
    private String[] name=new String[1];
    private University[] enrolledUniversity;

    public Participant(String[] name, University enrolledUniversity) {
        for(int i=0; i<=name.length(); i++){
            name[i]="Shakti";
        }
    }

    public String[] getName() {
        return name;
    }

    public University[] getEnrolledUniversity() {
        return enrolledUniversity;
    }
    
}
