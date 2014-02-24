import java.util.Scanner;


public class FIchapersonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el nombre:");
		Scanner mi_scanner1 = new Scanner (System.in);
		String nombre1=mi_scanner1.next();
		
		System.out.println("Ingrese la edad:");
		Scanner mi_scanner2 = new Scanner (System.in);
		int edad1=mi_scanner2.nextInt();
		
		System.out.println("Ingrese sexo:");
		Scanner mi_scanner3 = new Scanner (System.in);
		char sexo1=mi_scanner3.next().charAt(0);
		
		System.out.println("Ingrese casado:");
		Scanner mi_scanner4 = new Scanner (System.in);
		boolean casado1=mi_scanner4.nextBoolean();
		
		System.out.println("FICHA PERSONAL");
		System.out.println("Nombre"); System.out.println(nombre1);
		System.out.println("Edad:"); System.out.println(edad1);
		System.out.println("Sexo:"); System.out.println(sexo1);
		System.out.println("Casado:"); System.out.println(casado1);
		
	}

}
