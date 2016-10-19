/**
 * Piramide a tu gusto
 * @author Raul Martin
 */
public class Ejercicio15 {
	public static void main(String[] args) {
		System.out.println("Elige la forma para hacer una pirame \n 1.Hacia arriba \n 2.Hacia abajo \n 3.Hacia la izquierda \n 4.Hacia la derecha");
		int forma = Integer.parseInt(System.console().readLine());
		System.out.print("Elige el caracer para hacer una pirame: ");
		String caracter = System.console().readLine();
		switch(forma) {
			case 1:
				System.out.println("  "+caracter    );
				System.out.println(" "+caracter+caracter+caracter   );
				System.out.println(caracter+caracter+caracter+caracter+caracter  );
				break;
			
			case 2: 
				System.out.println(caracter+caracter+caracter+caracter+caracter);
				System.out.println(" "+caracter+caracter+caracter);
				System.out.println("  "+caracter);
				break;
			
			case 3:
				System.out.println("  "+caracter);
				System.out.println(" "+caracter+caracter);
				System.out.println(""+caracter+caracter+caracter);
				System.out.println(" "+caracter+caracter);
				System.out.println("  "+caracter);
				break;
				
			case 4:
				System.out.println(caracter+"  ");
				System.out.println(caracter+caracter+" ");
				System.out.println(caracter+caracter+caracter);
				System.out.println(caracter+caracter+" ");
				System.out.println(caracter+"  ");
			}
		}
	}
