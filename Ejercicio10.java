/**
 * Horoscopo
 * 
 * @author Raul Martin
 */
 public class Ejercicio10 {
	 public static void main(String[] args) {
		 System.out.println("Intuduzca su cumpleaños para saber su horoscopo");
		 System.out.print("Diga su mes de nacimiento: ");
		 String mes = System.console().readLine().toUpperCase();
		 System.out.print("Diga el dia de su cumpleaños: ");
		 int dia = Integer.parseInt(System.console().readLine());
		 
		 if (mes.equals("ENERO")) {
			 if (dia <= 19) {
				 System.out.println("Su horoscopo es Capricornio");
			 }
			 if (dia >= 20) {
				 System.out.println("Su horoscopo es Acuario");
			 }
		 }
		 if (mes.equals("FEBRERO")) {
			 if (dia <= 18) {
				 System.out.println("Su horoscopo es Acuario");
			 }
			 if (dia >= 19) {
				 System.out.println("Su horoscopo es Piscis");
			 }
		 }
		 if (mes.equals("MARZO")) {
			 if (dia <= 20) {
				 System.out.println("Su horoscopo es Piscis");
			 }
			 if (dia >= 21) {
				 System.out.println("Su horoscopo es Aries");
			 }
		 }
		 if (mes.equals("ABRIL")) {
			 if (dia <= 19) {
				 System.out.println("Su horoscopo es Aries");
			 }
			 if (dia >= 20) {
				 System.out.println("Su horoscopo es Tauro");
			 }
		 }
		 if (mes.equals("MAYO")) {
			 if (dia <= 20) {
				 System.out.println("Su horoscopo es Tauro");
			 }
			 if (dia >= 21) {
				 System.out.println("Su horoscopo es Geminis");
			 }
		 }
		 if (mes.equals("JUNIO")) {
			 if (dia <= 20) {
				 System.out.println("Su horoscopo es Geminis");
			 }
			 if (dia >= 21) {
				 System.out.println("Su horoscopo es Cancer");
			 }
		 }
		 if (mes.equals("JULIO")) {
			 if (dia <= 22) {
				 System.out.println("Su horoscopo es Cancer");
			 }
			 if (dia >= 23) {
				 System.out.println("Su horoscopo es Leo");
			 }
		 }
		 if (mes.equals("AGOSTO")) {
			 if (dia <= 22) {
				 System.out.println("Su horoscopo es Leo");
			 }
			 if (dia >= 23) {
				 System.out.println("Su horoscopo es Virgo");
			 }
		 }
		 if (mes.equals("SEPTIEMBRE")) {
			 if (dia <= 22) {
				 System.out.println("Su horoscopo es Virgo");
			 }
			 if (dia >= 23) {
				 System.out.println("Su horoscopo es Libra");
			 }
		 }
		 if (mes.equals("OCTUBRE")) {
			 if (dia <= 22) {
				 System.out.println("Su horoscopo es Libra");
			 }
			 if (dia >= 23) {
				 System.out.println("Su horoscopo es Escorpio");
			 }
		 }
		 if (mes.equals("NOVIEMBRE")) {
			 if (dia <= 21) {
				 System.out.println("Su horoscopo es Escorpio");
			 }
			 if (dia >= 22) {
				 System.out.println("Su horoscopo es Sagitario");
			 }
		 }
		 if (mes.equals("DICIEMBRE")) {
			 if (dia <= 21) {
				 System.out.println("Su horoscopo es Sagitario");
			 }
			 if (dia>= 22) {
				 System.out.println("Su horoscopo es Capricornio");
			 }
		 }
	 }
 }
 
