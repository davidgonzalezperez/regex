package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in); 
//		
//		System.out.println("Introduce tu contraseña");
//		if (Pattern.matches("[a-zA-Z0-9]{8,}", sc.nextLine())) {
//			System.out.println("Su contraseña es correcta");
//		} else {
//			System.out.println("La contraseña debe incluir minúsculas, mayúsculas, números y tener 8 caracteres mínimo");
//		}
		
		Scanner scbound = new Scanner(System.in);
		System.out.println("Introduce la palabra que quieres buscar");
		String bound = "\\b*";
		String concatenado = bound+scbound.nextLine()+bound;
		Pattern pattern = Pattern.compile(concatenado, Pattern.CASE_INSENSITIVE);
		
		Scanner text = new Scanner(System.in);
		System.out.println("Introduce el texto");
		Matcher matcher = pattern.matcher(text.nextLine());		
		while (matcher.find())
		{
		 System.out.print("Start index: " + matcher.start());
		 System.out.print(" End index: " + matcher.end() + " ");
		 System.out.println(matcher.group());
		}
		
		
		
//        while (true) {    
//            System.out.println("Enter regex pattern:");  
//            Pattern pattern = Pattern.compile(sc.nextLine());    
//            System.out.println("Enter text:");  
//            Matcher matcher = pattern.matcher(sc.nextLine());    
//            boolean found = false;    
//            while (matcher.find()) {    
//                System.out.println("I found the text "+matcher.group()+" starting at index "+    
//                 matcher.start()+" and ending at index "+matcher.end());    
//                found = true;    
//            }    
//            if(!found){    
//                System.out.println("No match found.");    
//            }    
//        }    

	}

}
