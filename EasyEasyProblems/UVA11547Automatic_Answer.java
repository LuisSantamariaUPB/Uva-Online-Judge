package EasyEasyProblems;

import java.util.Scanner;

public class UVA11547Automatic_Answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int numero;
		for (int i = 0; i < n; i++) {
			numero = scan.nextInt();
			numero *= 567;
			numero /= 9;
			numero += 7492;
			numero *= 235;
			numero /= 47;
			numero -= 498;
			
			numero/=10;
			System.out.println(Math.abs(numero%10));
		}

	}

}
