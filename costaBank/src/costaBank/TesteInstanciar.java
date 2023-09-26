package costaBank;

public class TesteInstanciar {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Matheus", "555.555.555.3", 2000.0);
		Diretor diretor = new Diretor("Lucas", "222.222.222.0", 5400.0);
		Vendedor vendedor = new Vendedor("joao", "333.333.333.1", 1000.0);
		Cliente cliente = new Cliente("Marcos");
		
		
		ControleBonificacao controle= new ControleBonificacao();
		
		controle.controleBonificacao(diretor);
		controle.controleBonificacao(gerente);
		controle.controleBonificacao(vendedor);
		
		System.out.println(controle.getSoma());
		
		LoginSistemaInterno login = new LoginSistemaInterno();
		gerente.setSenha("12345");
		diretor.setSenha("1234");
		cliente.setSenha("123456");
		
		login.validaAcesso(gerente);
		login.validaAcesso(diretor);
		login.validaAcesso(cliente);
	}
}
