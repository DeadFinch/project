package belhard;

import java.util.Scanner;

public class HomeworkCyrcle7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������� ����� N: ");
		int N = s.nextInt();
		int j = 0;
		int sum =0;
		for (int i=N;i>=0;i/=10) {
			
			if (i%10==2) {
			System.out.println("���� 2");
			break;
			}
	if (i==0&i%10!=2) {
				System.out.println("��� 2");
				break;
				}
			}
		System.out.println("����� ��������: ");
		for (int i=N;i>0;i/=10) {
		int b = i%10;
		sum+=b;
		System.out.print(b);
		j++;
			}
		System.out.println("\n� ���� ����� "+j+" ����(�)");
		System.out.println("����� ����� "+sum);
		}
}
	

	


