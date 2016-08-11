class Funcionario2 {
    double salario;
    String nome;
    String departamento;
    int conta;

    void recebeAumento (double aumento){
        this.salario += aumento;
    }

    double calculaGanhoAnual(){
        return this.salario * 12;
    }

}

class TesteFuncionario {
    public static void main(String[] args){
        Funcionario2 f1 = new Funcionario2();
        f1.nome = "Teste";
        f1.departamento = "TI";
        f1.conta = 12345;
        f1.salario = 1500.0;

        System.out.println(f1.nome);
        System.out.println(f1.departamento);
        System.out.println(f1.conta);
        System.out.println(f1.salario);
        System.out.println("Ganho anual do funcionario: " + f1.calculaGanhoAnual());
        f1.recebeAumento(500.0);
        System.out.println("Valor do salario apos o aumento: " + f1.salario);
    }
}