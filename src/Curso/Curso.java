package Curso;

public class Curso {

	private String nome;
	private int area;
	private String curso;
	private double duracao;
	private int pagamento;
	public Curso(String nome, int area, String curso, double duracao, int pagamento) {
		this.nome = nome;
		this.area = area;
		this.curso = curso;
		this.duracao = duracao;
		this.pagamento = pagamento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getPagamento() {
		return pagamento;
	}
	public void setPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
public void visualizar() {
		
		String pagamento = "";
		
		switch(this.pagamento) {
		case 1 -> pagamento = "Cartão de Crédito";
		case 2 -> pagamento = "Boleto";
		}
		
		String area = "";
		
		switch(this.area) {
		case 1 -> area = "Ciências Exatas e da Terra.";
		case 2 -> area = "Ciências Biológicas.";
		case 3 -> area = "Engenharias e Tecnologias (TI e etc).";
		case 4 -> area = "Ciências da Saúde.";
		case 5 -> area = "Ciências Agrárias.";
		case 6 -> area = "Linguística, Letras e Artes.";
		case 7 -> area = "Ciências Sociais Aplicadas.";
		case 8 -> area = "Ciências Humanas.";
		
		}
		
		System.out.println("                                      ");
		System.out.println("**************************************");
		System.out.println("           DADOS DO CLIENTE           ");
		System.out.println("**************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Área do Curso: " + area);
		System.out.println("Curso: " + this.curso);
		System.out.println("Duração do Curso: " + this.duracao);
		System.out.println("Tipo de Pagamento: " + pagamento);
		System.out.println("                                      ");
		System.out.println("                                      ");
		

	}
}
