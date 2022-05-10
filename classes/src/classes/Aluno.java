package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	/* Atributos */
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); //relacionando a disciplina com o  aluno

	

	/* M�todo construtor padr�o */
	public Aluno() {

	}

	/* Construtor com argumentos */
	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		
	}

	/*
	 * metodos especiais set e get set - setar, adicionar ou receber dados e get -
	 * retornar, resgatar ou obter o valor do atributo
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	/* m�todos */
	/* Retorna a m�dia do Aluno */
	double somaNotas = 0.0;
	public double getMediaNota() {
		/*for para varrer a lista e fazer a soma das notas*/
		for (Disciplina disciplina : disciplinas) { /*Aponto a classe, crio uma vari�vel e aponto para a lista*/
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}

	/* m�todo para saber se ta aprovado ou n�o */
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();// atribuindo ao valor da m�dia o resultado do m�todo

		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 70) {
			return "Aluno est� aprovado";
		} else {
			return "Aluno est� reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno: \nNome: " + getNome() + " \nIdade: " + getIdade() + " \nData de Nascimento: "
				+ getDataNascimento() + " \nRegistro Geral: " + getRegistroGeral() + " \nNumero do Cpf: "
				+ getNumeroCpf() + " \nNome da M�e: " + getNomeMae() + " \nNome do Pai: " + getNomePai()
				+ " \nData Matricula: " + getDataMatricula() + " \nNome da Escola: " + getNomeEscola()
				+ " \nSerie Matriculado: " + getSerieMatriculado();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}

}
