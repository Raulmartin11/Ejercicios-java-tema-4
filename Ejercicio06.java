/**
 * cuanto tarda un objeto en caer desde una altura
 * 
 * @author Raul Martin
 */
 public class Ejercicio06 {
	 public static void main(String[] args) {
		 System.out.println("Indica la altura desde la que esta el objeto");
		 int h = Integer.parseInt(System.console().readLine());
		 double g = 9.81;
		 
		 if (h >= 0) {
			 double t = Math.sqrt(2*(h)/g);
			 System.out.println("El objeto tarda en llegar al suelo: ");
			 System.out.print(t);
		 }
		 
		 else {
			 System.out.println("La altura no puede ser negativa");
		 }
	 }
 }
