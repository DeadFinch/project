package belhard.homework.part10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class TestWriteAndRead {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
		List<String> catalog = new ArrayList<>();
		catalog.add("D:\\Test1.txt");
		catalog.add("D:\\Test2.txt");
		catalog.add("D:\\Test3");
		try(BufferedWriter oos1 = new BufferedWriter(new FileWriter("D:\\Result.txt"))){
		for (String a: catalog) {
			try (BufferedReader oos = new BufferedReader(new FileReader(a))) {
				String s;
				while((s=oos.readLine())!=null){
								oos1.write(s);
								System.out.println("записано");}
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}} catch (IOException ex) {
			ex.printStackTrace();
	}
//		try(BufferedWriter oos = new BufferedWriter(new FileWriter("D:\\Result.txt"))){
//			for (String a: list) {
//					oos.write(a);
//					System.out.println("записано");}} catch (IOException ex) {
//					ex.printStackTrace();
//			}
		try(BufferedReader oos = new BufferedReader(new FileReader("D:\\Result.txt"))){
			System.out.println(oos.readLine());				
			}catch (IOException ex) {
				ex.printStackTrace();	
		}
	}
			
}
