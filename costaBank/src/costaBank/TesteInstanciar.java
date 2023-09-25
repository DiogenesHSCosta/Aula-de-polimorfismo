package costaBank;

public class TesteInstanciar {

	public static void main(String[] args) {
		String nome = "José Manoel";
		String cpf = "552.552.552-52";
		double salario= 1000.00;
		
		
//		Funcionario teste = new Funcionario(nome, cpf, salario);
//		System.out.println(teste.getNome());
//		System.out.println(teste.getSalario());
//		System.out.println(teste.getBonificacao());
		
		//teste de polimorfismo
		//POLIMORFISMO = ATO DE CLASSES RESPONDEREM DE MANEIRAS 
		// DIFERENTES A UM MSM CHAMADO
		Funcionario gerente = new Gerente();
		Funcionario funcionario = new Funcionario();
		
		gerente.setSalario(1000);
		funcionario.setSalario(salario);
		
		ControleBonificacao controle= new ControleBonificacao();
		
		controle.controleBonificacao(funcionario);
		controle.controleBonificacao(gerente);
		
		System.out.println(controle.getSoma());
	}
}
