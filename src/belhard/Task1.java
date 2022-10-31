package belhard;

public class Task1 {
public static void main(String[] args) {
	int[]a= new int[4];
	System.out.println("Числа в массиве: ");
	for (int i=0;i<a.length;i++) {
		a[i]= (int) (10 + Math.random() * 90);
		System.out.print(a[i]+" ");
	}
			if (a[0]<a[1]&&a[1]<a[2]&&a[2]<a[3]) {
			System.out.println("\nмассив является строго возрастающей последовательностью");
			}
		else {
			System.out.println("\nмассив не является строго возрастающей последовательностью");
		
	}
}
}
