

public class Main {
   public static void main(String[] args) {
       // Exemplo de uso
       Carta[] cartas = new Carta[10];
       for (int i = 0; i < 10; i++) {
           cartas[i] = new Carta();
           cartas[i].numero = (int)(Math.random() * 13) + 1; // número entre 1 e 13
           cartas[i].naipe = (int)(Math.random() * 4); // naipe entre 0 e 3
       }

       Mao mao = new Mao(cartas);
       Carta maiorCarta = mao.verMaior();
       maiorCarta.mostraCarta();
   }
}