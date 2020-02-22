package EasyProblems;

import java.util.Scanner;

public class p621 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String texto = sc.nextLine();
			if (texto.equals("1")||texto.equals("4")||texto.equals("78")) {
				System.out.println("+");
				continue;
			}
			else if (texto.endsWith("35")) {
				System.out.println("-");
				continue;
			}
			else if (texto.startsWith("9")&&texto.endsWith("4")) {
				System.out.println("*");
			}
			else System.out.println("?");
		}
		sc.close();
	}

}
