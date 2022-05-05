package executavel;

import classes.Aluno;

public class Executavel {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNota1(90);
		aluno1.setNota2(86.6);
		aluno1.setNota3(66.8);
		aluno1.setNota4(88.7);
		
		System.out.println("Média: " + aluno1.getMediaNota());
		
	}
}
