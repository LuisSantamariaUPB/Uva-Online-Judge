package EasyEasyProblems;

import java.util.Scanner;

public class UVA11498_DivisionOfNlogonia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n, divisionX, divisionY;
		int coordenadeX, coordenadeY;
		while (scan.hasNextLine()) {
			n = scan.nextInt();
			if (n==0) {
				break;
			}
			divisionX = scan.nextInt();
			divisionY= scan.nextInt();
			for (int i = 0; i < n; i++) {
				coordenadeX = scan.nextInt();
				coordenadeY = scan.nextInt();
				if (coordenadeX==divisionX||coordenadeY==divisionY) {
					System.out.println("divisa");
				} else if (coordenadeX<divisionX&&coordenadeY>divisionY) {
					System.out.println("NO");
				} else if (coordenadeX>divisionX&&coordenadeY>divisionY) {
					System.out.println("NE");
				} else if (coordenadeX>divisionX&&coordenadeY<divisionY) {
					System.out.println("SE");
				} else {
					System.out.println("SO");
				}


			}

		}
		scan.close();


	}

}
