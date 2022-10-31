package belhard.homework;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int action;
		Reader[] readers = new Reader[10];
		Scanner s = new Scanner(System.in);
		
		do {System.out.println("\n");			
			System.out.println("1 - �������� ������ ��������");
			System.out.println("2 - �������� ����� ��������");
			System.out.println("3 - �������� ����� ������� �����");
			System.out.println("4 - ������� ����� ��������");
			System.out.println("5 - ������� ������� ���� ���������");
			System.out.println("6 - ����� �� ���������");
			System.out.println("������� ����� ��������: ");
            action = s.nextInt();
            s.nextLine();
		switch(action) {
		case 1:{
			boolean isFull = false;
			for (int i = 0; i<readers.length-1;i++) {
				if(readers[i]==null) {
					readers[i]= new Reader();
					System.out.println("������� ������� � ��������: ");
					readers[i].fio=s.nextLine();
					readers[i].number=i+1;
					System.out.println("��� �������� �����: "+readers[i].number);
					System.out.println("������� �������� ����������: ");
					readers[i].faculty=s.nextLine();
					System.out.println("������� ����.�����.��� ��������: ");
					readers[i].dob=s.nextLine();
					System.out.println("������� ����� ��������: ");
					readers[i].phone = s.nextInt();
					isFull = true;
break;
				}	
			}
			if (isFull==false) {
				System.out.println("������ ��������� �����");
			}
			break;
		}
		case 2:{
			//������ ������ ������ ����� � ������� �����, ������ ������ ����� ������
			boolean found = true;
			System.out.println("������� ����� ������: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].takeBook();
				found=false;
				break;
			}
		}
			if (found==true) {
				System.out.println("������ �������� ���");}
			continue;
		}
		case 3:{
			boolean found = true;
			System.out.println("������� ����� ������: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {				
				readers[i].returnBook();
				found = false;
				break;
			}
			}
			if (found == true) {
					System.out.println("������ �������� ���");}		
		break;
		}
		case 4:{
			boolean found = true;
			System.out.println("������� ����� ������: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].printStatus();
				found = false;
				break;
			}
										}
			if (found == true) {
					System.out.println("������ �������� ���");
				}
		break;
		}
		case 5: {
			for (Reader r:readers) {
				if (r!=null) {
					r.printStatus();
				}
			}
			break;
		}
			case 6: {
				System.out.println("������� �� ���������!");
				break;
			}
		}

}while (action!=6);
}
	}