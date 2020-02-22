package EasyEasyProblems;

import java.util.Scanner;

public class UVA272 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		boolean bandera=true;
		while(sc.hasNextLine()) {
			s = sc.nextLine();
			
			
			for(int i=0;i<s.length();i++) {
			
				if (s.charAt(i)=='\u001a') {
					break;
				}
				
				if (s.charAt(i)=='\"') {
					if (bandera==true) {
						System.out.print("``");
						bandera=false;
						continue;
					}
					else {
						System.out.print("''");
						bandera=true;
						continue;
					}
				}
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
