/**
 * Calcular la media de 3 notas
 * 
 * @author Raul Martin
 */
public class Ejercicio07 {
	public static void main(String[] args) {
		System.out.println("Indica las notas de los tres examenes");
		System.out.println("Nota 1: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Nota 2: ");
		double nota2 = Double.parseDouble(System.console().readLine());
		
		System.out.println("Nota 3: ");
		double nota3 = Double.parseDouble(System.console().readLine());
		
		double media = (nota1 + nota2 + nota3)/3;
		System.out.println("Su media es de: ");
		System.out.print(media);
	}
}
