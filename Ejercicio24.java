/**
* Nómina
* 
* @author Raul Martin
*/
public class Ejercicio24 {
	public static void main(String[] args) {
		System.out.println("Cargo del empleado");
		System.out.println("1.Prog.junior\n2.Prog.senior\n3.Jefe de proyecto");
		int cargo = Integer.parseInt(System.console().readLine());
		System.out.print("Numero de dias de viajes ");
		int dias = Integer.parseInt(System.console().readLine());
		System.out.println("Estado civil");
		System.out.println("1.Soltero\n2.Casado");
		int estado = Integer.parseInt(System.console().readLine());
		
		int sueldo = 0;
		int neto = 0;
		double IRPF =	0;
		switch(cargo) {
			case 1:
			sueldo+=950;
			System.out.println("Ostenta el cargo de Programador Junior");
			break;
			case 2:
			sueldo+=1200;
			System.out.println("Ostenta el cargo de Programador Senior");
			break;
			case 3:
			sueldo+=1600;
			System.out.println("Ostenta el cargo de Jefe de Proyectos");
			break;
		}
		System.out.println("El numero de viajes realizados son " + dias);
		int bruto = sueldo + dias * 30;
		switch(estado) {
			case 1:
			IRPF+=0.25;
			neto+= bruto * 0.75;
			System.out.println("Estado civil:Soltero");
			break;
			case 2:
			IRPF+=0.20;
			neto+= bruto * 0.80;
			System.out.println("Estado civil:Casasdo");
			break;
		}
		System.out.println("Sueldo base: " + sueldo);
		System.out.println("Dietas (" + dias + " viaje/s): " + dias * 30);
		System.out.println("Sueldo bruto: " + bruto);
		System.out.println("Retencion IRPF (" + IRPF * 100 + " %)");
		System.out.println("Sueldo neto: " + neto);
	}
}
