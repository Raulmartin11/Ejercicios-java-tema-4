/**
 * IVA concreto
 * 
 * @author Raul Martin
 */
 public class Ejercicio23 {
	 public static void main(String[] args) {
		 System.out.print("Introduzca el valor de la base imponible ");
		 double base = Integer.parseInt(System.console().readLine());
		 System.out.print("Introduzca el tipo de IVA (general, reducido o super reducido)");
		 String iva = System.console().readLine().toLowerCase();
		 System.out.print("Introduzca el codigo promocional(nopro, mitad, meno5 o 5porc)");
		 String codigo = System.console().readLine().toLowerCase();
		 double precio = 0;
		 
		 if (iva.equals("general")) {
			 precio+= base * 1.21;
		 }
		 
		 if (iva.equals("reducido")) {
			 precio+= base * 1.1;
		 }
		 
		 if (iva.equals("super reducido")) {
			 precio+= base * 1.04;
		 }
		 if (codigo.equals("nopro")) {
			 double total = precio;
			 System.out.print("El articulo costará " + total);
		 }
		 if (codigo.equals("mitad")) {
			 double total = precio/2;
			 System.out.print("El articulo costará " + total);
		 }
		 if (codigo.equals("meno5")) {
			 double total = precio - 5;
			 System.out.print("El articulo costará " + total);
		 }
		 if (codigo.equals("5porc")) {
			 double total = precio * 0.95;
			 System.out.print("El articulo costará " + total);
		 }
	 }
 }
