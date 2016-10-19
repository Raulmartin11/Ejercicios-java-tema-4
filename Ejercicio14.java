/**
 * Numeros pares o impares y/o divisibles entre 5
 * 
 * @author Raul Martin
 */
public class Ejercicio14 {
	public static void main(String[] args) {
	
	System.out.print("Intruduce un numero: ");
	int numero= Integer.parseInt(System.console().readLine());
	
	if(numero % 5 == 0) {
		System.out.println("Este numero es divisible entre 5");
	}
	if(numero % 2 == 0) {
		System.out.println("Este numero es par");
		} else {
			System.out.println("Este numero es impar");
		}
	}
}
