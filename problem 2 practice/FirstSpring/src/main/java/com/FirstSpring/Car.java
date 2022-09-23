package com.FirstSpring;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	String carname;
	public Car() {
		super();
	}
	public Car(String carname) {
		super();
		this.carname = carname;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void drive()
	{
		System.out.println("I am driving a car......");
		//System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Car [carname=" + carname + "]";
	}
	

}
