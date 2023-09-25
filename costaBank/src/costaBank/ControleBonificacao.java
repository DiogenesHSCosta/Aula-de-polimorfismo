package costaBank;

public class ControleBonificacao {
	
	private double soma;
	public void controleBonificacao(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
	
	public double getSoma() {
		return soma;
	}
}
