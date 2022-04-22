package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota");
		int nota1 = entrada.nextInt();
		
		System.out.println("Informe a segunda nota");
		int nota2 = entrada.nextInt();
		
		System.out.println("Informe a terceira nota");
		int nota3 = entrada.nextInt();
		
		System.out.println("Informe a quarta nota");
		int nota4 = entrada.nextInt();
		
		

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		// condições lógicas com if else
		if (media >= 70) {

			System.out.println("Aluno aprovado com a Média: " + media);

		} else if (media >= 40 && media <= 69) {

			System.out.println("Aluno em recuperação com a Média: " + media);

		} else {

			System.out.println("Aluno em recuperação com a Média: " + media);
		}

		/* operadores ternários são para micro vallidações */

		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		/* operações aninhadas */

		if (media >= 50) {
			
			if (media >= 70) {
				
				if (media >= 90) {
					
					System.out.println("Aluno aprovado direto - parabéns!!");
					
				} else {

					System.out.println("Aluno aprovado direto.");
				}
				
			} else {
				
				System.out.println("Aluno em recuperação.");
			}
			
		} else {
			
			System.out.println("Aluno reprovado direto.");
		}
		
		
		/*Usando o switch case para condições exatas*/
		
		System.out.println("Qual dia da semana? " 
		+"\n1 - Domingo" 
		+"\n2 - Segunda"
		+"\n3 - Terça"
		+"\n4 - Quarta"
		+"\n5 - Quinta"
		+"\n6 - Sexta"
		+"\n7 - Sábado");
		
		int dia = entrada.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda Feira");
			break;
			
		case 3:
			System.out.println("Terça Feira");
			break;
			
		case 4:
			System.out.println("Quarta Feira");
			break;
			
		case 5:
			System.out.println("Quinta Feira");
			break;
			
		case 6:
			System.out.println("Sexta Feira");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Dia da semana não identificado!");
			break;
		}
		
		entrada.close();

	}

}
