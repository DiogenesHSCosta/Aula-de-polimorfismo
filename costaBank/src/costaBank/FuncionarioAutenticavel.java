package costaBank;

public abstract class FuncionarioAutenticavel extends Funcionario {
	
	private String senha;
	
	public FuncionarioAutenticavel(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public boolean getAutenticacao(String senha) {
		
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}

	
}
