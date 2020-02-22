package EasyEasyProblems;

import java.util.Scanner;

public class uva12279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int j = 0;
		int n = sc.nextInt();
		while(n!=0) {
			int x[] = new int[n];
			int emoogle = 0;
			for (int i = 0; i < n; i++) {
				x[i] = sc.nextInt();
				if (x[i]==0) emoogle--;
				else emoogle++;
			}
			j++;
			System.out.println("Case "+j+": "+emoogle);
			n = sc.nextInt();
		}
	
	}

}
