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

class Empresa {
    String nome;
    String cnpj;
    Funcionario2[] empregados;
    int livre = 0;

    void adicionar(Funcionario2 f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }

    void mostraEmpregados(){
        for(int i = 0; i < this.livre; i++){
            System.out.println("[" + i + "]" + this.empregados[i].nome);
            System.out.println("R$ " + this.empregados[i].salario);
        }
    }

    void mostraTodasAsInformacoes(){
        for(int i = 0; i < this.livre; i ++){
            this.empregados[i].mostra();
            System.out.println();
        }
    }

    boolean contem(Funcionario2 f){
        for(int i = 0; i < livre; i++){
            if(f == this.empregados[i]) {
                return true;
            }
        }
        return false;
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

        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario2[10];

        Funcionario2 f1 = new Funcionario2();
        f1.nome = "Mariana";
        f1.departamento = "TI";
        f1.conta = 12345;
        f1.salario = 1000.0;
        f1.dataDeEntrada = new Data();
        f1.dataDeEntrada.preencherData(06, 07, 2016);
        empresa.adicionar(f1);

        Funcionario2 f2 = new Funcionario2();
        f2.nome = "João";
        f2.departamento = "TI";
        f2.conta = 12345;
        f2.salario = 1000.0;
        f2.dataDeEntrada = new Data();
        f2.dataDeEntrada.preencherData(06, 07, 2016);
        empresa.adicionar(f2);

        Funcionario2 f3 = new Funcionario2();
        f3.nome = "Paulo";
        f3.departamento = "TI";
        f3.conta = 12345;
        f3.salario = 1000.0;
        f3.dataDeEntrada = new Data();
        f3.dataDeEntrada.preencherData(06, 07, 2016);
        empresa.adicionar(f3);

        empresa.mostraTodasAsInformacoes();
    }
}

class TestaEmpresa {
    public static void main(String[] args){
        Empresa google = new Empresa();
        google.empregados = new Funcionario2[10];

        Funcionario2 f4 = new Funcionario2();
        f4.nome = "Bill";
        f4.departamento = "Compras";
        f4.conta = 1234;
        f4.salario = 2000.0;
        f4.dataDeEntrada = new Data();
        f4.dataDeEntrada.preencherData(31, 10, 1990);
        google.adicionar(f4);

        google.mostraTodasAsInformacoes();
    }
}