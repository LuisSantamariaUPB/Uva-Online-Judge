package EasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11559 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while (true){
		String t = in.readLine();
			if(t == null || t.isEmpty()) break;
			String s[] = t.split(" ");
			int students = Integer.parseInt(s[0]);
			int budget = Integer.parseInt(s[1]);
			int hotels = Integer.parseInt(s[2]);
			int weeks = Integer.parseInt(s[3]);
			int result[] = new int[hotels];
			int count = 0;
			for (int i = 0; i < hotels; i++) {
				
				int pricePerson = Integer.parseInt(in.readLine());
				String beds[] = in.readLine().split(" ");
				for (int j = 0; j < weeks; j++) {
					
					
					if (Integer.parseInt(beds[j])>=students) {
						if (pricePerson*students<=budget) {
							result[count] = pricePerson*students;
							count++;
							break;
						}
							
					}  
				}
			}
			int res =result[0];
            if (count > 0)  {
               for(int i=0;i<count;i++)
                  res = Math.min(res,result[i]);
               System.out.println(res);
            }
            else
                System.out.println("stay home");

		}
	}

}
