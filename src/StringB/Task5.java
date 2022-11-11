package belhard.homework.StringB;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task5 {
	public static void main(String[] args) {
		String pat = "([12][0-9][0-9][0-9])\\/(([0][0-9])|(1[0-2]))\\/(0[1-9]|[12][0-9]|3[01]) (0[0-9]|1[0-2]:[0-5][0-9])";
		Scanner scan = new Scanner (System.in);
		Pattern pattern = Pattern.compile(pat);
		System.out.println("введите дату и время в следующем формате yyyy/mm/dd hh:mm: ");
			String date = scan.nextLine();
			Matcher matches = pattern.matcher(date);
			if (matches.find()) {
				System.out.println(date +" входит");
			}
			else {
				System.out.println(date + " не входит");
			}
	}

}
