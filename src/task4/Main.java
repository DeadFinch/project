package belhard.task4;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int action;
		ArrayList <Reader> readers = new ArrayList <>();

		Scanner s = new Scanner(System.in);
		int numb = 0;
		do {System.out.println("\n");			
		System.out.println("1 - добавить нового читателя");
		System.out.println("2 - добавить книгу читателю");
		System.out.println("3 - читатель хочет вернуть книгу");
		System.out.println("4 - вывести стату читателя");
		System.out.println("5 - вывести статусы всех читателей");
		System.out.println("6 - выйти из программы");
		System.out.println("Введите номер действия: ");
            action = s.nextInt();
            s.nextLine();
		switch(action) {
		case 1:{
			
		int i = 0;
				readers.add(i,new Reader());
				
					for (Reader reader:readers) {
						
					System.out.println("Введите ФИО: ");
					reader.fio=s.nextLine();
				
					reader.number=++numb;
					
					System.out.println("Вам присвоен номер: "+reader.number);
					System.out.println("Введите наименование факультета: ");
					reader.faculty=s.nextLine();
					System.out.println("введите день рождения: ");
					reader.dob=s.nextLine();
					System.out.println("введите номер телефона: ");
					reader.phone = s.nextLine();
		
break;

			}
			
			break;
		}
		
		case 2:{
			
			boolean found = true;
			System.out.println("Введите номер читателя: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				
				if (reader!=null && reader.number==num) {
				reader.takeBook();
				found=false;
				break;
			}
		}
			if (found==true) {
				System.out.println("Такого читателя нет");}
			continue;
		}
		case 3:{
			boolean found = true;
			System.out.println("Введите номер читателя: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {				
				reader.returnBook();
				found = false;
				break;
			}
			}
			if (found == true) {
					System.out.println("Такого читателя нет");}		
		break;
		}
		case 4:{
			boolean found = true;
			System.out.println("Введите номер читателя: ");
			int num = s.nextInt();
			for (Reader reader: readers) {
				if (reader!=null && reader.number==num) {
				reader.printStatus();
				found = false;
				break;
			}
										}
			if (found == true) {
					System.out.println("Такого читателя нет");
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
				System.out.println("Выход из программы!");
				break;
			}
		}

}while (action!=6);
}
	}