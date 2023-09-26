package costaBank;

public class Diretor extends FuncionarioAutenticavel {
	
	
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	
	@Override
	public double getBonificacao() {
		return (super.getBonificacao()*2) + super.getSalario();
	}
}
