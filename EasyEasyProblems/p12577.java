package EasyEasyProblems;

import java.util.Scanner;

public class p12577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	
		String text;
		int countTest=0;
	while(sc.hasNextLine()) {
		text = sc.nextLine();
		if (text.equals("Hajj")) {
			System.out.println("Case "+(++countTest)+": Hajj-e-Akbar");
		} else if (text.equals("Umrah")) {
			System.out.println("Case "+(++countTest)+": Hajj-e-Asghar");
		}
	}
	sc.close();
	}

		
}
