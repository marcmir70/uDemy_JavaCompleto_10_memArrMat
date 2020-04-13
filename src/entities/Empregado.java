//uDemy, curso Java Completo, secao 10, aula 94 
//código disponiovel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package entities;

public class Empregado {
	int id;
	String name;
	double salary; 
	
	public Empregado(int id, String name, double salary) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}

//	public void setSalary(double salary) {
//		this.salary = salary;
//	}

	public void increaseSalary (double percentage) {
		this.salary *= ( 1 + percentage/100 );		
	}
	
//	public void reduceSalary (double percentage) {
//		this.salary *= ( 1 - percentage/100 );		
//	}

	public String toString() {
		return id + ", "
				+ name + ", "
				+ String.format("%.2f", salary);
	}

}
