package EasyProblems;

import java.util.Scanner;

public class p12468 {

	public static void main(String[] args) {
		// ZAPPING
		
		Scanner sc = new Scanner(System.in);
		
		String s[] = sc.nextLine().split(" ");
		int p0 = Integer.parseInt(s[0]);
		int p1 = Integer.parseInt(s[1]);
		while (p0!=-1&&p1!=-1) {
			int min = Math.abs(p0-p1);
			int op = 0;
			if (p0>p1) {
				op = (Math.abs(0-p1)+100-p0);
				if (min>op) {
					min = op;
				}
			}
			else {
				op = (Math.abs(0-p0)+100-p1);
				if (min>op) {
					min = op;
				}
			}
			
			System.out.println(min);
			s = sc.nextLine().split(" ");
			p0 = Integer.parseInt(s[0]);
			p1 = Integer.parseInt(s[1]);
			
		}
	}

}
