package belhard;
import java.util.Scanner;
public class HomeworkCyrcle8 {
public static void main(String[] args) {
	int money = 1000;
	Scanner s = new Scanner(System.in); 
		System.out.println("Введите % ставку от 1 до 25: ");
		double p = s.nextDouble();
		int j=0;
		double per = 0;
	for(;money<=1100;) {
		if (p<=0||p>=25) {
			System.out.println("Вы ввели неверную ставку %");
			break;
		}
		per=money*(p/100);
		money+=per;
		j++;
		if(money>1100) {
	System.out.println("Понадобилось "+j+" месяца(ев)");
	System.out.println("Сумма составила "+money);
	
	}
	}
}
}
