package belhard.homework.StringB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	static String st = "ahb acb aeb aeeb adcb axeb";
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("a.+b");
		Matcher matcher = pattern.matcher(st);
			while(matcher.find())
			System.out.println(matcher.group());
	}

}
