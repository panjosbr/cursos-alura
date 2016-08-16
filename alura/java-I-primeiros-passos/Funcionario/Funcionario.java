class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;


    public void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    public void mostra(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("RG: " + this.getRg());
        this.dataEntrada.dataFormatada();
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
}

class Data {
    private int dia;
    private int mes;
    private int ano;

    public void  setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void dataFormatada(){
        System.out.print(this.getDia() + "/" + this.getMes() + "/" + this.getAno());
    }

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}

class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] empregados;
    private int livre = 0;

    public void adicionar(Funcionario f) {
        //NullPointerException linha 114
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
        Data d1 = new Data();
        d1.setData(06, 07, 2016);
        f1.setDataEntrada(d1);
        f1.mostra();
    }
}

class TesteEmpresa {
    public static void main(String[] args) {
        Empresa google = new Empresa();

        Funcionario f2 = new Funcionario();
        f2.setNome("Panjos");
        f2.setDepartamento("Informatica");
        f2.setRg("65.654.981-1");
        f2.setSalario(2000.0);
        Data d2 = new Data();
        d2.setData(01, 05, 2013);
        f2.setDataEntrada(d2);
        //NullPointerException linha 184
        google.adicionar(f2);
        google.exibeSalarioFuncionarios();
    }
}