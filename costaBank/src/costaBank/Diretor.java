package costaBank;

public class Diretor extends Funcionario implements Autenticavel {
	
	private String senha;
	private AutenticadorInstancia autentica = new AutenticadorInstancia();
	
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	
	@Override
	public double getBonificacao() {
		return (super.getBonificacao()*2) + super.getSalario();
	}
	
	@Override
	public void setSenha(String senha) {
		autentica.setSenha(senha);
	}
	
	@Override
	public boolean getAutenticacao(String senha) {
		return autentica.getAutenticacao(senha);
	}
	

}
