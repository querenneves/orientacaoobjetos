package aula_pacotes.clientes;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String nome, int genero, int pagamento, String cpf) {
		super(nome, genero, pagamento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF do cliente: " + this.cpf);
}
	
}
