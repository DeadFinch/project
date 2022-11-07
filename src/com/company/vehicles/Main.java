package com.company.vehicles;

public class Main {
	public static void main(String[] args) {
		Lorry monsterTrack = new Lorry();
		monsterTrack.loadCapacity=5;
		monsterTrack.brand = "Jeep";
		monsterTrack.classAuto= "4x4";
		monsterTrack.driver.FIO="Bootovski Kick Lestorovich";
		monsterTrack.driver.drivingExperience=5;
		monsterTrack.engine.power= 360;
		monsterTrack.engine.producer ="BMW";
		monsterTrack.weight=6;
		monsterTrack.strat();
		monsterTrack.turnLeft();
		monsterTrack.turnRight();
		monsterTrack.stop();
		System.out.println(monsterTrack);
		System.out.println();
		SportCar speedTrack = new SportCar();
		speedTrack.maxSpeed=300;
		speedTrack.brand = "BMW";
		speedTrack.classAuto= "2x4";
		speedTrack.driver.FIO="Bootovski Kick Lestorovich";
		speedTrack.driver.drivingExperience=15;
		speedTrack.engine.power= 360;
		speedTrack.engine.producer ="BMW";
		speedTrack.weight=1;
		speedTrack.strat();
		speedTrack.turnLeft();
		speedTrack.turnRight();
		speedTrack.stop();
		System.out.println(speedTrack);
	}

}
