class NegociacaoService {


    obterNegociacoesDaSemana(callback) {

        return new Promise((resolve, reject) => {

            let xhr = new XMLHttpRequest();

            xhr.open('GET', 'negociacoes/semana');

            xhr.onreadystatechange = () => {

                if(xhr.readyState == 4) {

                    if(xhr.status === 200) {

                        resolve(JSON.parse(xhr.responseText)
                            .map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor)));

                    } else {
                        console.log(xhr.responseText);
                        reject('Não foi possível obter as negociações');
                    }
                }

            };

            xhr.send();
        });

    }

    obterNegociacoesDaSemanaAnterior(callback) {

        let xhr = new XMLHttpRequest();

        xhr.open('GET', 'negociacoes/anterior');

        xhr.onreadystatechange = () => {

            if(xhr.readyState == 4) {

                if(xhr.status === 200) {

                    callback(null, JSON.parse(xhr.responseText)
                        .map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor)));

                } else {
                    console.log(xhr.responseText);
                    callback('Não foi possível obter as negociações', null);
                }
            }

        };

        xhr.send();
    }

    obterNegociacoesDaSemanaRetrasada(callback) {

        let xhr = new XMLHttpRequest();

        xhr.open('GET', 'negociacoes/retrasada');

        xhr.onreadystatechange = () => {

            if(xhr.readyState == 4) {

                if(xhr.status === 200) {

                    callback(null, JSON.parse(xhr.responseText)
                        .map(objeto => new Negociacao(new Date(objeto.data), objeto.quantidade, objeto.valor)));

                } else {
                    console.log(xhr.responseText);
                    callback('Não foi possível obter as negociações', null);
                }
            }

        };

        xhr.send();
    }
}
