//uDemy, curso Java Completo, secao 10, aula 87
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.Locale;
import java.util.Scanner;

public class aula87 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
	    double sum = 0.0;
	    for (int i=0; i<n; i++) {
	    	sum += vect[i];
	    }
	    
	    double avg = sum / n;
	    System.out.printf("AVERAG HEIGHT: %.2f%n", avg);
		
		sc.close();
	}
}