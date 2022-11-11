package belhard.homework.StringB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	static String st = "'ab abab abab abababab abea";
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("ab+(\\w+)?");
		Matcher matcher = pattern.matcher(st);
			while(matcher.find())
			
			System.out.println(matcher.group());
	}

}
