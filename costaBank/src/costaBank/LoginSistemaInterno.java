package costaBank;

public class LoginSistemaInterno {
	private String senha = "1234";
	
	public void validaAcesso(FuncionarioAutenticavel funcionario) {
		boolean autentica = funcionario.getAutenticacao(this.senha);
		if(autentica) {
			System.out.println("entrou no sistema");;
		}
		else {
			System.out.println("Não entrou no sistema");;
		}
	}
}
