package costaBank;

public class Gerente extends Funcionario {
	private String senha;
	
	public boolean getAutenticacao(String senha) {
		
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.salario;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
