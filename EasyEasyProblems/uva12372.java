package EasyEasyProblems;

import java.util.Scanner;

public class uva12372 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int p0,p1,p2;
			sc.nextLine();
		for (int i = 0; i < n; i++) {
			String [] p = sc.nextLine().split(" ");
			p0 = Integer.parseInt(p[0]);
			p1 = Integer.parseInt(p[1]);
			p2 = Integer.parseInt(p[2]);
			if (p0>20||p1>20||p2>20) {
				System.out.println("Case "+(i+1)+": bad");
			}
			else System.out.println("Case "+(i+1)+": good");
			
		}
		sc.close();
	}

}
