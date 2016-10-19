/**
 * Test de infidelidad
 * 
 * @author Raul Martin
 */
 public class Ejercicio16 {
	 public static void main(String[] args) {
		 
		 int puntos = 0;
		 
		 System.out.println("Pregunta 1 \n Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
		 System.out.println(" V o F");
		 String solucion1 = System.console().readLine().toUpperCase();
		 
		 if (solucion1.equals("V")) {
			puntos+=3;
		 }
		 
		 System.out.println("Pregunta 2 \n Ha aumentado sus gastos de vestuario");
		 System.out.println(" V o F");
		 String solucion2 =System.console().readLine().toUpperCase();
		 
		 if (solucion2.equals("V")) {
		  puntos+=3;
		 }
		 System.out.println("Pregunta 3 \n Ha perdido el interés que mostraba anteriormente por ti");
		 System.out.println(" V o F");
		 String solucion3 = System.console().readLine().toUpperCase();
		 
		 if (solucion3.equals("V")) {
			puntos+=3;
		 }
		 
		 System.out.println("Pregunta 4 \n Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
		 System.out.println("V o F");
		 String solucion4 =System.console().readLine().toUpperCase();
		 
		 if (solucion4.equals("V")) {
		  puntos+=3;
		 }
		 System.out.println("Pregunta 5 \n No te deja que mires la agenda de su teléfono móvil");
		 System.out.println(" V o F");
		 String solucion5 = System.console().readLine().toUpperCase();
		 
		 if (solucion5.equals("V")) {
			puntos+=3;
		 }
		 
		 System.out.println("Pregunta 6 \n A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
		 System.out.println(" V o F");
		 String solucion6 =System.console().readLine().toUpperCase();
		 
		 if (solucion6.equals("V")) {
		  puntos+=3;
		 }
		 System.out.println("Pregunta 7 \n Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
		 System.out.println("V oF");
		 String solucion7 = System.console().readLine().toUpperCase();
		 
		 if (solucion7.equals("V")) {
			puntos+=3;
		 }
		 
		 System.out.println("Pregunta 8 \n Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
		 System.out.println("V o F");
		 String solucion8 =System.console().readLine().toUpperCase();
		 
		 if (solucion8.equals("V")) {
		  puntos+=3;
		 }
		 System.out.println("Pregunta 9 \n Has notado que últimamente se perfuma más");
		 System.out.println("V o F");
		 String solucion9 = System.console().readLine().toUpperCase();
		 
		 if (solucion9.equals("V")) {
			puntos+=3;
		 }
		 
		 System.out.println("Pregunta 10 \n Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
		 System.out.println(" V o F");
		 String solucion10 =System.console().readLine().toUpperCase();
		 
		 if (solucion10.equals("V")) {
		  puntos+=3;
		 }
		 
		 if ((puntos >= 0) && (puntos <= 10)) {
			 System.out.println("Puntuación entre 0 y 10: \n ¡Enhorabuena! tu pareja parece ser totalmente fiel.");
		 }
		 if ((puntos >=11) && (puntos <=22)) {
			 System.out.println("Puntuación entre 11 y 22: \n Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
		 }
		 if ((puntos >=23) && (puntos <=30)) {
			 System.out.println("Puntuación entre 22 y 30: \n Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
		 }
	 }
 }
