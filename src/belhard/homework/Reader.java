package belhard.homework;
import java.util.Scanner;
public class Reader {
	String fio;
	int number;
	String faculty;
	String dob;
	int phone;
	Book []listBook= new Book [10];
	int u = 0;
	
		void takeBook(){
			boolean t=true;
			for(int i =0; i<listBook.length-1;i++) {
			if(listBook[i]==null) {
			listBook[i]= new Book();
			Scanner s = new Scanner(System.in);
			System.out.println("������� ������������ ����� ������� ������ �����: ");
			listBook[i].name=s.nextLine();
			System.out.println(fio+" ���� �����:"+listBook[i].name+"\n");
			u++;
			t=false;
			break;
			}
			if (t==true&&i==listBook.length-2) {
				System.out.println("����� ���� ��������");
				break;
				}
			}
		}		
	void returnBook(){
	Scanner s = new Scanner(System.in);
	System.out.println("������� ����� ������� ������ �������: ");
	String ret = s.nextLine();
	
		try{for(int i = 0;i<listBook.length;i++) {
			if(listBook[i]!=null&&ret.equals(listBook[i].name)) {
			for(int j=i; j<listBook.length-1;j++) {
			listBook[j]=listBook[j+1];}
			System.out.println(fio+" ������ �����: "+ret);
			u--;	
			break;
		}
	}
		}catch(Exception a){
				System.out.println("������ ����� � �������� ���");
			}
	}
void printStatus(){
	System.out.print(fio +" ���� "+u+ " ����(�): " );
	for (int i=0;i<listBook.length-1;i++) {
		if (listBook[i]!=null) {
			System.out.print(listBook[i].name+"; ");
			}
		}
	System.out.println();
	}
}


