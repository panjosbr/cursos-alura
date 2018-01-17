export class Mensagem {

    // constructor(texto='') { PARÂMETRO OPCIONAL, NAO FUNCIONA NO EDGE13
    constructor(texto) {

        this._texto = texto || '';
    }

    get texto() {

        return this._texto;
    }

    set texto(texto) {

        this._texto = texto;
    }
}
