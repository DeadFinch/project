package belhard;
import java.util.Scanner;
import java.io.*;
public class Homework002 {
	public static void main(String[] args) {
		System.out.println("������� ������ �����: ");
	Scanner s = new Scanner (System.in);
	int n1 = s.nextInt();
	System.out.println("������� ������ �����: ");
	int n2 = s.nextInt();
	System.out.println("������� ������ �����: ");
	int n3 = s.nextInt();
		
	if (n1>n2&&n2>n3&&n3<n1) {
		System.out.println(n1+n2);
	}
	if (n1<n2&&n2<n3) {
		System.out.println(n2+n3);
	}
	if (n1>n2&&n2<n3) {
		System.out.println(n1+n3);
	}
	if (n2>n3&&n3>n1) {
		System.out.println(n2+n3);
	}
	else {
		System.out.println(n2+n3);
	}
	}
}


