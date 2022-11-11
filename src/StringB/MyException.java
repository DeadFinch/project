package belhard.homework.StringB;

public class MyException extends Exception {
	private int age;
	private String FIO;
	public int getAge() {
		return age;
	}
	
	public String getFIO() {
		return FIO;
	}
	public MyException (String massage, int num, String fio) {
		super(massage);
		age = num;
		FIO = fio;
	}

	
	}

