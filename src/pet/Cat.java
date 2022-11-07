package pet;

public class Cat extends Animal {


@Override
public void makeNoise(String noise) {
	
	System.out.println(getName() + " "+noise);
	
}
}
