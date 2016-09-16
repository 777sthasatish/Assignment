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
public class Event {

    private String eventName;
    private int competitorLimit;
    private Result[] result;
    private int maxUniParticipants;
    private double currentGameRecords;
    private boolean highToLowScoring;

    public Event(String eventName, int competitorLimit, int maxUniParticipants, double currentGameRecords, boolean highToLowScoring) {
        this.eventName = eventName;
        this.competitorLimit = competitorLimit;
        this.maxUniParticipants = maxUniParticipants;
        this.currentGameRecords = currentGameRecords;
        this.highToLowScoring = highToLowScoring;
    }

    public String getEventName() {
        return eventName;
    }

    public int getCompetitorLimit() {
        return competitorLimit;
    }

    public double getCurrentGameRecords() {
        return currentGameRecords;
    }

    public void registerCompetitor(Participant participant) {

    }

    private boolean universityAtLimit(String s) {
        return false;
    }
    
    public void eventResults(){
    
    }
    
    public void viewResults(){
    
    }
    
    public String checkForRecords(){
        return null;
    
    }
    
    
}
