package com.sayriv.amazonviewer;

import java.util.Scanner;

import com.sayriv.amazonviewer.model.Movie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showMenu();
		
	}



	public static void showMenu() {

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
	                        showMovies();
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
	
	public static void showMovies() { //Metodo que muestra las peliculas disponibles
		System.out.println();
		System.out.println("¨: MOVIES :¨");
	}
	
	public static void showSeries() {
		System.out.println();
		System.out.println("¨: SERIES :¨");
	}

	public static void showChapters() {
		System.out.println();
		System.out.println("¨: CHAPTERS :¨");
	}
	
	public static void showBooks() {
		System.out.println();
		System.out.println("¨: BOOKS :¨");
	}
	
	public static void showMagazines() {
		System.out.println();
		System.out.println("¨: MAGAZINES :¨");
	}
}
