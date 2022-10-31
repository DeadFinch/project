package belhard.task4;
import java.util.Scanner;
public class Reader {
	String fio;
	int number;
	String faculty;
	String dob;
	int phone;
	String []listBook= new String [10];
	int u = 0;
	int j = 0;
	
	
	
		void takeBook(){
			Book b1 = new Book();
		
			for (int i =0;i<listBook.length;i++) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("¬ведите наименование книги которую хотите вз€ть: ");
			b1.name=s.nextLine();
			listBook[i]=b1.name;
			
			if (i>1&&b1.name.equals(listBook[i-1])){
				System.out.println("ƒанна€ книга у вас есть");
				listBook[i] = null;
				
			}
			
			break;
		}
		u++;
		}
	
void returnBook(){
	
	Scanner s = new Scanner(System.in);
	System.out.println("¬ведите книгу которую хотите вернуть: ");
	String ret = s.nextLine();
		for(int i = 0;i<listBook.length;i++) {
			if(listBook[i].equals(ret)) {
			listBook[i]=null;
			System.out.println(fio+" вернул "+ret);
			u--;
			break;
			
		}	
	}}
void printStatus(){
	System.out.println(fio +" вз€л "+u+ " книг:" );
	for (int i = 0;i<listBook.length-1;i++)
	
			System.out.print(listBook[i]);
	}
	
}
	


