//Luis Esteban Santamaria Blanco
//Problem 10919 - Prerequisites?
package MediumProblems;

import java.util.Scanner;

public class p10919 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * k -> Number of courses
		 * m -> Number of categories
		 * c -> Number of courses in the category
		 * r -> The minimun number of courses from the category that must be taken. And the c courses
		 */	
		//k m
		//Courses selected
		//c r courses
		int numCourses,numCategories;
		while(sc.hasNextLine()){
			boolean bandera = true;
			String[] entrada = sc.nextLine().split(" ");
			numCourses = Integer.parseInt(entrada[0]);
			if(numCourses==0) break;
			numCategories = Integer.parseInt(entrada[1]);
			String cursosSelected[] = sc.nextLine().split(" ");
			int count;
			for (int i = 0; i < numCategories; i++) {
				String categories[]  = sc.nextLine().split(" ");
				int numCourseCat = Integer.parseInt(categories[0]);
				int numMinCourses = Integer.parseInt(categories[1]);
				count = 0;
				for (int j = 2; j < categories.length; j++) {
					for (int j2 = 0; j2 < cursosSelected.length; j2++) {
						if (categories[j].equals(cursosSelected[j2])) {
							count++;
							if (count==numMinCourses) {
								break;
							}
						}
					}
					if (count==numMinCourses) {
						break;
					}
				}
				if (count<numMinCourses) {
					bandera = false;
				}
				
			}
			if (bandera) {
				System.out.println("yes");
			}
			else System.out.println("no");
			
		}
		sc.close();
		
		
	}

}
