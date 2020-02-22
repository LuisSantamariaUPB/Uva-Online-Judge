package EasyProblems;

import java.util.Scanner;

public class p12554 {

	public static void main(String[] args) {
		// Happy birthday to you! Happy birthday to you! Happy birthday to Rujia! Happy birthday to you!!!
		Scanner sc = new Scanner(System.in);
		//repeat the song until everyone has sung at least once 
		String song[] = {"Happy","birthday","to","you",
				"Happy","birthday","to","you",
				"Happy","birthday","to","Rujia",
				"Happy","birthday","to","you"};
		
		int N = Integer.parseInt(sc.nextLine());
		String personas[] = new String[N];
		
		for (int i = 0; i < N; i++) {
			personas[i] = sc.nextLine();
		}

		
		double m = Math.ceil(N/16.0);
		int x = (int) m;
		int r = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < 16; j++) {
				if (r==personas.length-1) {
					System.out.println(personas[r]+": "+song[j]);
					r = 0;
					continue;
				}
				System.out.println(personas[r]+": "+song[j]);
				r++;
			}
		}
	}

}
