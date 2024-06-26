public class Mao {
    Carta[] cartas;

    // a. Crie uma classe chamada Mao que tem como atributo um vetor de objetos do tipo Carta com dez ocorrências.
    public Mao(Carta[] cartas) {
        // b. Crie um método construtor que recebe como parâmetro um vetor de objetos do tipo Carta e o armazena no atributo da classe.
        if (cartas.length == 10) {
            this.cartas = cartas;
        } else {
            throw new IllegalArgumentException("O vetor deve conter exatamente 10 cartas.");
        }
    }

    // c. Crie um método chamado verMaior que não recebe parâmetro, percorre as dez cartas armazenadas no vetor e retorna um objeto do tipo Carta com a maior carta da mão.
    public Carta verMaior() {
        Carta maiorCarta = cartas[0];
        for (int i = 1; i < cartas.length; i++) {
            if (cartas[i].numero > maiorCarta.numero) {
                maiorCarta = cartas[i];
            }
        }
        return maiorCarta;
    }

}
