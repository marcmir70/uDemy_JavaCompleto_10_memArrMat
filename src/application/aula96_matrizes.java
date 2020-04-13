//uDemy, curso Java Completo, secao 10, aula 96 
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.Locale;
import java.util.Scanner;

public class aula96_matrizes {
	public static void main(String[] args) {
		// uDemy : código origem em https://github.com/acenelio/matrix1-java
		// uDemy : código disponível em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();        // instancia n na memória (stack)
		int[][] mat = new int[n][n]; // instancia a matriz na memória (heap)
		
		for (int lin=0; lin<mat.length; lin++) {  // mat.length = número de linhas
			for (int col=0; col<mat[lin].length; col++) { // mat[i].length = número de colunas
				mat[lin][col] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		int countNegNums = 0;
		for (int lin=0; lin<mat.length; lin++) {
			for (int col=0; col<mat[lin].length; col++) {
				if ( mat[lin][col] < 0 ) countNegNums++;
			}
		}
		System.out.println("Negative numbers: " + countNegNums);
		
		sc.close();
	}
}