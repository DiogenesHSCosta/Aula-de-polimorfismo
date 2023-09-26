package costaBank;

public class Gerente extends Funcionario {
	private String senha;
	
	
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	
	public boolean getAutenticacao(String senha) {
		
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getBonificacao()+super.getSalario();
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
