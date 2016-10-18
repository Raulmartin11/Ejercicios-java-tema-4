/**
 * El tiempo que le queda a cenicienta
 * 
 * @author Raul Martin
 */
 public class Ejercicio11 {
	 public static void main(String[] args) {
		 System.out.println("Indica la hora que es, en digital");
		 System.out.print("Horas: ");
		 int hora = Integer.parseInt(System.console().readLine());
		 System.out.print("Minutos: ");
		 int minutos = Integer.parseInt(System.console().readLine());
		 
		 int medianoche = ( 86400 -(hora * 3600 + minutos * 60));		
		 System.out.print("A Cenicienta le quedan: ");
		 System.out.print( medianoche);
		 System.out.println(" segundos para volver a casa");

 }
}
 
