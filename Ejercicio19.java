/**
 * Primera cifra
 * 
 * @author Raul Martin
 */
 public class Ejercicio19 {
	 public static void main(String[] args) {
		 System.out.print("Intruduce un numero de 5 cifras como maximo ");
		 double numero, primera = 0, segunda = 0, tercera = 0, cuarta = 0, ultima = 0;
		 numero = Double.parseDouble(System.console().readLine());
		 
		 numero = Math.sqrt(numero *numero);
		 
		 if ( numero < 10) {
			 primera = (int)numero;
			 System.out.println("La primera cifra del numero es " + primera);
		 }
		 if ((numero < 100) && (numero > 9)) {
			 primera = (int)numero / 10;
			 ultima = (int)numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La ultima cifra del numero es " + ultima);
		 }
		 if ((numero < 1000) && (numero > 99)) {
			 primera = (int)numero / 100;
			 segunda = (int)(numero % 100) / 10;
			 ultima = numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La ultima cifra del numero es " + ultima);
		 }
		 if ((numero < 10000) && (numero > 999)) {
			 primera = (int)numero / 1000;
			 segunda = (int)(numero % 1000) / 100;
			 tercera = (int)(numero % 100) / 10;
			 ultima = (int)numero % 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La tercera cifra del numero es " + tercera);
			 System.out.println("La ultima cifra del numero es " + ultima);
		 }
		 if ((numero < 100000) && (numero > 9999)) {
			 primera = (int)numero / 10000;
			 ultima = (int)numero % 10;
			 segunda = (int)(numero % 10000) / 1000;
			 tercera = (int)(numero % 1000) / 100;
			 cuarta = (int)(numero % 100) / 10;
			 System.out.println("La primera cifra del numero es " + primera);
			 System.out.println("La segunda cifra del numero es " + segunda);
			 System.out.println("La tercera cifra del numero es " + tercera);
			 System.out.println("La cuarta cifra del numero es " + cuarta);
			 System.out.println("La ultima cifra del numero es " + ultima);
		 }
	 }
 }
