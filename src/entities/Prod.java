//uDemy, curso Java Completo, secao 10, aula 88
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package entities;

public class Prod {
	private String name;
	private double price;
	
	public Prod(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
