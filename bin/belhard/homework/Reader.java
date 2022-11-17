package belhard.task4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Reader {
	String fio;
	int number;
	String faculty;
	String dob;
	String phone;
	LinkedList <Book>listBook= new LinkedList<Book>();
	Book b = new Book();
	int u = 0;

		void takeBook(){
			boolean t=true;
			if (listBook.size()<10) {
				
			Scanner s = new Scanner(System.in);
			System.out.println("¬ведите наименование книги которую хотите вз€ть: ");	
			listBook.add(new Book(s.nextLine()));
			for(Book book:listBook) {
			System.out.printf("%s вз€л книгу: %n",fio);
			u++;
			
			t=false;
			
			break;
			
			}
			if (t==true) {
				System.out.println("Ћимит книг превышен");
			}
				}
		}
	
		
	void returnBook(){
	Scanner s = new Scanner(System.in);
	System.out.println("¬ведите книгу которую хотите вернуть: ");
	String ret = s.nextLine();
	for(Book book:listBook) {
		if (ret.equals(book.name)) {
	
	listBook.remove(book);
			System.out.println(fio+" вернул книгу: "+ret);
			u--;
			}	
	}
	}
			
	
void printStatus(){
	System.out.print(fio +" вз€л "+u+ " книг(и): ");
	for(Book book:listBook) {
System.out.print(book.name+", ");
	
	}
}
}

