package excecao;

public class TesteExcecao {
	public static void main(String[] args) {
		System.out.println("Inicio main");
		metodo1();
		System.out.println("Fim main");
	}

	static void metodo1() {
		System.out.println("Inicio metodo 1");
		metodo2();
		System.out.println("Fim metodo 1");
	}

	static void metodo2() {
		System.out.println("Inicio metodo 2");
		int[] array = new int[10];
			for (int i = 0; i <= 15; i++) {
				try {
					array[i] = i;
					System.out.println(i);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Erro " + e);
				}
			}

		System.out.println("Fim metodo 2");

	}

}
