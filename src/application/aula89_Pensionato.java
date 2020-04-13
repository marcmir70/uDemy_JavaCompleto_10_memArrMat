//uDemy, curso Java Completo, secao 10, aula 89 - derivando exercicio de fixacao
//codigo disponivel em gitub.com/marcmir70/uDemy_JavaCompleto_10_memArrMat
// - valido (minimamente) o email : tamanho minimo de 7 caracteres, com '@', e '.com' ou '.br' ; 
// - e tambem valido se o quarto ja' esta' ocupado (por reserva anterior)
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aula89_Reserva;

public class aula89_Pensionato {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome, email = "";
		double valor;
		int meses;
		Aula89_Reserva[] vetor = new Aula89_Reserva[9];

		System.out.println("Pensionato - Controle de Reservas");
		System.out.println();

		System.out.print("Quer reservar quantos quartos? ");
		int quartos = sc.nextInt();

// for (quartos; quartos<0; quartos--) { : Syntax error on token "quartos", ++ expected after this token
// for (quartos; quartos>0; quartos--) { // <<== talvez pudesse usar assim  
		for (int a = 0; a < quartos; a++) {
			sc.nextLine();
			System.out.println();
			System.out.println("< Reserva " + (a + 1) + " >");
			System.out.print("Nome: ");
			nome = sc.nextLine();

// pede email e valido a digitacao do endereco
			boolean emailValidado = false;
			while (!emailValidado) {
				System.out.print("email: ");
				email = sc.nextLine();
				if ((!email.isEmpty()) && (email.length() >= 7)) { // minimo: #@#.com
					int marcaArroba = 0;
					for (int b = 0; b < email.length(); b++) {
						if (email.charAt(b) == '@')
							marcaArroba++;
					}
					if ((marcaArroba == 1) && ((email.contains(".com")) || (email.endsWith(".br")))
							&& (!email.endsWith(".")))
						emailValidado = true;
					else
						System.out.println("email invalido! Digite novamente...");
				} else
					System.out.println("email invalido! Digite novamente...");
			}

// pede numero do quarto a reserva e valida se ja foi reservado
			boolean quartoLivre = false;
			int numeroQuarto = 0;
			while (!quartoLivre) {
				System.out.print("Numero do Quarto: ");
				numeroQuarto = sc.nextInt();

				if (a > 0)
					if (vetor[numeroQuarto - 1] == null)
						quartoLivre = true;
					else
						System.out.println("quarto ocupado! Tente outro...");
				else
					quartoLivre = true;
				sc.nextLine();
			}

			System.out.print("Valor: ");
			valor = sc.nextDouble();
			System.out.print("Meses: ");
			meses = sc.nextInt();

			vetor[numeroQuarto - 1] = new Aula89_Reserva(nome, email, valor, meses);
		}

		sc.close();

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 9; i++)
			if (vetor[i] != null)
				System.out.println("Quarto " + (i + 1) + ": " + vetor[i]);

	}
}