package belhard.pr;
import java.util.Scanner;
public class Person {
	 String name;
	 String surname;
	 String prof;
	 static int age;
	
	public Person (String name, String surname, String prof, int age){
		this.name = name;
		this.surname = surname;
		this.prof=prof;
		this.age = age;
	}
	public static void printAgeGroup() {
			System.out.println("������� ���");
			Scanner s = new Scanner(System.in);
			age=s.nextInt();
			if(age<=12) {
			System.out.println("������");}
		
		else if (age<=17) {
			System.out.println("������");}
			
		else if (age<=44) {
			System.out.println("���������");}
			
		else if (age<=59) {
			System.out.println("��������");
			}
		else if (age<=74) {
			System.out.println("������� �������");
			}
		else if (age<=90) {
			System.out.println("��������");
			}
		else {
			System.out.println("���������������");
			}
	}
	
	void getFullName() {
		System.out.println(surname +" "+name);
	}

}
