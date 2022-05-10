package executavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Executavel {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: dd/MM/yyyy");
		String rg = JOptionPane.showInputDialog("Registro Geral:");
		String cpf = JOptionPane.showInputDialog("CPF do aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Informe o nome da m�e");
		String nomePai = JOptionPane.showInputDialog("Informe o nome do pai");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matricula? dd/MM/yyyy");
		String nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual s�rie o aluno faz?");

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

		/*setando disciplinas no sistema*/
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da "+ pos +"� Disciplina");
			double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Nota da " +pos+ "� Disciplina"));
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(notaDisciplina);
			
			aluno1.getDisciplinas().add(disciplina);
		}

		System.out.println(aluno1);

		System.out.println("M�dia do Aluno: " + aluno1.getMediaNota() + "" + "\nResultado: "
				+ (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado")); // operador tern�rio

	}
}
