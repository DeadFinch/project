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
	System.out.println("�������");
}
public void stop() {
	System.out.println("���������������");
}
public void turnRight() {
	System.out.println("������������ �������");
}
public void turnLeft() {
	System.out.println("������������ ������");
}
public String toString() {
	return "���������� �� ����: "+"\n����� ����: "+brand+"\n����� ����������: "+classAuto+"\n���: "+weight+"\n������� ��� �������� ��������: "+driver.FIO+"\n���� ��������: "+driver.drivingExperience+" ��� "+
			"\n�������� ������: "+engine.power+"\n������������� ������: "+engine.producer;
}
Car(){}
}
