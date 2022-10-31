package belhard;
import java.util.Scanner;

public class HomeworkCyrcle6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введите сторону А: ");
		int A = s.nextInt();
		System.out.println("Введите сторону В: ");
		int B = s.nextInt();
		System.out.println("Введите сторону C: ");
		int C = s.nextInt();
		int D = A*B;
		int E = D/(C*C);
		int F = D%(C*C);
		System.out.println("Кол-во квадратов: "+E);
		System.out.println("Ваш остаток: " +F);
	}

}
