package belhard.homework;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int action;
		Reader[] readers = new Reader[10];
		Scanner s = new Scanner(System.in);
		
		do {System.out.println("\n");			
			System.out.println("1 - äîáàâèòü íîâîãî ÷èòàòåëÿ");
			System.out.println("2 - äîáàâèòü êíèãó ÷èòàòåëþ");
			System.out.println("3 - ÷èòàòåëü õî÷åò âåðíóòü êíèãó");
			System.out.println("4 - âûâåñòè ñòàòó ÷èòàòåëÿ");
			System.out.println("5 - âûâåñòè ñòàòóñû âñåõ ÷èòàòåëåé");
			System.out.println("6 - âûéòè èç ïðîãðàììû");
			System.out.println("Ââåäèòå íîìåð äåéñòâèÿ: ");
            action = s.nextInt();
            s.nextLine();
		switch(action) {
		case 1:{
			boolean isFull = false;
			for (int i = 0; i<readers.length-1;i++) {
				if(readers[i]==null) {
					readers[i]= new Reader();
					System.out.println("Ââåäèòå ôàìèëèþ è èíèöèàëû: ");
					readers[i].fio=s.nextLine();
					readers[i].number=i+1;
					System.out.println("Âàì ïðèñâîåí íîìåð: "+readers[i].number);
					System.out.println("Ââåäèòå íàçâàíèå ôàêóëüòåòà: ");
					readers[i].faculty=s.nextLine();
					System.out.println("Ââåäèòå äåíü.ìåñÿö.ãîä ðîæäåíèÿ: ");
					readers[i].dob=s.nextLine();
					System.out.println("Арабский текст какой-то: ");
					readers[i].phone = s.nextInt();
					isFull = true;
break;
				}	
			}
			if (isFull==false) {
				System.out.println("Ñïèñîê êàðòîòåêè ïîëîí");
			}
			break;
		}
		case 2:{
			//ïðîñèì ââåñòè äàííûå êíèãè è ñîçäàåì êíèãó, ïðîñèì ââåñòè íîìåð áèëåòà
			boolean found = true;
			System.out.println("Ââåäèòå íîìåð áèëåòà: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].takeBook();
				found=false;
				break;
			}
		}
			if (found==true) {
				System.out.println("Òàêîпочемуãî ÷èòàòåëÿ íåò");}
			continue;
		}
		case 3:{
			boolean found = true;
			System.out.println("Ââåäèòå íîìåð áèëåòà: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {				
				readers[i].returnBook();
				found = false;
				break;
			}
			}
			if (found == true) {
					System.out.println("Òàêîãî ÷èòàòåëÿ íåò");}		
		break;
		}
		case 4:{
			boolean found = true;
			System.out.println("Ââåäèòå íîìåð áèëåòà: ");
			int num = s.nextInt();
			for (int i = 0; i<readers.length-1;i++) {
				if (readers[i]!=null && readers[i].number==num) {
				readers[i].printStatus();
				found = false;
				break;
			}
										}
			if (found == true) {
					System.out.println("Òàêîãî ÷èòàòåëÿ íåò");
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
				System.out.println("Âûõîäèì èç ïðîãðàììû!");
				break;
			}
		}

}while (action!=6);
}
	}
