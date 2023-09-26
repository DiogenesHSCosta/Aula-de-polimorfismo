package costaBank;

public class Gerente extends Funcionario implements Autenticavel {
	
	private String senha;
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return super.getBonificacao()+super.getSalario();
	}

	
	@Override
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean getAutenticacao(String senha) {
		
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
}
