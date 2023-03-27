package aula_pacotes.clientes;

public class PessoaJuridica extends Cliente{
	
	private int cnpj;

	public PessoaJuridica(String nome, int genero, float cnpj, int cpf, int pagamento, int cnpj2) {
		super(nome, genero, pagamento);
		cnpj = cnpj2;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	public void vizualizar() {
		super.visualizar();
		System.out.println("CPF do cliente: " + this.cnpj);

}
}
