package belhard;
import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("������� �������� a:");
		int a = s.nextInt();
		System.out.println("������� �������� b �� ������ 0:");
		int b = s.nextInt();
		System.out.println("������� ����� �������� �� 1 �� 4:");
		int n = s.nextInt();
		switch(n) {
		case 1:
			System.out.println("��� ���������: "+ a+b);
			break;
		case 2:
			System.out.println("��� ���������: "+ (a-b));
			break;
		case 3:
			System.out.println("��� ���������: "+a*b);
			break;
		case 4:
			System.out.println("��� ���������: "+a/b);
			break;
		
	}

}
}