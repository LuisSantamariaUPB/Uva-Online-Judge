package EasyProblems;

import java.util.Scanner;

public class p11332 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n!=0) {
			System.out.println(sumaDigitos(n));
			n = sc.nextInt();
		}
		
	}
	
	public static int sumaDigitos(int n) {
		int sum = 0;
		for (int i = n; i!=0; i/=10) {
			sum += i%10;
		}
		if(sum<10) return sum;
		return sumaDigitos(sum);
		
	}

}
