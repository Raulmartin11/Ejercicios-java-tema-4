/**
 * Resuelve la ecuacion de primer grado
 * 
 * @author Raul Martin
 */
 public class Ejercicio05 {
	 public static void main(String[] args) {
		 System.out.println("Indica los valores de la siguiente ecuacion: ax + b = 0");
		 System.out.print("Valor de a: ");
		 int a = Integer.parseInt(System.console().readLine());
		 
		 System.out.print("Valor de b: ");
		 int b = Integer.parseInt(System.console().readLine());
		 
		 double x = -(b)/(a);
		 
		 System.out.println("El valor de x es: ");
		 System.out.print(x);
	 }
 }
