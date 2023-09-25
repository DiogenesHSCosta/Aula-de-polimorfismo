package costaBank;

public class TesteInstanciar {

	public static void main(String[] args) {
		String nome = "José Manoel";
		String cpf = "552.552.552-52";
		double salario= 1000.00;
		
		
		Funcionario teste = new Funcionario(nome, cpf, salario);
		System.out.println(teste.getNome());
		System.out.println(teste.getSalario());
		System.out.println(teste.getBonificacao());
	}
}
