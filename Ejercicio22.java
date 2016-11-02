/**
* Cuanto falta para el fin de semana
* 
* @author Raul Martin
*/
public class Ejercicio22 {
	public static void main(String[] args) {
		System.out.print("Escribe un dia de la semana(de lunes a viernes) ");
		String dia = System.console().readLine().toUpperCase();
		System.out.println("Di la hora que es");
		System.out.print("Horas: ");
		int hora = Integer.parseInt(System.console().readLine());
		System.out.print("Minutos: ");
		int minutos = Integer.parseInt(System.console().readLine());
		
		int restante = 0;
		
		if (dia.equals("LUNES")) {
			restante+= 5 * 24;
		}
		if (dia.equals("MARTES")) {
			restante+= 4 *24;
		}
		if (dia.equals("MIERCOLES")) {
			restante+= 3*24;
		}
		if (dia.equals("JUEVES")) {
			restante+=2*24;
		}
		if (dia.equals("VIERNES")) {
			restante+=24;
		}
		int falta =((restante * 60) - (hora * 60) - minutos - 540);
		System.out.print("falta para el fin de semana " + falta + " minutos");
	}
}
