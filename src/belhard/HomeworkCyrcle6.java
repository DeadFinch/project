package belhard;
import java.util.Scanner;

public class HomeworkCyrcle6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������� ������� �: ");
		int A = s.nextInt();
		System.out.println("������� ������� �: ");
		int B = s.nextInt();
		System.out.println("������� ������� C: ");
		int C = s.nextInt();
		int D = A*B;
		int E = D/(C*C);
		int F = D%(C*C);
		System.out.println("���-�� ���������: "+E);
		System.out.println("��� �������: " +F);
	}

}
