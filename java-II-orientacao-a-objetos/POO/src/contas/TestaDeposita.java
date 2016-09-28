package contas;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		try {
			cc.deposita(-100);
		} catch (IllegalArgumentException e) {
			System.out.println("Não foi possivel depositar o valor informado " + e);
		}
	}
}
