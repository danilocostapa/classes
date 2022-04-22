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

		// condi��es l�gicas com if else
		if (media >= 70) {

			System.out.println("Aluno aprovado com a M�dia: " + media);

		} else if (media >= 40 && media <= 69) {

			System.out.println("Aluno em recupera��o com a M�dia: " + media);

		} else {

			System.out.println("Aluno em recupera��o com a M�dia: " + media);
		}

		/* operadores tern�rios s�o para micro vallida��es */

		String saidaResultado;

		saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";

		System.out.println(saidaResultado);

		/* opera��es aninhadas */

		if (media >= 50) {
			
			if (media >= 70) {
				
				if (media >= 90) {
					
					System.out.println("Aluno aprovado direto - parab�ns!!");
					
				} else {

					System.out.println("Aluno aprovado direto.");
				}
				
			} else {
				
				System.out.println("Aluno em recupera��o.");
			}
			
		} else {
			
			System.out.println("Aluno reprovado direto.");
		}
		
		
		/*Usando o switch case para condi��es exatas*/
		
		System.out.println("Qual dia da semana? " 
		+"\n1 - Domingo" 
		+"\n2 - Segunda"
		+"\n3 - Ter�a"
		+"\n4 - Quarta"
		+"\n5 - Quinta"
		+"\n6 - Sexta"
		+"\n7 - S�bado");
		
		int dia = entrada.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda Feira");
			break;
			
		case 3:
			System.out.println("Ter�a Feira");
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
			System.out.println("S�bado");
			break;

		default:
			System.out.println("Dia da semana n�o identificado!");
			break;
		}
		
		entrada.close();

	}

}
