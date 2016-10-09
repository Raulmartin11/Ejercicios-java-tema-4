/**
 * que toca a 1º un dia de la semana
 * 
 * @author Raul Martin
 */
 
 public class Ejercicio01 {
	 public static void main(String[] args) {
		 
		 System.out.print(" Di el dia que quieres saber que toca a primera: ");
		 String dia = System.console().readLine().toUpperCase();
		 
		 if (dia.equals("LUNES")) {
			 System.out.println("Toca Sist.Inf");
		 }
		 if (dia.equals("MARTES")) {
			 System.out.println("Toca programacion");
		 }
		 if (dia.equals("MIERCOLES")) {
			 System.out.println("Toca Programacion");
		 }
		 if (dia.equals("JUEVES")) {
			System.out.println("Toca Base de Datos");
		 }
	   if (dia.equals("VIERNES")) {
			 System.out.println("Toca Lenguaje de Marca");
		 }
	 }
 }
