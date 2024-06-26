import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Estrutura 01 - While
        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();*/



        // Estrutura 02 - For
        /*Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for(int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println(soma);

        sc.close();
         */



        // Exercício While 01
        /*Scanner sc = new Scanner(System.in);

        int senha = 2002;

        int x = sc.nextInt();

        while (x != senha){
            System.out.println("Senha Inválida");
            x = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();*/



        // Exercício While 02
        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();*/



        // Exercício While 04
        /*Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool += 1;
            } else if(tipo == 2){
                gasolina += 1;
            } else if (tipo == 3) {
                disel += 1;
            }
            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Disel: " + disel);

        sc.close();*/



        // Exercício For 01
        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        for(int i = 0; i <= x; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }

        sc.close();*/



        // Exercício For 02
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();*/



        // Exercício For 03
        /*Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();*/



        // Exercício For 04
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();*/



        // Exercício For 05
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i=1; i<=n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();*/



        // Exercício For 06
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();*/



        // Exercício For 07
        /*Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }

        sc.close();*/

    }
}