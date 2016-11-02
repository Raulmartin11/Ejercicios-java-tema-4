/**
 * Número capicua
 * 
 * @author Raul Martin
 */
 public class Ejercicio20 {
	 public static void main(String[] args) {
		 System.out.print("Intruduce un numero de 5 cifras como maximo para saber si es capicua ");
		 int numero, primera = 0, segunda = 0, tercera = 0, cuarta = 0, ultima = 0;
		 numero = Integer.parseInt(System.console().readLine());
		 
		 if ( numero < 10) {
			 primera = numero;
			 System.out.println("Todo los números de 1 digito son capicuas");
		 }
		 if ((numero < 100) && (numero > 9)) {
			 primera = numero / 10;
			 ultima = numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La ultima cifra del numero es " + ultima);
			 if (primera == ultima) {
				 System.out.println ("Este numero es capicua");
			 }
		 }
		 if ((numero < 1000) && (numero > 99)) {
			 primera = numero / 100;
			 segunda = (numero % 100) / 10;
			 ultima = numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La ultima cifra del numero es " + ultima);
			 if (primera == ultima) {
				 System.out.println ("Este numero es capicua");
			 }
		 }
		 if ((numero < 10000) && (numero > 999)) {
			 primera = numero / 1000;
			 segunda = (numero % 1000) / 100;
			 tercera = (numero % 100) / 10;
			 ultima = numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La tercera cifra del numero es " + tercera);
			 System.out.println("La ultima cifra del numero es " + ultima);
			 if ((primera == ultima) && (segunda == tercera)) {
				 System.out.println ("Este numero es capicua");
			 }
		 }
		 if ((numero < 100000) && (numero > 9999)) {
			 primera = numero / 10000;
			 ultima = numero % 10;
			 segunda = (numero % 10000) / 1000;
			 tercera = (numero % 1000) / 100;
			 cuarta = (numero % 100) / 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La tercera cifra del numero es " + tercera);
			 System.out.println("La cuarta cifra del numero es " + cuarta);
			 System.out.println("La ultima cifra del numero es " + ultima);
			 if ((primera == ultima) && (segunda == cuarta)) {
				 System.out.println ("Este numero es capicua");
			 }
		 }
	 }
 }
