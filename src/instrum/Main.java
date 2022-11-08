package belhard.homework.instrum;

public class Main {
	public static void main(String[] args) {
		int i = 0;
		
	Instrument[]instrument= new Instrument[3];
	instrument[i]=new Guitar(6);
	instrument[++i]=new Drum(12);
	instrument[++i]=new Tuba(8);
	for (int j = 0;j<instrument.length;j++) {
		instrument[j].play();
	}
}

}
