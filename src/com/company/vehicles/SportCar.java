package com.company.vehicles;

public class SportCar extends Car {
int maxSpeed;
public String toString() {
	return super.toString()+"\nМаксимальная скорость: "+maxSpeed;
}
}
