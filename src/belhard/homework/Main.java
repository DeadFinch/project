package belhard.homework;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int action;
		Reader[] readers = new Reader[10];
		Scanner s = new Scanner(System.in);
		
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
			boolean isFull = false;
			for (int i = 0; i<readers.length-1;i++) {
				if(readers[i]==null) {
					readers[i]= new Reader();
					System.out.println("Введите фамилию и инициалы: ");
					readers[i].fio=s.nextLine();
					readers[i].number=i+1;
					System.out.println("Вам присвоен номер: "+readers[i].number);
					System.out.println("Введите название факультета: ");
					readers[i].faculty=s.nextLine();
					System.out.println("Введите день.месяц.год рождения: ");
					readers[i].dob=s.nextLine();
					System.out.println("Введите номер телефона: ");
					readers[i].phone = s.nextInt();
					isFull = true;
break;
				}	
			}
			if (isFull==false) {
				System.out.println("Список картотеки полон");
			}
			break;
		}
		case 2:{
			//просим ввести данные книги и создаем книгу, просим ввести номер билета
			boolean found = true;
			System.out.println("Введите номер билета: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].takeBook();
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
			System.out.println("Введите номер билета: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {				
				readers[i].returnBook();
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
			System.out.println("Введите номер билета: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].printStatus();
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
				System.out.println("Выходим из программы!");
				break;
			}
		}

}while (action!=6);
}
	}