//uDemy, curso Java Completo, secao 10, aula 97 
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.Locale;
import java.util.Scanner;

public class aula97_exercDeFixacao {
	public static void main(String[] args) {
		// uDemy : código disponível em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int m = sc.nextInt(); // m linhas -instancia na memória (stack)
		int n = sc.nextInt(); // n coluns
		int[][] mat = new int[m][n]; // instancia matriz na memória (heap)
		
		for (int lin=0; lin<mat.length; lin++) {  // mat.length = número de linhas
			for (int col=0; col<mat[lin].length; col++) { // mat[i].length = número de colunas
				mat[lin][col] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		for (int lin=0; lin<mat.length; lin++) {  
			for (int col=0; col<mat[lin].length; col++) {
				if ( mat[lin][col] == num ) { 
					System.out.println("Position "+ lin + ","+ col);
					if ( col > 0 ) System.out.println("Left: " + mat[lin][col-1]);
					if ( lin > 0 ) System.out.println("Up: " + mat[lin-1][col]);
					if ( col < mat[lin].length-1 ) System.out.println("Right: " + mat[lin][col+1]);
					if ( lin < mat.length-1 ) System.out.println("Down: " + mat[lin+1][col]);
				}
			}
		}

		sc.close();
	}
}