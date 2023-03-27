package Curso;

public class CursoLivre extends Curso {

	private String livres;

	public CursoLivre(String nome, int area, String curso, double duracao, int pagamento, String livres) {
		super(nome, area, curso, duracao, pagamento);
		this.livres = livres;
	}

	public String getLivres() {
		return livres;
	}

	public void setLivres(String livres) {
		this.livres = livres;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Cursos livres: " + this.livres);
}
}