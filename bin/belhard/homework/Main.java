package belhard.task4;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int action;
		ArrayList <Reader> readers = new ArrayList <>();
//		Reader[] readers = new Reader[10];
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
			
		int i = 0;
				readers.add(i,new Reader());
				
					for (Reader reader:readers) {
						i++;
					System.out.println("������� ������� � ��������: ");
					reader.fio=s.nextLine();
					reader.number=(int) (Math.random()*100);
					System.out.println("��� �������� �����: "+reader.number);
//					System.out.println("������� �������� ����������: ");
//					reader.faculty=s.nextLine();
//					System.out.println("������� ����.�����.��� ��������: ");
//					reader.dob=s.nextLine();
//					System.out.println("������� ����� ��������: ");
//					reader.phone = s.nextLine();
//					
break;
					//}
			}
			
			break;
		}
		
		case 2:{
			//������ ������ ������ ����� � ������� �����, ������ ������ ����� ������
			boolean found = true;
			System.out.println("������� ����� ������: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				
				if (reader!=null && reader.number==num) {
				reader.takeBook();
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
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {				
				reader.returnBook();
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
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {
				reader.printStatus();
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