package belhard;
import java.util.Scanner;
public class HomeworkCyrcle4 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("������� ����������� ����� �: ");
		int a = s.nextInt();
		System.out.println("������� ������������ ����� B: ");
		int b = s.nextInt();
		int j =0;
		for (int n=b-1;n>a;n--) {
			System.out.println(n);
			j++;
			}
	System.out.println("����� �����: "+j);
	}
}
