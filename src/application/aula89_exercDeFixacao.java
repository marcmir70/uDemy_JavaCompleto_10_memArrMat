//uDemy, curso Java Completo, secao 10, aula 89 - exercicio de fixacao
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class aula89_exercDeFixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rooms, roomNumber;
		String name, eMail;
		Room[] vect = new Room[10]; // estava Room vect[] = ... e, na solucao, Rent[] vect = new Rent[10]; - mas seria Rent[9]
		
		System.out.print("How many rooms will be rented? ");
		rooms = sc.nextInt();
		
		for (int i=0; i<rooms; i++) {
			System.out.println();
			System.out.printf("Rent #%d:\n", i+1);
			sc.nextLine();          // faltou na solucao
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			eMail = sc.nextLine();
			System.out.print("Room: ");
			roomNumber = sc.nextInt();
			
			vect[roomNumber-1] = new Room(name, eMail);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {    // na solução deveria 11 no lugar de 10
			if ( vect[i] != null ) { //
				System.out.println( (i+1) + ": " + vect[i] );
			}
		}
		
		sc.close();
	}
}