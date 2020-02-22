package EasyProblems;

import java.util.Scanner;

public class p12503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < N; i++) {
			int Cases = Integer.parseInt(sc.nextLine());
			int p = 0;
			int casos[] = new int[Cases];
			for (int j = 0; j < Cases; j++) {
				String r = sc.nextLine();
				if (r.equals("LEFT")) {
					p--;
					casos[j] = -1;
				}
				else if (r.equals("RIGHT")) {
					p++;
					casos[j] = +1;
				}
				else if(r.contains("SAME AS")) {
					String per[] = r.split(" ");
					int x = Integer.parseInt(per[2]);
					x--;
					p += casos[x]; //10 : SAME AS 1 (LEFT)
					casos[j] = casos[x]; // 16 : SAME AS 10 (SAME AS 1) (LEFT)
				}
			}
			System.out.println(p);
		}
	}

}
