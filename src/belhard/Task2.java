package belhard;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Введите размер массива: ");
		int n = s.nextInt();
		System.out.println("Введите нижний диапазон значений: ");
		int min = s.nextInt();
		System.out.println("Введите верхний диапазон значений: ");
		int max = s.nextInt()+1;
		
			if(max<min||max<0||min<0) {
			System.out.println("\nВы ввели неверные значения попробуйте еще раз!\n");
			System.out.println("Введите нижний диапазон значений: ");
			min = s.nextInt();
			System.out.println("Введите верхний диапазон значений: ");
			max = s.nextInt();
			}		
		int []a = new int[n];
		for (int i = 0; i<a.length;i++) {
			if (i==0) {
				System.out.println("Ваш массив состоит из следующих чисел: ");
							}
			a[i]= (int) (Math.random()*(max-min)+min);
			System.out.print(a[i]+" ");
		}
	}

}
