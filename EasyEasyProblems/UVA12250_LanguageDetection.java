package EasyEasyProblems;

import java.util.Scanner;

public class UVA12250_LanguageDetection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;
		String s; 
		do {
			s=scan.nextLine();
			if (s.equals("HELLO")) {
				System.out.println("Case "+i+": ENGLISH");
			}
			else if (s.equals("HOLA")) {
				System.out.println("Case "+i+": SPANISH");
			}
			else if (s.equals("BONJOUR")) {
				System.out.println("Case "+i+": FRENCH");
			}
			else if (s.equals("HALLO")) {
				System.out.println("Case "+i+": GERMAN");
			}
			else if (s.equals("CIAO")) {
				System.out.println("Case "+i+": ITALIAN");
			}
			else if (s.equals("ZDRAVSTVUJTE")) {
				System.out.println("Case "+i+": RUSSIAN");
			}
			else if (s.equals("#")) {
				break;
			}
			else
				System.out.println("Case "+i+": UNKNOWN");
			i++;
		} while (true);
	
	}

}
