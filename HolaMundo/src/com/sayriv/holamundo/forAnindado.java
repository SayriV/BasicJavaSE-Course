package com.sayriv.holamundo;

public class forAnindado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Definimos un array de 3 filas x 5 columnas
        int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
 
        //Recorremos el array multidimensional
        for (int i=0;i<array.length;i++){
        	System.out.print("| \t");
            for(int j=0;j<array[i].length;j++){
            	
            	System.out.print(array[i][j]+"\t");
                //if(j!=array[i].length) System.out.print("\t");
        
            }
            
            System.out.println("|");
            System.out.println();
            
        }
        
        
        
        int cubo[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15}}};
        
                
        for(int x=0;x<cubo.length;x++) {
        	for(int y=0;y<cubo[x].length;y++) {
        		for(int z=0;z<cubo[x][y].length;z++) {
                	
        			System.out.print(cubo[x][y][z]);
                }
            }
        }
        */
        //Obtener el número menor de cada fila INICIO
        
        int matriz[][]={{0,2,28,49,57}, {3,-72,16,933,1}, {211,11,113,4,10}};
        /*int menor;
        for(int i = 0; i < matriz.length;i++) {
        	menor = matriz[i][0];
        	for(int j = 0; j < matriz[i].length;j++) {
        		System.out.print(matriz[i][j]+"\t");
        		if(matriz[i][j]<menor) menor = matriz[i][j];
        		
        	}
        	System.out.println("El mejor de la fila "+i+ " es: "+menor);
        }
        
        //Obtener el numero menonr de cada fila FIN
        */
        //Obtener el número menor de cada columna INICIO
        
        
        
        int fin=0;
        int[] listNum = new int [5];
        for(int i = 0; i < matriz[0].length;i++) { // recorre columnas
        	fin = matriz[0][i]; //Elige el primer número de cada columna
        	for(int j = 0; j < matriz.length;j++) { // recorre filas
        		if(matriz[j][i]<fin) 
            		fin = matriz[j][i];
        		//System.out.print(matriz[j][i]+"\t "); Me muestra la matriz en direccion a la derecha
        	}
        	//System.out.println();
        	listNum[i] = fin;
        }
        for(int i = 0; i < matriz.length;i++) { //Imprime la matriz 3x5 - es solo formato
        	for(int j = 0; j < matriz[i].length;j++) {
        		System.out.print(matriz[i][j]+"\t");
        	}
        	System.out.println();
        }
        	System.out.println("Resultados:");
        for (int i = 0; i < listNum.length; i++) {
            System.out.print(listNum[i] + "\t");          
        }
        //Obbtener el numero menor de cada columna FIN
        
	}
        
        

}
