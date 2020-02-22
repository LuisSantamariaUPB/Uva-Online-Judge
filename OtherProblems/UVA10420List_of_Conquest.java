package OtherProblems;

import java.util.Scanner;
import java.util.TreeMap;

public class UVA10420List_of_Conquest {
	public static void main(String[] args) {
		TreeMap<String,Integer> map = new TreeMap<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			String[] line = scan.nextLine().trim().split(" ");
			if (!map.containsKey(line[0])) {
				map.put(line[0], 1);
			} else {
				int n2 = map.get(line[0]);
				map.put(line[0], ++n2);
			}
		}
		scan.close();
		for (String key : map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
		
	}
}
