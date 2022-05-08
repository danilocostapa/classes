package executavel;

import java.util.Dictionary;

import javax.swing.JOptionPane;

import classes.Aluno;

public class Executavel {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: dd/MM/yyyy");
		String rg = JOptionPane.showInputDialog("Registro Geral:");
		String cpf = JOptionPane.showInputDialog("CPF do aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da mãe");
		String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matricula? dd/MM/yyyy");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual série o aluno faz?");

		String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1?");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + disciplina1));

		String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2?");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + disciplina2));

		String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3?");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + disciplina3));

		String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4?");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Nota da disciplina " + disciplina4));

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(idade);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatriculado);

		aluno1.getDisciplina().setNota1(nota1);
		aluno1.getDisciplina().setNota2(nota2);
		aluno1.getDisciplina().setNota3(nota3);
		aluno1.getDisciplina().setNota4(nota4);
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);

		

		System.out.println(aluno1);

		System.out.println("Média do Aluno: " + aluno1.getMediaNota() + "" + "\nResultado: "
				+ (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); // operador ternário

	}
}
