package belhard;
import java.util.Scanner;
public class Homework02 {
	public static void main(String[] args) {
		System.out.println("������� ����� �� 1 �� 7: ");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		String[]b= {null,"�����������", "�������", "�����", "�������", "�������", "�������", "�����������"};
// ������ ������� �������
//		if (a<1 || a>7) {
//			System.out.println("������ ��� ���");
//		}
//		else {
//			System.out.println(b[a]);
//		}
	//	}
		
/*������ ������� �������*/	switch(a){
	case (1):
		System.out.println(b[a]);
		break;
	
	case (2):
		System.out.println(b[a]);
		break;
	
	case (3):
		System.out.println(b[a]);
		break;
	
	case (4):
		System.out.println(b[a]);
		break;
	
	case (5):
		System.out.println(b[a]);
		break;
	
	case (6):
		System.out.println(b[a]);
		break;
	
	case (7):
		System.out.println(b[a]);
		break;
	
	default:
		System.out.println("������ ��� ���");
	}
	
	}

}
