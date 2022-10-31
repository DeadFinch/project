package belhard;
import java.util.Scanner;
import java.util.Arrays;
public class Task7 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("������� ������ �������: ");
		int n = s.nextInt();
		System.out.println("������� ������ �������� ��������: ");
		int min = s.nextInt();
		System.out.println("������� ������� �������� ��������: ");
		int max = s.nextInt()+1;
		int []a = new int[n];
		int stepLine=0;
		for(int i =0; i<a.length;i++) {
			a[i]= (int) (Math.random()*(max-min)+min);
		}
		Arrays.sort(a);
		for (int i =0;i<a.length;i++) {	
			if (i==0) {
			System.out.println("\n"+"�������� � �������: ");}
	System.out.print(a[i]+" ");}
		
		System.out.println("\n������� �������� ������: ");
		int k = s.nextInt();
	for (int i = 0;i<a.length;i++) {
		stepLine++;
		if (a[i]==k) {
			System.out.println("\n������ ��������� ����� � �������: " + i);
			System.out.println("�������� �����: "+ stepLine+ " ����(��)");
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
			System.out.println("�������� �����: "+ stepDouble + " ����(��)");
			break;
		}else if (k<a[midIndex]) {
			highIndex=midIndex-1;
		}else if (k>a[midIndex]) {
			lowIndex=midIndex+1;
		}
	}
	
	}

}
