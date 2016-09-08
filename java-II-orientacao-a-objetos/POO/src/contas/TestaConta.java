package contas;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setNome("Paulo");

		System.out.println(conta.getNome());
	}

}
