package belhard.homework.instrum;

public class Drum implements Instrument {
int size;
Drum (int size){
	this.size = size;
}
public void play(){
	System.out.println(KEY+" играют барабаны размером "+size);
}
}
