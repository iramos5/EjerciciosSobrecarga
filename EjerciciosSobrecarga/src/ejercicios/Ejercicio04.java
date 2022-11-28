package ejercicios;

public class Ejercicio04 {
	/* Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:
	La primera de las funciones recibirá un argumento de tipo entero que devuelva false si el argumento es 0 y true si el argumento es 1.
	La segunda de las funciones recibirá un argumento de tipo String que devuelva false si la cadena es igual a “false” y true si la cadena es igual a “true”.
	*/
	
	public static boolean parseToBoolean (int a) {
		a = 0;
		return false;
		// como return true??
	}
	
	public static boolean parseToBoolean (String a) {
		a = "false";
		
		if (a=="true") {
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		
	}

}
