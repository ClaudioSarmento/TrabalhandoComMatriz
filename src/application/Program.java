package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {
	/*
	 * Programa para ler dois números inteiros M e N, depois ler uma matriz de M linhas por N colunas contendo números inteiros,
	 *  podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. 
	 *  Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Integer m = 0, n = 0;
		
		// Part 1 - Entering the matrix size
		System.out.print("Insert the of numbers of lines: ");
		m = sc.nextInt();
		System.out.print("Insert the of numbers of colums: ");
		n = sc.nextInt();
		
		Integer[][] vect = new Integer[m][n];
		
		// Part 2 - Entering data in the matrix
		for (int i=0; i < vect.length; i++) {
			for(int j=0; j < vect[i].length; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		// Part 3 - Searching the data in the matrix
		System.out.print("Insert the of number for search in the matrix: ");
		Integer x = sc.nextInt();
		
		for (Integer i = 0; i < vect.length; i++) {
			for (Integer j = 0; j < vect[i].length; j++) {
				if (vect[i][j] == x) {
					System.out.println("Position "+ i + ","+ j + ":" );
					// Esquerda - Left
					if(j > 0) {
						System.out.println("Left: "+ vect[i][j-1]);
					}
					//Acima - Up
					if(i > 0) {
						System.out.println("Up: "+vect[i-1][j]);
					}
					//Direita - Right
					if(j < vect[i].length - 1) {
						System.out.println("Right: "+vect[i][j+1]);
					}
					//Baixo - Down
					if(i < vect.length - 1){
						System.out.println("Down: "+vect[i+1][j]);
					}
				}		
			}
		}	
		sc.close();
	}
}


