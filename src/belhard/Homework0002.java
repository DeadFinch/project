package belhard;
import java.util.Scanner;

public class Homework0002 {
public static void main(String[] args) {
	System.out.println("Введите год: ");
	Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
				
  			
				if (n%400==0) {
					System.out.println("Вы ввели " + n +" год, в нем 366 дней");
					}
					else if (n%100==0) {
						System.out.println("Вы ввели " + n +" год, в нем 365 дней");
					}
				
				else if (n%4!=0) {
					System.out.println("Вы ввели " + n +" год, в нем 365 дней");
					}
								
				else {
					System.out.println("Вы ввели " + n +" год, в нем 366 дней");
				}
}
}
