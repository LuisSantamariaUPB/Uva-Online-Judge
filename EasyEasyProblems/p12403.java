package EasyEasyProblems;

import java.util.Scanner;

public class p12403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String text;
		int donating=0;
		sc.nextLine();
	for (int i = 0; i < n; i++) {
		String [] p = sc.nextLine().split(" ");
		if (p[0].equals("donate")) {
			donating+= Integer.parseInt(p[1]);
		}
		if (p[0].equals("report")) {
			System.out.println(donating);
		}
	}
	sc.close();
	}

}
