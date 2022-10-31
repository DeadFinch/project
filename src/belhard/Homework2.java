package belhard;
import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		System.out.println("Введите целое число: ");
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		if (n%2==0) {
			System.out.print("четное");}
		else {
			System.out.println("нечетное");
		}

		// второй способ решения вместо else подставить следующий код
/*		if (n==0) {
			System.out.print (" ,так написано в гугле");
		}
		if (n%2!=0) {
			System.out.println("нечетное");
		}
		
	}*/
	}
}

