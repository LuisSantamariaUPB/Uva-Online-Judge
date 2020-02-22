package EasyEasyProblems;

import java.util.Scanner;

public class UVA1104 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num1;
		int num2;
		
		
		for (int i = 0; i < n; i++) {
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			System.out.println((int)(Math.ceil(num1/3) * Math.ceil(num2/3)));
		}

	}

}
