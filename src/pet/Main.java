package pet;

public class Main {
	public static void main(String[] args) {
		
Animal d1 = new Dog();
Animal r1 = new Rat();
Animal c1=new Cat();

d1.setName("Buddy");
r1.setName("Squar");
c1.setName("Barsik");
d1.makeNoise("���");
r1.makeNoise("�� �� ��");
c1.makeNoise("���");
	}
}
