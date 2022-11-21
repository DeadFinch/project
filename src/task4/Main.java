package belhard.task4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		int action;
		
		List <Reader> readers = new ArrayList <>();
		List <Reader> readers2 = new ArrayList <>();
		readers=FileUtil.readReader(readers2);
		if(readers.size()==0) {
			
			System.out.println("File is emty!");
		}
		Scanner s = new Scanner(System.in);
		int numb = 0;
		do {System.out.println("\n");			
		System.out.println("1 - created new reader");
		System.out.println("2 - add new book for reader");
		System.out.println("3 - reader return book");
		System.out.println("4 - reader info");
		System.out.println("5 - info about all reader");
		System.out.println("6 - exit");
		System.out.println("Enter number action: ");
            action = s.nextInt();
            s.nextLine();
		switch(action) {
		case 1:{
			
		int i = 0;
				readers.add(i,new Reader());
				
					for (Reader reader:readers) {
						
					System.out.println("Invite FIO: ");
					reader.fio=s.nextLine();
				
					reader.number=++numb;
					
					System.out.println("You number is: "+reader.number);
//					System.out.println("Введите наименование факультета: ");
//					reader.faculty=s.nextLine();
//					System.out.println("введите день рождения: ");
//					reader.dob=s.nextLine();
//					System.out.println("введите номер телефона: ");
//					reader.phone = s.nextLine();
		
break;

			}
			
			break;
		}
		
		case 2:{
			
			boolean found = true;
			System.out.println("Enter number: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				
				if (reader!=null && reader.number==num) {
				reader.takeBook();
				found=false;
				break;
			}
		}
			if (found==true) {
				System.out.println("Wrong number reader");}
			continue;
		}
		case 3:{
			boolean found = true;
			System.out.println("Enter number: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {				
				reader.returnBook();
				found = false;
				break;
			}
			}
			if (found == true) {
					System.out.println("Wrong number reader");}		
		break;
		}
		case 4:{
			boolean found = true;
			System.out.println("Enter number: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {
				reader.printStatus();
				found = false;
				break;
			}
										}
			if (found == true) {
					System.out.println("Wrong number reader");
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
				System.out.println("Exit with program!");
				FileUtil.setReader(readers);
				System.out.println("Readers has been written");
				break;
			}
		}

}while (action!=6);
}
	}