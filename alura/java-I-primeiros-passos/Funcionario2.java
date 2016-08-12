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

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Conta: " + this.conta);
        System.out.println("Salario: " + this.salario);
        System.out.println("Ganho Anual:" + this.calculaGanhoAnual());
    }
}

class TesteFuncionario {
    public static void main(String[] args){
        Funcionario2 f1 = new Funcionario2();
        f1.nome = "Mariana";
        f1.departamento = "TI";
        f1.conta = 12345;
        f1.salario = 1000.0;
        f1.mostra();

        Funcionario2 f2 = f1;

        if(f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }

    }
}