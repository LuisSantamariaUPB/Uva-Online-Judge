package EasyEasyProblems;

import java.util.Scanner;

public class UVA11727Cost_Cutting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int n1, n2, n3;
		int max, min, medium;
		
		for (int i = 0; i < n; i++) {
			max = 0;
			min = 1000000;
			n1= scan.nextInt();
			n2= scan.nextInt();
			n3= scan.nextInt();
			max = Math.max(n1, Math.max(n2, n3));
			min = Math.min(n1, Math.min(n2, n3));
			
			if (n1!=max&&n1!=min) {
				System.out.println("Case "+(i+1)+": "+n1);
			} else if (n2!=max&&n2!=min) {
				System.out.println("Case "+(i+1)+": "+n2);
			} else if (n3!=max&&n3!=min) {
				System.out.println("Case "+(i+1)+": "+n3);
			}
			
		}
		scan.close();

	}

}
