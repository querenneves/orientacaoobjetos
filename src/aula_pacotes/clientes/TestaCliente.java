package aula_pacotes.clientes;

public class TestaCliente {

	public static void main(String[] args) {
		int opcao;
		String nome, sexo, pagamento;
		float rg, cpf;

		Cliente c1 = new Cliente("Joyce Caroline", 3, 12345667f, 169852340, 3);
		c1.visualizar();
		
		Cliente c2 = new Cliente("Lua Maria", 2, 12345467f, 169869540, 1);
		c2.visualizar();
	}

}
