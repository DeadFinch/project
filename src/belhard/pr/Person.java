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
			System.out.println("Введите год");
			Scanner s = new Scanner(System.in);
			age=s.nextInt();
			if(age<=12) {
			System.out.println("Детсво");}
		
		else if (age<=17) {
			System.out.println("Юность");}
			
		else if (age<=44) {
			System.out.println("Молодость");}
			
		else if (age<=59) {
			System.out.println("Зрелость");
			}
		else if (age<=74) {
			System.out.println("Пожилой возраст");
			}
		else if (age<=90) {
			System.out.println("Старость");
			}
		else {
			System.out.println("Долгожительство");
			}
	}
	
	void getFullName() {
		System.out.println(surname +" "+name);
	}

}
