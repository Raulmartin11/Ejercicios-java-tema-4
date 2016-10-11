/**
* Numera los dias de la semana
* 
* @author Raul Martin
*/

public class Ejercicio03 {
	public static void main(String[] args) {
		
		System.out.println("Introduce un numero del 1-7 para saber su dia de la semana");
		
		int dia = Integer.parseInt(System.console().readLine());
		
		int lunes;
		int martes;
		int miercoles;
		int jueves;
		int viernes;
		int sabado;
		int domingo;
		
		switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			
			case 2:
				System.out.println("Martes");
				break;
				
			case 3:
				System.out.println("Miercoles");
				break;
			
			case 4:
				System.out.println("Jueves");
				break;
			
			case 5:
				System.out.println("Viernes");
				break;
			
			case 6:
				System.out.println("Sabado");
				break;
			
			case 7:
				System.out.println("Domingo");
				break;
				
			default:
				System.out.println("Limitese al los numeros especificados");
			}
		}
	}
	
