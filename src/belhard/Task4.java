package belhard;

import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("������� ������ �������: ");
	int n = s.nextInt();
	System.out.println("������� ������ �������� ��������: ");
	int min = s.nextInt();
	System.out.println("������� ������� �������� ��������: ");
	int max = s.nextInt()+1;
	int []a = new int[n];
	int j;
	int m=0;
	
	for (int i = 0; i<a.length;i++) {
		if (i==0) {System.out.println("���� ��������:");}
		a[i]=(int) (Math.random()*(max-min)+min);
	System.out.print(a[i]+" ");}
	
	for (int z =0;z<a.length;z++) {
	for (int k = 0; k<a.length-z-1;k++) {
	if (a[k]>=a[k+1]) {
		j=a[k];
		a[k]=a[k+1];
		a[k+1]=j;
		}
		}
			}
	System.out.println("\n��������������� ��������: ");
	do{
		System.out.print(a[m]+" ");
		m++;
	}while(m<a.length);
	}
	}


