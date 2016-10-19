/**
 * Calcular la media de 3 notas
 * 
 * @author Raul Martin
 */
public class Ejercicio08 {
	public static void main(String[] args) {
		System.out.println("Indica las notas de los tres examenes");
		System.out.print("Nota 1: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Nota 2: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		System.out.print("Nota 3: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		
		double media = (nota1 + nota2 + nota3)/3;
		System.out.print("Su media es de: ");
		System.out.println(media);
		
		if (media < 5) {
			System.out.println("Usted tiene un insuficiente");
		}
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
	}
}
