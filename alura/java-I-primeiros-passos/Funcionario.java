class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    public double calculaGanhoAnual(){
        return this.salario * 12;
    }
}

class Programa {
    public static void main (String[] args) {
        Funcionario paulo = new Funcionario();
        paulo.nome = "Paulo Pereira dos Anjos";
        paulo.departamento = "TI - Sistemas";
        paulo.salario = 1400.0;
        paulo.dataEntrada = "06/07/2016";
        paulo.rg = "12.345.678-9";

        System.out.println(paulo.nome);
        System.out.println("Salario atual: " + paulo.salario);
        paulo.recebeAumento(400.0);
        System.out.println("Salario com aumento: " + paulo.salario);
        System.out.println("GanhoAnual: " + paulo.calculaGanhoAnual());
    }
}