package belhard;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("������� ������ �������: ");
		int n = s.nextInt();
		System.out.println("������� ������ �������� ��������: ");
		int min = s.nextInt();
		System.out.println("������� ������� �������� ��������: ");
		int max = s.nextInt()+1;
		
			if(max<min||max<0||min<0) {
			System.out.println("\n�� ����� �������� �������� ���������� ��� ���!\n");
			System.out.println("������� ������ �������� ��������: ");
			min = s.nextInt();
			System.out.println("������� ������� �������� ��������: ");
			max = s.nextInt();
			}		
		int []a = new int[n];
		for (int i = 0; i<a.length;i++) {
			if (i==0) {
				System.out.println("��� ������ ������� �� ��������� �����: ");
							}
			a[i]= (int) (Math.random()*(max-min)+min);
			System.out.print(a[i]+" ");
		}
	}

}
