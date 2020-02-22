package EasyProblems;

import java.util.Scanner;

public class p12157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int countMile=0;
			int countJuice=0;
			int  nLlamadas = sc.nextInt();
			for (int j = 0; j < nLlamadas; j++) {
				int llamada = sc.nextInt();
				countMile+=((llamada/30)+1)*10;
				countJuice+=((llamada/60)+1)*15;
				
			}
			System.out.print("Case "+(i+1)+": ");
			if(countMile>countJuice) System.out.println("Juice "+countJuice);
			else if(countMile<countJuice) System.out.println("Mile "+countMile);
			else System.out.println("Mile Juice "+countMile);
		}
	}
	/*
	public static int Mile(int n) {
	
		if (n<30) {
			return 10;
		}
		else {
			return 10+Mile(n-30);
		}
	}
	public static int Juice(int m) {
		int suma = 15;
		if (m<60) {
			System.out.println(suma);
			return suma;
		}
		else {
			System.out.println(suma);
			return suma+Mile(m-60);
		}
	}
	*/

}
