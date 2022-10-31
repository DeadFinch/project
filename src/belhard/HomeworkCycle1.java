package belhard;
import java.util.Scanner;
public class HomeworkCycle1 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
		System.out.println("¬ведите число циклов: ");
	int m = s.nextInt();
	int n =1;
	while (n<=m) {
		System.out.println("Task"+n);
		n++;
	}
}
}
