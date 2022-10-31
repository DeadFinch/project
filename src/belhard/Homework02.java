package belhard;
import java.util.Scanner;
public class Homework02 {
	public static void main(String[] args) {
		System.out.println("Введите число от 1 до 7: ");
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		String[]b= {null,"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
// Первый вариант решения
//		if (a<1 || a>7) {
//			System.out.println("такого дня нет");
//		}
//		else {
//			System.out.println(b[a]);
//		}
	//	}
		
/*второй вариант решения*/	switch(a){
	case (1):
		System.out.println(b[a]);
		break;
	
	case (2):
		System.out.println(b[a]);
		break;
	
	case (3):
		System.out.println(b[a]);
		break;
	
	case (4):
		System.out.println(b[a]);
		break;
	
	case (5):
		System.out.println(b[a]);
		break;
	
	case (6):
		System.out.println(b[a]);
		break;
	
	case (7):
		System.out.println(b[a]);
		break;
	
	default:
		System.out.println("такого дня нет");
	}
	
	}

}
