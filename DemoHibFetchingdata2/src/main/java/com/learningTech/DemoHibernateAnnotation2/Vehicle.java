package com.learningTech.DemoHibernateAnnotation2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private String vehicleType;
	private String vehicleName;
	private int no_of_tyres;
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(int no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleType=" + vehicleType + ", vehicleName=" + vehicleName + ", no_of_tyres=" + no_of_tyres
				+ "]";
	}
}
