/**
 * Primera cifra
 * 
 * @author Raul Martin
 */
 public class Ejercicio18 {
	 public static void main(String[] args) {
		 System.out.print("Intruduce un numero de 5 cifras como maximo ");
		 int numero, primera = 0;
			numero = Integer.parseInt(System.console().readLine());
		 
		 if ( numero < 10) {
			 primera = numero;
		 }
		 if ((numero < 100) && (numero > 9)) {
			 primera = numero / 10;
		 }
		 if ((numero < 1000) && (numero > 99)) {
			 primera = numero / 100;
		 }
		 if ((numero < 10000) && (numero > 999)) {
			 primera = numero / 1000;
		 }
		 if ((numero < 100000) && (numero > 9999)) {
			 primera = numero / 10000;
		 } else {
			 System.out.println("Es superior a 5 cifras");
		 }
		 System.out.print("La primera cifra del numero es " + primera);
	 }
 }
