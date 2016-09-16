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
public class Result {

    private Participant competitor;
    private double result;

    public Result(Participant competitor) {
        this.competitor = competitor;
    }

    public Participant getCompetitor() {
        return competitor;
    }   

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
