package costaBank;

public class AutenticadorInstancia {
	private String senha;
	
	
	
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
