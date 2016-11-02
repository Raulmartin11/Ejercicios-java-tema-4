/**
 * Calcular la media del trimestre
 * 
 * @author Raul Martin
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		System.out.println("Indica las notas de los dos examenes");
		System.out.print("Nota 1: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Nota 2: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		double media = (nota1 + nota2)/2;
		
		if (media < 5) {
			System.out.print("Di la nota de tu recuperacion(apto/no apto) ");
			String recuperacion = System.console().readLine().toUpperCase();
			
			if(recuperacion.equals ("APTO")) {
				System.out.println("tu nota es 5");
			}
			if (recuperacion.equals ("NO APTO")) {
				System.out.print("Tu nota final es ");
				System.out.println(media);
			}
		} else {
			if ((media >= 5) && (media < 6)) {
				System.out.println("Usted tiene un suficiente");
			}
			if ((media >= 6) && (media < 7)) {
				System.out.println("Usted tiene un bien");
			}
			if ((media >= 7) && (media < 9)) {
				System.out.println("Usted tiene un notable");
			}
			if (media >= 9) {
				System.out.println("Usted tiene un sobresaliente");
			}
					System.out.print("Su media es de: ");
		System.out.println(media);
		}
	}
}
