/**
 * Ordenar Números
 * 
 * @author Raul Martin
 */
 public class Ejercicio13 {
	 public static void main(String[] args) {
		 System.out.println("Escribe 3 numeros");
		 System.out.print("a: ");
		 int a = Integer.parseInt(System.console().readLine());
		 System.out.print("b: ");
		 int b = Integer.parseInt(System.console().readLine());
		 System.out.print("c: ");
		 int c = Integer.parseInt(System.console().readLine());
		 
		 if ((a < b) && (a < c)) {
			 if (b < c) {
				 System.out.println(a +" < "+ b + " < " + c);
			 }
		 }
		 if ((a < b) && (a < c)) {
			 if (b > c) {
				 System.out.println(a + " < " + c + " < " + b);
			 }
		 }
		 if ((c < b) && (c < a)) {
			 if (b < a) {
				 System.out.println(c + " < " + b + " < " + a);
			 }
		 }
		 if ((b < c) && (b < a)) {
			 if (c < a) {
				 System.out.println(b + " < " + c + " < " + a);
			 }
		 }
		 if ((b < a) && (b < c)) {
			 if (a < c) {
				 System.out.println(b + " < " + a + " < " + c);
			 }
		 }
		 if ((c < a) && (c < b)) {
			 if (a < b) {
				 System.out.println(c + " < " + a + " < " + b);
			 }
		 }
	 }
 }		 
				 
				 
				 
				 
