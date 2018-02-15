package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Pattern.matches("..s", "a$s"));//true (2nd char is s)  
		System.out.println(Pattern.matches("[amn]{2}", "ab"));
		System.out.println(Pattern.matches("[A]{1}\\D{5,10}", "Adg$ees"));
		
		String data1 = "Today, java is object oriented language (ajavas)";
	       
		String regex = "\\b*java\\b*";
		 
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(data1);
		while (matcher.find())
		{
		 System.out.print("Start index: " + matcher.start());
		 System.out.print(" End index: " + matcher.end() + " ");
		 System.out.println(matcher.group());
		}


	}

}
