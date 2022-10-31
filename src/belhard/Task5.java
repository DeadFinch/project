package belhard;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Введите нижний диапазон значений: ");
		int min = s.nextInt();
		System.out.println("Введите верхний диапазон значений: ");
		int max = s.nextInt()+1;
		int []a = new int[20];
		int j=0;
		for (int i = 0; i<a.length;i++) {
			if (i==0) {System.out.println("Ваши значения:");}
			a[i]=(int) (Math.random()*(max-min)+min);
		System.out.print(a[i]+" ");}
		System.out.println("\nВведите число для поиска: ");
		int find = s.nextInt();
		for (int i = 0; i<a.length;i++) {
			if (a[i]==find) {
				System.out.println("Индекс заданного числа в массиве: " + i);
				j++;
			}
				if (i==a.length-1&&find!=a[i]) {
					System.out.println("Конец поиска, найдено результатов: "+j);
				}
		}
	}
}
