package belhard;
import java.util.Scanner;

public class Homework08 {
	
	public static void main(String[] args) {
		String[]ms= {null,"����","����","�����","������"};
		String[]ns= {null,"�������","������","������","��������","�������","��������","�������","���������","�������","�������","�����","����","������","���"};
		Scanner s = new Scanner (System.in);
		try{System.out.println("������� ����� ����� �� 1 �� 14: ");
		int n = s.nextInt();
		System.out.println("������� ����� ����� ����� �� 1 �� 4: ");
		int m = s.nextInt();
		if (ns[n]==null ||ms[m]==null) {
			System.out.println("�� ����� ������������ ������, ���������� ��� ���");
		}
		else{
			System.out.println("���� �����: "+ns[n]+" "+ms[m]);
		}}
		catch(Exception e){
			System.out.println("�� ����� ������������ ������, ���������� ��� ���");
			}
	
	}

}

