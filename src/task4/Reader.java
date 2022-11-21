package belhard.task4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Reader implements Serializable{
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
			System.out.println("Invite name a book: ");	
			book.name=s.nextLine();
			book.authorName="Noname";
			book.text="some text";
			t=false;
			System.out.printf("%s take a book %s",fio,book.name);
			}
			if (t==true) {
				System.out.println("You have limit books");
			}
				}
		
	void returnBook(){
	Scanner s = new Scanner(System.in);
	System.out.printf("size book %d%n",listBook.size());
	System.out.println("Invite name a book which you want back: ");
	String ret = s.nextLine();
	for(Book book1:listBook) {
		if (ret.equals(book1.name)) {
	
	listBook.remove(book1);
			System.out.println(fio+" back book: "+ret);
			break;
			}	
	}
	System.out.printf("size book %d",listBook.size());
	}
			
	
void printStatus(){
	System.out.printf("%s take %d book(s): ",fio,listBook.size());
	for(Book book:listBook) {
	
System.out.printf("%s, ",book.name);
		}
	System.out.println();

}
}
