package belhard;
import java.util.Scanner;

public class Homework08 {
	
	public static void main(String[] args) {
		String[]ms= {null,"пики","треф","бубен","червей"};
		String[]ns= {null,"единица","двойка","тройка","четверка","пятерка","шестерка","семерка","восьмерка","девятка","десятка","валет","дама","король","туз"};
		Scanner s = new Scanner (System.in);
		try{System.out.println("Введите номер карты от 1 до 14: ");
		int n = s.nextInt();
		System.out.println("Введите номер масти карты от 1 до 4: ");
		int m = s.nextInt();
		if (ns[n]==null ||ms[m]==null) {
			System.out.println("Вы ввели некорректные данные, попробуйте еще раз");
		}
		else{
			System.out.println("Ваша карта: "+ns[n]+" "+ms[m]);
		}}
		catch(Exception e){
			System.out.println("Вы ввели некорректные данные, попробуйте еще раз");
			}
	
	}

}

