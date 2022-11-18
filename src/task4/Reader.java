package belhard.task4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Reader {
	String fio;
	int number;
	String faculty;
	String dob;
	String phone;
	List <Book>listBook= new ArrayList<>();
	
	
	
int num = 0;
		void takeBook(){
			
			boolean t=true;
			if (listBook.size()<10) {
				Book book = new Book();
				listBook.add(book);
			
			Scanner s = new Scanner(System.in);
			System.out.println("Введите наименование книги которую хотите взять: ");	
			book.name=s.nextLine();
			book.authorName="Noname";
			book.text="some text";
			t=false;
			System.out.printf("%s взял книгу %s",fio,book.name);
			}
			if (t==true) {
				System.out.println("Лимит книг превышен");
			}
				}
		
	void returnBook(){
	Scanner s = new Scanner(System.in);
	System.out.printf("размер книг %d%n",listBook.size());
	System.out.println("Введите книгу которую хотите вернуть: ");
	String ret = s.nextLine();
	for(Book book1:listBook) {
		if (ret.equals(book1.name)) {
	
	listBook.remove(book1);
			System.out.println(fio+" вернул книгу: "+ret);
			break;
			}	
	}
	System.out.printf("размер книг %d",listBook.size());
	}
			
	
void printStatus(){
	System.out.printf("%s взял %d книг(и): ",fio,listBook.size());
	for(Book book:listBook) {
	
System.out.printf("%s, ",book.name);
		}
	System.out.println();

}
}
