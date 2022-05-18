package executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Executavel {
	public static void main(String[] args) {

		
		/*Criando uma lista de Alunos*/
		List<Aluno> alunos = new ArrayList<Aluno>();
		int numAluno = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos irá Cadastrar notas?"));
		
		for(int quantidade = 1; quantidade <= numAluno; quantidade++) {
			
			String nome = JOptionPane.showInputDialog("Qual o nome do " +quantidade+ "º aluno?");
		/*
		 * int idade =
		 * Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));
		 * String dataNascimento =
		 * JOptionPane.showInputDialog("Data de Nascimento: dd/MM/yyyy"); String rg =
		 * JOptionPane.showInputDialog("Registro Geral:"); String cpf =
		 * JOptionPane.showInputDialog("CPF do aluno: "); String nomeMae =
		 * JOptionPane.showInputDialog("Informe o nome da mãe"); String nomePai =
		 * JOptionPane.showInputDialog("Informe o nome do pai"); String dataMatricula =
		 * JOptionPane.showInputDialog("Qual a data da Matricula? dd/MM/yyyy"); String
		 * nomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola?"); String
		 * serieMatriculado = JOptionPane.showInputDialog("Qual série o aluno faz?");
		 */

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		/*
		 * aluno1.setIdade(idade); aluno1.setDataNascimento(dataNascimento);
		 * aluno1.setRegistroGeral(rg); aluno1.setNumeroCpf(cpf);
		 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
		 * aluno1.setDataMatricula(dataMatricula); aluno1.setNomeEscola(nomeEscola);
		 * aluno1.setSerieMatriculado(serieMatriculado);
		 */

		Disciplina disciplina = null;
		int numDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Quantas disciplinas deseja cadastrar?"));
		
		/* setando disciplinas no sistema */
		for (int pos = 1; pos <= numDisciplina; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da " + pos + "ª Disciplina");
			double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Nota da " + pos + "ª Disciplina"));
			disciplina = new Disciplina();

			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(notaDisciplina);

			aluno1.getDisciplinas().add(disciplina);
		}

		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

		if (escolha == 0) {

			int continuarRemover = 0; // variável para continuar a remover
			int posicao = 1;
			while (continuarRemover == 0) {

				int disciplinaRemover = Integer.parseInt(JOptionPane.showInputDialog("Qual a disciplina?" + "\n1." + "\n2." + "\n3." + "\n4."));

				aluno1.getDisciplinas().remove(disciplinaRemover - posicao);
				posicao++;

				continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continar a remover?");
			}
		}
		alunos.add(aluno1);//adicionando o aluno na lista
		}
		
		/*for para percorrer por posição*/
		for(int pos = 0; pos < alunos.size(); pos ++) {
			
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("danilo")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matemática");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar); //trocando na lista - na posição o objeto pelo novo
				aluno = alunos.get(pos);
			}
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado2());
			System.out.println(" ");
			
			
			for (int posD = 0; posD < aluno.getDisciplinas().size(); posD ++) {
				Disciplina disc = aluno.getDisciplinas().get(posD);
				
				System.out.println("Disciplina do aluno: " + disc.getDisciplina() + "\nNota: " + disc.getNota());
				System.out.println("------------------------------------");
			}
		}
		/*for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("danilo")) {//procurando um aluno pelo nome na lista
				
				alunos.remove(aluno);//removendo o aluno encontrado da lista
				break;//para quando encontrar o aluno com o nome danilo
				
			}else {//imprimindo o resultado para os demais alunos
				System.out.println(aluno);
				System.out.println("Média do Aluno: " + aluno.getMediaNota() + "\nResultado: " + (aluno.getAlunoAprovado2()));
				System.out.println("-----------------------------------");
				
			}
		}
		
		for (Aluno aluno : alunos) {//IMPRIMINDO LISTA DE ALUNOS QUE SOBRARAM
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias");
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}*/
	}
}
