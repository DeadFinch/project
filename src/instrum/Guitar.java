package belhard.homework.instrum;

public class Guitar implements Instrument  {
int numberString;
Guitar(int numberString){
	this.numberString = numberString;
}
public void play(){
	System.out.println(KEY+" играет гитара "+numberString+" струнная");
}
}
