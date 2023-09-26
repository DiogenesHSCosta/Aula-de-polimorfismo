package costaBank;

public class Cliente implements Autenticavel {

	private String nome;
	private AutenticadorInstancia autentica = new AutenticadorInstancia();
	
	public Cliente (String nome) {
		this.nome = nome;
	}
	
	@Override
	public void setSenha(String senha) {
		autentica.setSenha(senha);
	}
	
	@Override
	public boolean getAutenticacao(String senha) {
		return autentica.getAutenticacao(senha);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
