package costaBank;

public class LoginSistemaInterno {
	private String senha = "1234";
	
	public void validaAcesso(Autenticavel au) {
		boolean autentica = au.getAutenticacao(this.senha);
		if(autentica) {
			System.out.println("entrou no sistema");;
		}
		else {
			System.out.println("Não entrou no sistema");;
		}
	}
}
