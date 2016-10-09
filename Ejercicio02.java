/**
 * Saber se es mañana tardde o noche
 * 
 * @author Raul Martin
 */
 
 public class Ejercicio02 {
	 public static void main(String[] args) {
		 
		 System.out.print("¿Que hora es?: ");
		 String linea = System.console().readLine();
		 double h = Integer.parseInt( linea );
		 
		 if (( 6 <= h ) && ( h < 12 )) {
			 System.out.println("Buenos Dias");
		 }
		 if (( 12 <= h ) && ( h < 20 )) {
			 System.out.println("Buenas Tardes");
		 }
		 if (( 20 <= h ) && ( h <= 24 ) || ( 0 <= h ) && ( h < 6 )) {
			 System.out.println("Buenas Noches");
		}
	 }
 }
