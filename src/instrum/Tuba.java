package belhard.homework.instrum;

public class Tuba implements Instrument {
int diameter;
Tuba (int diameter) {
	this.diameter = diameter;
}
public void play(){
	System.out.println(KEY+" играет тюба диаметром "+diameter+" см");
}

}
