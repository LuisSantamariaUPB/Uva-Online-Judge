package EasyEasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uva12289 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		String one = "one";
		String two = "two";
		
		
		for (int i = 0; i < n; i++) {
			int c1=0,c2=0;
			String palabra = br.readLine();
			if (palabra.length()==5) {
				System.out.println(3); continue;
			}
			if (palabra.length()==3) {
				for (int j = 0; j < palabra.length(); j++) {
					
					if (one.charAt(j)==palabra.charAt(j)) {
						c1++;
					}
					if (two.charAt(j)==palabra.charAt(j)) {
						c2++;
					}
				}
				if (c1>c2) {
					System.out.println(1);
				} else System.out.println(2);
			}
			
		}
		
		
	}

}
