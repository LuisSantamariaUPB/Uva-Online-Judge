import java.util.Scanner;

public class greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			int n = s.length();
			String h = "h";
			String array[] = new String[1000];
			if (array[n]!=null) {
				System.out.println(h);
			}
			else {
				for (int i = 0; i < 2*(n-2); i++) {
					h += "e";
				}
				h += "y";
				array[n] = h;
				System.out.println(h);
			}
			
			
			
			
		}
		
	}

}
