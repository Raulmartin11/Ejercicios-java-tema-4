/**
 * Resolver ecuacion de 2º grado  //axº2 + bx + c =0
 * 
 * @author Raul Martin
 */
 public class Ejercicio09 {
	 public static void main(String[] args) {
		 System.out.println("Indique los valores de las incognitas para resolver la ecuacion axº2 + bx + c = 0");
		 System.out.print("Valor de a: ");
		 double a = Double.parseDouble(System.console().readLine());
		 
		 System.out.print("Valor de b: ");
		 double b = Double.parseDouble(System.console().readLine());
		 
		 System.out.print("Valor de c: ");
		 double c = Double.parseDouble(System.console().readLine());
		 
		 double x1 = ((-(b) + (Math.sqrt( b * b -(4 * a * c)))) / (2 * a));
		 double x2 = ((-(b) - (Math.sqrt( b * b -(4 * a * c)))) / (2 * a));
		 System.out.print(" Los valor de x son: " + x1);
		 System.out.print(" y " + x2);
		 if (a == 0 ) {
			 System.out.print(" \n Esta no es una ecuacion de 2º grado");
		 }
	 }
 }
