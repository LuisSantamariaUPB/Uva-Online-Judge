package EasyEasyProblems;

import java.util.Scanner;

public class UVA10550_CombinationLook {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int p0;
		int p1;
		int p2;
		int p3;
		while (scan.hasNextLine()) {
			String [] p = scan.nextLine().split(" ");
			p0 = Integer.parseInt(p[0]);
			p1 = Integer.parseInt(p[1]);
			p2 = Integer.parseInt(p[2]);
			p3 = Integer.parseInt(p[3]);
			int degreePerPos = 360/40;
			
			if (p0==0 && p1==0 && p2==0 && p3==0) {
				break;
			}
			//turn 3 times
			int count = 120;
			
			if (p1>p0) {
				count+=40-p1+p0;
			} else {
				count+=p0-p1;
			}
			
			if (p2>p1) {
				count+=(p2-p1);
			} else {
				count+=40-p1+p2;
			}
			
			if (p3>p2) {
				count+=40-p3+p2;
			} else {
				count+=p2-p3;
			}
			
			System.out.println(count*degreePerPos);
		}
		
		
	}
}
