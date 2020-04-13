// uDemy, curso Java Completo, secao 10, aula 91 - laco for each
package application;

public class aula91 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}