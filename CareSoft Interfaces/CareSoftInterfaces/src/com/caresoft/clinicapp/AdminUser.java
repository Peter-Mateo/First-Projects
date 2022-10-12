package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID, role, and initializes the ArrayList
    AdminUser(Integer id, String role) {
    	super(id);
    	this.securityIncidents = new ArrayList<String>();
		this.setRole(role);
	}
    // TO DO: Implement HIPAACompliantUser!
	public boolean assignPin(int pin) {
		// Checks if the pin is 6 digits
		if(pin > 99999 && pin <= 999999) {
			super.setPin(pin);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// Checks to see if the ID given matches the Admin ID
		if (confirmedAuthID == this.id) {
			return true;
		}
		else {
			// Creates Report
			this.authIncident();
			return false;
		}
	}
    // TO DO: Implement HIPAACompliantAdmin!
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    // TO DO: Setters & Getters
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
