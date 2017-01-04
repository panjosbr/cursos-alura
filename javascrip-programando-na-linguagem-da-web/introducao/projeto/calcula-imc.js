var peso = 100;
var altura = 2.00;

if(altura != 0){
    var imc = peso / (altura * altura);   
    console.log("IMC é igual a: " + imc);
} else {
    console.log("Não posso executar uma divisão por 0!");
}
