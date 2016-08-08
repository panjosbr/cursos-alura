/*Imprima os fatoriais de 1 a 10.
Lembre-se: O fatorial de 0 é 1. O fatorial de 1 é (0!) * 1 = 1. */
class Exercicio6 {
    public static void main(String[] args){

        long fatorial = 1;
        for (int n = 1; n <= 20; n++) {
            fatorial = fatorial * n;
            System.out.println("fat(" + n + ") = " + fatorial);
        }

    }
}