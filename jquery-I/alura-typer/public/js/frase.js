$("#botao-frase").click(fraseAleatoria);

function fraseAleatoria() {
    $("#spinner").toggle();

    $.get('http://localhost:3000/frases', trocarFraseAleatoria)
    .fail(function() {
        $('#erro').toggle();
        setTimeout(function(){
            $("#erro").toggle();
        },1500);
    })
    .always(function() {
        $('#spinner').toggle();
    });
}

function trocarFraseAleatoria(data) {
    var frase = $('.frase');
    var numeroAleatorio = Math.floor(Math.random() * data.length);

    frase.text(data[numeroAleatorio].texto);
    atualizaTamanhoFrase();
    atualizaTempoInicial(data[numeroAleatorio].tempo);
}
