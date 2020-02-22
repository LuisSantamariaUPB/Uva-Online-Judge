package EasyProblems;

import java.util.Scanner;

public class p12015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < N; i++) {
			int max = 0;
			String arreglo[] = new String[100];
			for (int j = 0; j <10; j++) {
				
				String line[] = sc.nextLine().split(" ");
				String r = line[0];
				int value = Integer.parseInt(line[1]);
				if (value>max) {
					max = value;
				}
				if (arreglo[value]==null) {
					arreglo[value] = r;
				}
				else {
					arreglo[value]+="\n"+r;
				}
			}
			System.out.println("Case #"+(i+1)+":\n"+arreglo[max]);
		}
	}

}
