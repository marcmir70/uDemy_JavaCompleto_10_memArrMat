//uDemy, curso Java Completo, secao 10, aula 88
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Prod;

public class aula88 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		int n = sc.nextInt();
		Prod[] vect = new Prod[n];
		
		for (int i=0; i<vect.length; i++) {  // usando vect.length se atrela ao vetor no lugar de uma varivel 'solta' n...  
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Prod(name, price);
		}

		double sum = 0.0;
	    for (int i=0; i<vect.length; i++) {
	    	sum += vect[i].getPrice();
	    }
	    
	    double avg = sum / n;
	    System.out.printf("AVERAG PRICE: %.2f", avg);
		
		sc.close();
	}
}