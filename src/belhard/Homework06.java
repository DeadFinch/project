package belhard;
import java.util.Scanner;
public class Homework06 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("������� ����� �� 0 �� 999: ");
	int n = s.nextInt();
	if (n%2==0) {
		System.out.print("��� ������");
	}
	else {
		System.out.print("��� ��������");
	}
	if (n<10) {
		System.out.print(" ����������� �����");
	}
	else if (n<100) {
		System.out.print(" ���������� �����");
	}
	else if (n<1000) {
		System.out.print(" ����������� �����");
	}
	
}
}
