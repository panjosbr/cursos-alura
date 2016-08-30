class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada = new Data();
    private String rg;
    private int id;
    private static int proximoFuncionario = 0;

    public Funcionario() {}

    public Funcionario(String nome) {
        this.nome = nome;
        this.id = ++proximoFuncionario;
    }

    public void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    public void mostra(){
        System.out.println("------------------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("RG: " + this.getRg());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Ganho anual: " + this.getGanhoAnual());
        System.out.println("Data de entrada: " + this.dataEntrada.getDataFormatada());
        System.out.println();
    }

    public void preencherDataDaEntrada(int dia, int mes, int ano) {
        this.dataEntrada = new Data(dia, mes, ano);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Data getDataEntrada(){
        return this.dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getRg(){
        return this.rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public int getId() {
        return this.id;
    }
}

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data () {}

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if(!isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + getDataFormatada() + " não existe!");
        }
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if(dia <= 0 || mes <= 0 || mes > 12 || ano <=0) {
            return false;
        }

        int ultimoDiaDoMes = 31; //padrão para a maioria dos meses
        if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if(mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) & (ano % 100 != 0))) {
               ultimoDiaDoMes = 29;
            }
        }

        if(dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }

    String getDataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int livre = 0;

    public Empresa() {}

    public Empresa(int tamanho) {
        this.empregados = new Funcionario[tamanho];
    }

    public void adicionar(Funcionario f) {
        this.empregados[this.livre] = f;
        this.livre++;
    }

    public void exibeSalarioFuncionarios() {
        for(int i = 0; i < this.livre; i++) {
            System.out.println("[" + i + "]" + this.empregados[i].getNome());
            System.out.println("R$ " + this.empregados[i].getSalario());
        }
    }

    public boolean contem(Funcionario f) {
        for(int i = 0; i < this.livre; i++) {
            if(f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.empregados[posicao];
    }

}

class TesteFuncionario {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();

        f1.setNome("Paulo");
        f1.setDepartamento("TI");
        f1.setRg("12.345.678-9");
        f1.setSalario(1500.0);
        // f1.preencherDataDaEntrada(06/07/2016);
        f1.preencherDataDaEntrada(06, 07, 2016);
        f1.mostra();

        Funcionario f3 = new Funcionario("Paulo Pereira dos Anjos");
        f3.mostra();

    }
}

class TesteEmpresa {
    public static void main(String[] args) {
        Empresa google = new Empresa(10);

        Funcionario f2 = new Funcionario("Paulo dos Anjos");
        f2.setDepartamento("Informatica");
        f2.setRg("65.654.981-1");
        f2.setSalario(2000.0);
        f2.preencherDataDaEntrada(31, 02, 2013);
        google.adicionar(f2);
        // google.exibeSalarioFuncionarios();
        google.getFuncionario(0).mostra();
    }
}