package costaBank;

public class Cliente implements Autenticavel {

private String senha;
	
	
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
