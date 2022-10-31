package belhard;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("¬ведите размер массива: ");
		int n = s.nextInt();
		System.out.println("¬ведите нижний диапазон значений: ");
		int min = s.nextInt();
		System.out.println("¬ведите верхний диапазон значений: ");
		int max = s.nextInt()+1;
		int []a = new int[n];
		int inv;
		int h = 0;
		for(int i =0; i<a.length;i++) {
			a[i]= (int) (Math.random()*(max-min)+min);
			if (i==0) {
				System.out.println("«начени€ в массиве: ");
			}
		System.out.print(a[i]+" ");
		}
		System.out.println("\nмассив после инвертировани€: ");
		for(int i =0; i<a.length/2;i++) {
			inv = a[i];
			a[i]=a[a.length-i-1];
				a[a.length-i-1]=inv;}
				do {
				System.out.print(a[h]+" ");
				h++;
				}
				while (h<a.length);
			}
	}
