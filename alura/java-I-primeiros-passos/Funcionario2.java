class Funcionario2 {
    double salario;
    String nome;
    String departamento;
    int conta;

    Data dataDeEntrada;

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
        System.out.println("Salario: R$ " + this.salario);
        System.out.println("Ganho Anual: R$ " + this.calculaGanhoAnual());
        this.dataDeEntrada.getFormatada();
    }
    
}

class Data {
    int dia;
    int mes;
    int ano;

    void preencherData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;        
    }

    void getFormatada(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}


class TesteFuncionario {
    public static void main(String[] args){
        Funcionario2 f1 = new Funcionario2();
        f1.nome = "Mariana";
        f1.departamento = "TI";
        f1.conta = 12345;
        f1.salario = 1000.0;
        f1.dataDeEntrada = new Data();
        f1.dataDeEntrada.preencherData(06, 07, 2016);
        f1.mostra();        

        Funcionario2 f2 = f1;

        if(f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
    }
}