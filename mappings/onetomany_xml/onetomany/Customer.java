package onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity
public class Customer {
	// @Id
	 private int licence;
	// @Column
	 private String name;
	 
	// @OneToMany(cascade=CascadeType.ALL)
	 private Collection<Vehicle> vehicle ;

	public int getLicence() {
		return licence;
	}

	public void setLicence(int licence) {
		this.licence = licence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
	 
	 

	 
	

}
