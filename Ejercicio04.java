/**
* Salario semanal ampliado
* 
* @author Raul Martin
*/

public class Ejercicio04 {
	public static void main(String[] args) {
		
		String linea;
		
		System.out.print("Numero de horas trabajadas: ");
		linea = System.console().readLine();
		int horas = Integer.parseInt( linea );
		
		if ( horas >= 41 ) {
			int extra = ((( horas - 40 ) * 16 ) + ( 40 * 12 ));
			System.out.print("Tu salario sera de: ");
			System.out.println(extra);
		}
		if ( horas < 41 ) {
			int base = ( horas * 12 );
			System.out.print("Tu salario sera de: ");
			System.out.println(base);
		}
	}
}
