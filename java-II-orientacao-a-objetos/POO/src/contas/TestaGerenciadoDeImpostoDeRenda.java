package contas;

public class TestaGerenciadoDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
		System.out.println(cc.getSaldo());
	}

}
