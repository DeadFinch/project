package pet;

public class Main {
	public static void main(String[] args) {
		
Animal d1 = new Dog();
Animal r1 = new Rat();
Animal c1=new Cat();

d1.setName("Buddy");
r1.setName("Squar");
c1.setName("Barsik");
d1.makeNoise("√ав");
r1.makeNoise("пи пи пи");
c1.makeNoise("м€у");
	}
}
