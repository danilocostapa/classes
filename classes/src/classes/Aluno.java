package classes;

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

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	/* Método construtor padrão */
	public Aluno() {

	}

	/* Construtor com argumentos */
	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado, double nota1, double nota2, double nota3, double nota4) {
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
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/* métodos */
	/* Retorna a média do Aluno */
	public double getMediaNota() {
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}
	
	/*método para saber se ta aprovado ou não*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();//atribuindo ao valor da média o resultado do método
		
		if(media >= 70) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return "Aluno está aprovado";
		}
		else {
			return "Aluno está reprovado";
		}
	}

	@Override
	public String toString() {
		return "Aluno: \nNome: " + getNome() + ", \nIdade: " + getIdade() + ", \nData de Nascimento: " + getDataNascimento() + ", \nRegistro Geral: "
				+ getRegistroGeral() + ", \nNumero do Cpf: " + getNumeroCpf() + ", \nNome da Mãe: " + getNomeMae() + ", \nNome do Pai: " + getNomePai()
				+ ", \nData Matricula: " + getDataMatricula() + ", \nNome da Escola: " + getNomeEscola() + ", \nSerie Matriculado: "
				+ getSerieMatriculado() + ", \nNota 1: " + getNota1() + ", \nNota 2: " + getNota2() + ", \nNota 3: " + getNota3() + ", \nNota 4: " + getNota4();
	}
	
	

}
