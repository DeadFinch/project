package belhard;

import java.util.Scanner;

public class HomeworkCycle3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("¬ведите факториал натурального числа n: ");
		int n = s.nextInt();
		int nul = 0;
		System.out.println(nul+"\t"+(nul+1));
		int result = 1;
	for (int i =1; i<=n;i++) {
		
	result = result*i;
		System.out.println(i+"\t"+result);
	}
	}

}
