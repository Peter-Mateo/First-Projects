package com.caresoft.clinicapp;

public abstract class User {
    protected Integer id;
    protected int pin;
    // Constructor that takes id
    User(Integer id){
    	this.id = id;
    }
    // Getters
    public Integer getId() {
    	return id;
    }
    public int getPin() {
    	return pin;
    }
    // Setters
    void setId(Integer id) {
    	this.id = id;
    }
    void setPin(int pin) {
    	this.pin = pin;
    }
}

