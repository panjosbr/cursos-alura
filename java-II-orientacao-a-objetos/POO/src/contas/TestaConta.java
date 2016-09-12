package contas;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setNome("Paulo");
		conta.setSaldo(1000);

		System.out.println(conta.getNome());
		System.out.printf("O saldo é: %.2f\n", conta.getSaldo());
	}

}
