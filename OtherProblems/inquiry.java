import java.util.Scanner;

public class inquiry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int arreglo[] = new int[n];
		int maximo = 0;
		int sumas = 0;
		int resultado = 0;
		int cuadrados = 0;
		for (int i = 0; i < n; i++) {
			arreglo[i] = Integer.parseInt(sc.nextLine());
			sumas += arreglo[i];
		}
		for (int i = 0; i < n-1; i++) {
			cuadrados+= (arreglo[i]*arreglo[i]);
			sumas-= arreglo[i];
			resultado = cuadrados*sumas;
			if (resultado>maximo) {
				maximo = resultado;
			}
		}
		System.out.println(maximo);
		
		
	}
	
}
