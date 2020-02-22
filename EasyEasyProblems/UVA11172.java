package EasyEasyProblems;

import java.util.Scanner;

public class UVA11172 {

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		for (int i = 0; i <n; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			if (num1<num2) {
				System.out.println("<");
			}
			else if (num1>num2) {
				System.out.println(">");
			}
			else
				System.out.println("=");
		}
		
		
	}
}
