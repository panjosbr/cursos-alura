class Conta {
    protected double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}

class ContaCorrente extends Conta {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 2);
    }
}

class ContaPoupanca extends Conta {
    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 3);
    }

    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}

class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("===============================");
        System.out.println("Saldo anterior: R$ " + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo atualizado: R$ " + c.getSaldo());
        this.saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
}
