package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class  Car {
String brand;
String classAuto;
int weight;
Driver driver = new Driver();
Engine engine = new Engine();
public void strat() {
	System.out.println("Поехали");
}
public void stop() {
	System.out.println("Останавливаемся");
}
public void turnRight() {
	System.out.println("Поворачиваем направо");
}
public void turnLeft() {
	System.out.println("Поворачиваем налево");
}
public String toString() {
	return "Информация об авто: "+"\nМарка авто: "+brand+"\nКласс автомобиля: "+classAuto+"\nвес: "+weight+"\nФамилия Имя Отчество водителя: "+driver.FIO+"\nСтаж вождения: "+driver.drivingExperience+" лет "+
			"\nМощность мотора: "+engine.power+"\nПроизводитель мотора: "+engine.producer;
}
Car(){}
}
