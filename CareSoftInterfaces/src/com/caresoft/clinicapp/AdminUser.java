package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {

	// TO DO: Implement a constructor that takes an ID and a role
    

	// Inside class:
    private String role;
    private ArrayList<String> securityIncidents;
    
    
    public AdminUser(Integer id2, String role) {
    	super(id2);
    	this.role = role;
    	this.securityIncidents = new ArrayList<String>();
    	// TODO Auto-generated constructor stub
    }
    
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    @Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
    	if (pin > 99999) {
			this.pin = pin;
			return true;
		}
		else
			return false;
	}
    
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if(this.id == confirmedAuthID)
			return true;
		else {
			authIncident();
			return false;
		}
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
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
	
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	
 

}
