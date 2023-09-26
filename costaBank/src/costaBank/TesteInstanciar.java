package costaBank;

public class TesteInstanciar {

	public static void main(String[] args) {
		//teste de polimorfismo
		//POLIMORFISMO = ATO DE CLASSES RESPONDEREM DE MANEIRAS 
		// DIFERENTES A UM MSM CHAMADO
		Funcionario gerente = new Gerente("Matheus", "555.555.555.3", 2000.0);
		Funcionario funcionario = new Diretor("Lucas", "222.222.222.0", 5400.0);
		
		gerente.setSalario(32000);
		funcionario.setSalario(1000);
		
		ControleBonificacao controle= new ControleBonificacao();
		
		controle.controleBonificacao(funcionario);
		controle.controleBonificacao(gerente);
		
		System.out.println(controle.getSoma());
	}
}
