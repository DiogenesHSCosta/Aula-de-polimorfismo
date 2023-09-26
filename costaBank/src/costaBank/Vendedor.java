package costaBank;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao()+super.getSalario();
	}
	
}
