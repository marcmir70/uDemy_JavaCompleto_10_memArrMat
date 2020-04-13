//uDemy, curso Java Completo, secao 10, aula 94 
//código disponível em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class aula94_exercProposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id = 0;
		boolean validId;

		List<Empregado> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();
		
//		Empregado[] employee = new Empregado[10]; // errado?! >> Rent vect [] = new Rent[10];
		
//		List<int> empId = new ArrayList<>(); erro: precisa declarar dimensões?!?
//		List<String> empName = new ArrayList<>();
//		List<double> empSalary = new ArrayList<>(); erro: precisa declarar dimensões?!?
		
		for (int i=0; i<employees; i++) {
			System.out.println();
			System.out.println( "Employee #" + (i+1) );
			
			validId = false;
			while ( ! validId ) {
				System.out.print("Id: ");
				id = sc.nextInt();
				if ( i > 0 ) {
					validId = true;
					for ( Empregado emp : list ) { // for (int j=0; j<i, j++) {
						if ( emp.getId() == id ) validId = false;
					}
					if ( ! validId ) System.out.println("This id is in use. Try other one!");
				}
				if ( i == 0 ) validId = true;
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Empregado(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		id = sc.nextInt();
		validId = false;
		for ( Empregado emp : list ) { // for (int j=0; j<i, j++) {
			if ( emp.getId() == id ) {
				validId = true;
				System.out.print("Enter the percentage: ");
				double perc = sc.nextDouble(); 
				// aceita percentual negativo implicando REDUÇÃO do salário!
				emp.increaseSalary(perc);
			}
		}
		if ( ! validId ) System.out.println("This id doesn't exist. Try other one!");
		
		System.out.println();		
		System.out.println("List of employees:");
		for ( Empregado emp : list ) {
			System.out.println(emp);
		}
		
		sc.close();
	}
}