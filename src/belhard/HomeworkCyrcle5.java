package belhard;
import java.util.Scanner;

public class HomeworkCyrcle5 {
	

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("������� ������������ ����� �: ");
	int A = s.nextInt();
	System.out.println("������� ����������� ����� �: ");
	int B = s.nextInt();
		int C=0;
	while (A>=0)
	{
		A-=B;
		C++;
		if(A>=0&&A<B) {
			System.out.println("��� �������: "+A);
			System.out.println("����� ��������� "+C + " �������(��) �� "+B);
			
		}
	}
	
	
	
	
	}

}