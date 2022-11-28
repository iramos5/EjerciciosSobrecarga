package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	/* Diseña dos funciones de nombre suma que hagan lo siguiente:
	a) La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la suma de ambos. El valor a devolver también será entero.
	b) La segunda de las funciones recibirá dos argumentos de tipo double y devolverá la suma de ambos. El tipo a devolver debe ser también double.
	*/

	public static int suma (int a, int b) {
		return a+b;
	}
	
	public static double suma (double a, double b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		int numInt1, numInt2;
		double numDouble1, numDouble2;
		int resInt;
		double resDouble;
		
		Scanner scan = new Scanner (System.in);
		numInt1 = scan.nextInt();
		numInt2= scan.nextInt();
		numDouble1 = scan.nextDouble();
		numDouble2 = scan.nextDouble();
		
		resInt = suma (numInt1 + numInt2);
		resDouble = suma (numDouble1 + numDouble2);
		
		scan.close();
		

	}
	

}


