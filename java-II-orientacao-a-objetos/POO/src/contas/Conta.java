package contas;

abstract class Conta {
	protected double saldo;
	private String nome;
	private int agencia;

	// métodos comuns da classe
	abstract void atualiza(double taxa);

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
