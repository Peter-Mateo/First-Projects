package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
public class Physician extends User implements HIPAACompliantUser {

	//
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
	Physician(Integer id) {
		super(id);
	}
    // TO DO: Implement HIPAACompliantUser!
	public boolean assignPin(int pin) {
		// Checks if the pin is 4 digits
		if(pin > 999 && pin <= 9999) {
			super.setPin(pin);
			return true;
		}
		else {
			return false;
		}
	}
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// Checks to see if the ID given matches the Admin ID
		if (!confirmedAuthID.equals(this.getId())) {
			return false;
		}
		else {
			return true;
		}
	}
	//
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    // TO DO: Setters & Getters
    
}
