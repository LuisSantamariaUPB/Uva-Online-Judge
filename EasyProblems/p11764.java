package EasyProblems;

import java.util.Scanner;

public class p11764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			int Jumps = sc.nextInt();
			int arreglo[] = new int[Jumps];
			int countUP = 0;
			int countDOWN = 0;
			for (int j = 0; j < Jumps; j++) {
				arreglo[j] = sc.nextInt();
			}
			for (int j = 0; j < Jumps-1; j++) {
				if (arreglo[j]<arreglo[j+1]) {
					countUP++;
				}
				if (arreglo[j]>arreglo[j+1]) {
					countDOWN++;
				}
			}
			System.out.println("Case "+(i+1)+": "+countUP+" "+countDOWN);
			
		}
		sc.close();
		
	}

}
