package com.company.vehicles;

public class Lorry extends Car {
		
	
		int loadCapacity;
		public String toString() {
		return super.toString()+"\nМаксимальная гузоподъемность: "+loadCapacity;
		}
}
