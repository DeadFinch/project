package belhard.homework.StringB;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	

static String a = "^([htps]{5}:\\/{2})*\\w+\\.[com]{3}$";
public static void main(String[] args) {
	//"^([htps]{5}:\\/{2})*\\w+\\.[com]{3}$"
	Scanner scan = new Scanner (System.in);
	System.out.println("введите наименование коммерческого сайта: ");
	String str = scan.nextLine();
	Pattern pattern = Pattern.compile("([htps]{5}:\\/{2})*\\w+\\.[com]{3}");
Matcher matcher = pattern.matcher(str);
	while(matcher.find())
	System.out.println(matcher.group());
	
}
}
