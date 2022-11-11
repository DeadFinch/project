package belhard.homework.StringB;

public class Task1 {
	public static void main(String[] args) {
		
	int a = 3;
	int b = 56;
	StringBuilder strB = new StringBuilder();
	strB.append(String.format("\n%d+%d=%d",a,b,a+b));
	strB.append(String.format("\n%d-%d=%d",a,b,a-b));
	strB.append(String.format("\n%d*%d=%d",a,b,a*b));
	System.out.println(strB);
	for (int i=0; i<strB.length();i++) {
		if (strB.charAt(i)=='=') {
			strB.replace(i,i+1, "равно");
			
		}
	}
	System.out.println(strB);
	}
}
