import java.util.Scanner;

import java.util.Arrays;

import com.zubiri.geometria.*;


public class OperacionesGeometricas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     		//String opcion = " ";

		String opcion = " ";
		char[] string = opcion.toCharArray();



		while (!opcion.equalsIgnoreCase("t")){

		System.out.println("\nElige una figura geometrica:\nC) Circulo\nR) Rectangulo\nT) Terminar");

		opcion = sc.next();

		if ((opcion.equalsIgnoreCase("c"))||(opcion.equalsIgnoreCase("r"))){
			if (opcion.equalsIgnoreCase("c")){
				double radio = 0;
				double result;
		
				Scanner sc1 = new Scanner(System.in);
				System.out.print("\nIntroduce el radio de un circulo: ");
				radio = sc1.nextInt();
				OperacionesCirculo operaciones = new OperacionesCirculo(radio);
		
				result = operaciones.area();
				System.out.println("\nEl area del circulo es: " + result);
				result = operaciones.circunferencia();
				System.out.println("\nLa circunferencia del circulo es: " + result);
			}
			if (opcion.equalsIgnoreCase("r")){
				double base = 0;
				double altura = 0;
				double result;
		
				Scanner sc1 = new Scanner(System.in);
				System.out.print("\nIntroduce la altura de un rectangulo: ");
				altura = sc1.nextInt();

				System.out.print("\nIntroduce la base de un rectangulo: ");
				base = sc1.nextInt();
				OperacionesRectangulo operaciones = new OperacionesRectangulo(altura, base);
		
				result = operaciones.area();
				System.out.println("\nEl area del rectangulo es: " + result);
				result = operaciones.perimetro();
				System.out.println("\nEl perimetro del rectangulo es: " + result);
			}

		}else{
			if (!opcion.equalsIgnoreCase("t")){
			System.out.println("Opcion no valida");
			}else{
			System.out.println("Terminar");
			}

		}
		}

		

	}

}
