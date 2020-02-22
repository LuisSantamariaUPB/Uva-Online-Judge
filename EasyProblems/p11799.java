package EasyProblems;

import java.util.Scanner;

public class p11799 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int S = sc.nextInt();
			int max = 1;
			for (int j = 0; j < S; j++) {
				int R = sc.nextInt();
				if (R>max) {
					max = R;
				}
			}
			System.out.println("Case "+(i+1)+": "+max);
		}
		sc.close();
	}

}
