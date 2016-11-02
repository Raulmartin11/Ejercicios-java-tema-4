/**
 * Ultima cifra
 * 
 * @author Raul Martin
 */
 public class Ejercicio17 {
	 public static void main(String[] args) {
		 System.out.print("Intruduce un numero ");
		 int numero = Integer.parseInt(System.console().readLine());
		 
		 int modulo = numero % 10;
		 System.out.print("Su ultima cifra es ");
		 System.out.println(modulo);
	 }
 }
 
