public class Carta {
    int numero;
    int naipe; // (0=♥, 1=♦, 2=♣ e 3=♠)

    void mostraCarta() {
        System.out.print("Carta: ");
        if (numero > 10) {
            if (numero == 11) {
                System.out.println("J");
            } else if (numero == 12) {
                System.out.println("Q");
            } else {
                System.out.println("K");
            }
        } else {
            System.out.println(numero);
        }

        switch (naipe) {
            case 0: System.out.println("♥"); break;
            case 1: System.out.println("♦"); break;
            case 2: System.out.println("♣"); break;
            case 3: System.out.println("♠"); break;
        }
    }
}


