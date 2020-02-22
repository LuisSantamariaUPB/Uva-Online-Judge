package MediumProblems;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class p119 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		while(sc.hasNext()) {
			int N = Integer.parseInt(sc.nextLine());
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			String [] nombres = sc.nextLine().split(" ");
			int [] bolsillos = new int[N];
			for (int i = 0; i < N; i++) {
				map.put(nombres[i], 0);
			}
			
			for (int i = 0; i < N; i++) {
				String []linea = sc.nextLine().split(" ");
				int actualValue = map.get(linea[0]);
				int value = Integer.parseInt(linea[1]);
				int persons = Integer.parseInt(linea[2]);
				actualValue -= value;
				if (persons==0) {
					continue;
				}
				int residuo = value%persons;
				
				map.replace(linea[0], actualValue+residuo);
				actualValue = (int) (value/persons); 
				
				for (int j = 0; j < persons; j++) {
					value = map.get(linea[j+3]);
				map.replace(linea[j+3], value+actualValue);	
				}
				
			}
			
			if (counter>0) System.out.println();
			counter++;
			for (int i = 0; i < N; i++) {
				System.out.println(nombres[i]+" "+map.get(nombres[i]));
			}
			map.clear();
			
		}
		sc.close();
	}

}
