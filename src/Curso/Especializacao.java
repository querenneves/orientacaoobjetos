package Curso;

public class Especializacao extends Curso {

	private String especializacao;

	public Especializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Especializacao Desejada: " + this.especializacao);
}
}
