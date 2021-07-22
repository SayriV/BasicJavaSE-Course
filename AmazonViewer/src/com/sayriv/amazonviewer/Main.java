package com.sayriv.amazonviewer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Bienvenindos Amazon Viewer");
			System.out.println("Selecciona el número de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Salir");
			
			
			//Leer la respuesta del usuario 

	            opcion = sc.nextInt();
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Seleccionaste -- Movies --");
	                        break;
	                    case 2:
	                        System.out.println("Seleccionaste -- Series --");
	                        break;
	                    case 3:
	                        System.out.println("Seleccionaste -- Books --");
	                        break;
	                    case 4:
	                        System.out.println("Seleccionaste -- Magazines --");
	                        break;
	                    case 0:
	                        System.out.println("FIN");    
	                        break;
	                    default:
	                        System.out.println("Opcion desconocida, teclee otra");
	                        break;
	                }
		}while(opcion != 0);
	}

}
