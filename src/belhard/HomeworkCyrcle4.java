package belhard;
import java.util.Scanner;
public class HomeworkCyrcle4 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Введите минимальное число А: ");
		int a = s.nextInt();
		System.out.println("Введите максимальное число B: ");
		int b = s.nextInt();
		int j =0;
		for (int n=b-1;n>a;n--) {
			System.out.println(n);
			j++;
			}
	System.out.println("всего чисел: "+j);
	}
}
