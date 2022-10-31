package belhard;
import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("¬ведите значение a:");
		int a = s.nextInt();
		System.out.println("¬ведите значение b не равное 0:");
		int b = s.nextInt();
		System.out.println("¬ведите номер действи€ от 1 до 4:");
		int n = s.nextInt();
		switch(n) {
		case 1:
			System.out.println("¬аш результат: "+ a+b);
			break;
		case 2:
			System.out.println("¬аш результат: "+ (a-b));
			break;
		case 3:
			System.out.println("¬аш результат: "+a*b);
			break;
		case 4:
			System.out.println("¬аш результат: "+a/b);
			break;
		
	}

}
}