package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p10963 {

	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) { 
			String s = sc.nextLine();
			String linea= "";
			char nextChar = '\0';
			for (int i = 0; i <s.length(); i++) {
				if (s.charAt(i)==' ') {
					linea+="0";
				}else if (s.charAt(i)=='o') {
					linea+="1";
				}
			}
			if (linea.length()==8) {
				nextChar = (char)Integer.parseInt(linea, 2);
				linea = "";
				linea+= nextChar;
				
				System.out.print(linea);
			}
			
		}
		sc.close();
	}

}
