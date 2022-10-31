package belhard;
import java.util.Scanner;
public class Homework06 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("¬ведите число от 0 до 999: ");
	int n = s.nextInt();
	if (n%2==0) {
		System.out.print("это четное");
	}
	else {
		System.out.print("это нечетное");
	}
	if (n<10) {
		System.out.print(" однозначное число");
	}
	else if (n<100) {
		System.out.print(" двузначное число");
	}
	else if (n<1000) {
		System.out.print(" трехзначное число");
	}
	
}
}
