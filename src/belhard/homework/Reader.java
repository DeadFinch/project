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
			System.out.println("Введите наименование книги которую хотите взять: ");
			listBook[i].name=s.nextLine();
			System.out.println(fio+" взял книгу:"+listBook[i].name+"\n");
			u++;
			t=false;
			break;
			}
			if (t==true&&i==listBook.length-2) {
				System.out.println("Лимит книг превышен");
				break;
				}
			}
		}		
	void returnBook(){
	Scanner s = new Scanner(System.in);
	System.out.println("Введите книгу которую хотите вернуть: ");
	String ret = s.nextLine();
	
		try{for(int i = 0;i<listBook.length;i++) {
			if(listBook[i]!=null&&ret.equals(listBook[i].name)) {
			for(int j=i; j<listBook.length-1;j++) {
			listBook[j]=listBook[j+1];}
			System.out.println(fio+" вернул книгу: "+ret);
			u--;	
			break;
		}
	}
		}catch(Exception a){
				System.out.println("Данной книги у читателя нет");
			}
	}
void printStatus(){
	System.out.print(fio +" взял "+u+ " книг(и): " );
	for (int i=0;i<listBook.length-1;i++) {
		if (listBook[i]!=null) {
			System.out.print(listBook[i].name+"; ");
			}
		}
	System.out.println();
	}
}


