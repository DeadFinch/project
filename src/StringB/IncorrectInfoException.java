package belhard.homework.StringB;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IncorrectInfoException {
	 public static String getIIE(String FIO,int num) throws MyException{
	     
	       Pattern pattern = Pattern.compile("^[а-яА-Я]+ [а-яА-Я]+ [а-яА-Я]+$");
	       Matcher matcher = pattern.matcher(FIO);
	        if(num<0||num>100||FIO.length()>100||matcher.find()==false) throw new MyException("incorrect age or FIO", num, FIO);
	         
	        
	        return FIO+" "+num+" лет";
	    }
	 public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Введите ФИО через пробел и возраст: ");
        String fio = scan.nextLine();
        int age = scan.nextInt();
		    try{
		        String result = IncorrectInfoException.getIIE(fio,age);
		        System.out.println(result);
		    }
		    catch(MyException ex){
		         
		        System.out.println(ex.getMessage());
		       
		    }
		} 
}
