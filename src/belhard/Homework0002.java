package belhard;
import java.util.Scanner;

public class Homework0002 {
public static void main(String[] args) {
	System.out.println("������� ���: ");
	Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
				
  			
				if (n%400==0) {
					System.out.println("�� ����� " + n +" ���, � ��� 366 ����");
					}
					else if (n%100==0) {
						System.out.println("�� ����� " + n +" ���, � ��� 365 ����");
					}
				
				else if (n%4!=0) {
					System.out.println("�� ����� " + n +" ���, � ��� 365 ����");
					}
								
				else {
					System.out.println("�� ����� " + n +" ���, � ��� 366 ����");
				}
}
}
