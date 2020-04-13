//uDemy, curso Java Completo, secao 10, aula 89 - extensao do exercicio de fixacao
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
package entities;

public class Aula89_Reserva {
	private String nomeHospede;
	private String emailHospede;
	private double valor;
	private int numMeses;
	
	public Aula89_Reserva(String nomeHospede, 
			String emailHospede, 
			double valorReserva, 
			int numMeses) {
		this.nomeHospede = nomeHospede;
		this.emailHospede = emailHospede;
		this.valor = valorReserva;
		this.numMeses = numMeses;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public String getEmailHospede() {
		return emailHospede;
	}

	public void setEmailHospede(String emailHospede) {
		this.emailHospede = emailHospede;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumMeses() {
		return numMeses;
	}

	public void setNumMeses(int numMeses) {
		this.numMeses = numMeses;
	}
	
	public String toString() { 
		return nomeHospede +", "+ emailHospede 
				+ " : R$ " + String.format("%.2f", valor) 
				+ " por " + numMeses + " meses";
	}
}
