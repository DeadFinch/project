package belhard;
import java.util.Scanner;
import java.util.Arrays;
public class Task7 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("¬ведите размер массива: ");
		int n = s.nextInt();
		System.out.println("¬ведите нижний диапазон значений: ");
		int min = s.nextInt();
		System.out.println("¬ведите верхний диапазон значений: ");
		int max = s.nextInt()+1;
		int []a = new int[n];
		int stepLine=0;
		for(int i =0; i<a.length;i++) {
			a[i]= (int) (Math.random()*(max-min)+min);
		}
		Arrays.sort(a);
		for (int i =0;i<a.length;i++) {	
			if (i==0) {
			System.out.println("\n"+"«начени€ в массиве: ");}
	System.out.print(a[i]+" ");}
		
		System.out.println("\n¬ведите значение поиска: ");
		int k = s.nextInt();
	for (int i = 0;i<a.length;i++) {
		stepLine++;
		if (a[i]==k) {
			System.out.println("\n»ндекс заданного числа в массиве: " + i);
			System.out.println("Ћинейный поиск: "+ stepLine+ " шага(ов)");
			break;
			}
		
	}
	int stepDouble = 0;
	int lowIndex = 0;
	int highIndex= a.length-1;
	int p=-1;
	while(lowIndex<=highIndex) {
		stepDouble++;
	int midIndex = (lowIndex+highIndex)/2;
		if (k==a[midIndex]) {
			p=midIndex;
			System.out.println("ƒвоичный поиск: "+ stepDouble + " шага(ов)");
			break;
		}else if (k<a[midIndex]) {
			highIndex=midIndex-1;
		}else if (k>a[midIndex]) {
			lowIndex=midIndex+1;
		}
	}
	
	}

}
