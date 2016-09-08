package calculo;

class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3,2);
		System.out.println(a.calculaArea());
		
		AreaCalculavel circulo = new Circulo(5);
		System.out.println(circulo.calculaArea());
	}

}
