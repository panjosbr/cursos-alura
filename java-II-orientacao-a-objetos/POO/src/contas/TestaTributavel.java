package contas;

public class TestaTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getSaldo());
	}
	/*
	 * Apesar de ser um objeto do tipo ContaCorrente, ao chamarmos ele de Tributavel, apenas garantimos para o compilador que aquele objeto tem os métodos que todo Tributavel tem. E como o compilador do Java só trabalha com certezas, ele só permite chamar os métodos definidos no tipo da variável.
No próximo exercício, essa diferença entre o tipo da variável e o objeto referenciado por ela ficará mais clara.
	 */

}
