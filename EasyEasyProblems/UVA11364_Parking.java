package EasyEasyProblems;

import java.util.Scanner;

public class UVA11364_Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		int testcases = scan.nextInt();
		for (int i = 0; i < testcases; i++) {
			int max = 0;
			int min = 100;
			int n = scan.nextInt();
			for (int j = 0; j < n; j++) {
				int temp = scan.nextInt();
				if (temp < min) {
					min = temp;
				}
				if (temp > max) {
					max = temp;
				}
				
			}
			System.out.println((max-min)*2);
		}
	}

}
