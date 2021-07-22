package com.sayriv.holamundo;

public class forEachAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
		for (int [] arrayInterno: array) {
			for(int numero : arrayInterno) {
				System.out.print(numero+"\t");
			}
			System.out.println();
			
		}
		
		int cubo[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15}},{{16,17,18},{19,20,21},{22,23,24}}};
		for (int [][]cuboInterno : cubo) {
			for (int [] num : cuboInterno){
				for (int list : num) {
					System.out.print(list+" ");
				}
			}
		}
	}

}
