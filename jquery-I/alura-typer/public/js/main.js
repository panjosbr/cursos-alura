var frase = $('.frase').text();
var numPalavras = frase.split(' ').length;

var tamanhoFrase = $('#tamanho-frase');
tamanhoFrase.text(numPalavras);

console.log(frase);
console.log(numPalavras);
