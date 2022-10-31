package belhard;
import java.util.Scanner;

public class HomeworkCyrcle5 {
	

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Введите максимальное число А: ");
	int A = s.nextInt();
	System.out.println("Введите минимальное число В: ");
	int B = s.nextInt();
		int C=0;
	while (A>=0)
	{
		A-=B;
		C++;
		if(A>=0&&A<B) {
			System.out.println("Ваш остаток: "+A);
			System.out.println("Всего вмещается "+C + " отрезка(ов) по "+B);
			
		}
	}
	
	
	
	
	}

}