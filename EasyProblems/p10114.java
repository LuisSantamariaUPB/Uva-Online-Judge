package EasyProblems;

import java.util.Scanner;

public class p10114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Duration in months of the loan (préstamo)
		//the down payment /pago inicial
		//el monto del préstamo
		//Cantidad de registros de depreciación que siguen
		
		
		//Valor del carro = monto del prestamo mas pago inicial
		/*
					 Sample Input
			30 500.0 15000.0 3
			0 .10
			1 .03
			3 .002
			12 500.0 9999.99 2
			0 .05
			2 .1
			60 2400.0 30000.0 3
			0 .2
			1 .05
			12 .025
			-99 0 17000 1
			
			Sample Output ----------------
			4 months
			1 month
			49 months 
		 * */
		Scanner sc = new Scanner(System.in);
		int canRegistros = 0;
		while(canRegistros>=0) {
			String p[] = sc.nextLine().split(" ");
			int duracionPrestamo = Integer.parseInt(p[0]);
			float pagoInicial = Float.parseFloat(p[1]);
			float montoPrestamo = Float.parseFloat(p[2]);
			canRegistros = Integer.parseInt(p[3]);
			
			float valorCarro = montoPrestamo;
			valorCarro+=pagoInicial;
			int[] regm = new int[canRegistros];
			float[] valpor = new float[canRegistros];
			
			for (int i = 0; i < canRegistros; i++) {
				String p2[] = sc.nextLine().split(" ");
				regm[i] = Integer.parseInt(p2[0]);
				valpor[i] = Float.parseFloat(p2[1]);
				
			}
			
			float actualval = valpor[0];
			int x = 0;
			for (int i = 0; i < duracionPrestamo; i++) {
				if (x+1!=canRegistros) {
					if (regm[x+1]==i) {
						actualval = valpor[x+1];
						x++;
						
					}
				}
				
				
				valorCarro-=(valorCarro*actualval);
				if(i!=0) montoPrestamo-=pagoInicial;
				
				
				if (valorCarro>montoPrestamo) {
					System.out.println(valorCarro+" "+montoPrestamo);
					if (i>1) {
						System.out.println(i+" months");
					}
					else System.out.println(i+" month");
					
					break;
				}
				
			}
			
		}
		sc.close();
		
		
	}

}
