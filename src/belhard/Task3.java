package belhard;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("������� ������ �������: ");
		int n = s.nextInt();
		System.out.println("������� ������ �������� ��������: ");
		int min = s.nextInt();
		System.out.println("������� ������� �������� ��������: ");
		int max = s.nextInt()+1;
		int []a = new int[n];
		int c = 0;
		boolean b;
		int j=0;
		for (int i = 0; i<a.length;i++) {
			a[i]=(int) (Math.random()*(max-min)+min);
			if(a[i]>c) {
				c=a[i];}
					
				b=c==a[i];
			if (b==true) {
				j=i;
	}
					System.out.print(a[i] + " ");
		}
		System.out.print("\n������������ ����� "+ c);
		System.out.print(" � �������� " + j);
			}
}
