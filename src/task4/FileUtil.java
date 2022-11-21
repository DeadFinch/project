package belhard.task4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileUtil {
	
		
	
	public static boolean setReader(List<Reader> readers) throws FileNotFoundException  {
		try{ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Reader.txt"));
		oos.writeObject(readers);
		oos.close();
		
		}
		catch(IOException ex){ex.printStackTrace();}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public static List<Reader> readReader(Object readers) throws FileNotFoundException  {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Reader.txt"))) {
			readers= ois.readObject();
			
			
		} catch(Exception ex){
            
          System.out.println(ex.getMessage());
      } 
		
		return ((List<Reader>) readers);
		
	}


}