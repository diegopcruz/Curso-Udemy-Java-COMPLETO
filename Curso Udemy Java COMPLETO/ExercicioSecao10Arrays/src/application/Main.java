package application;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Exercício 4
        System.out.print("Quantos números você vai digitar? ");

        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros pares: ");

        int qtdpares = 0;
        for (int i = 0; i < n; i++){
            if(num[i] % 2 == 0){
                System.out.printf("%d ", num[i]);
                qtdpares++;
            }
        }

        System.out.println();
        System.out.println("\nQuantidade de pares: " + qtdpares);

        sc.close();




        // Exercício 3
        /*System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dador da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += altura[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        int cont = 0;
        for(int i=0; i<n; i++){
            if(idades[i] < 16){
                cont = cont + 1;
            }
        }
        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", percent);

        for(int i=0; i<n; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }

        sc.close();*/




        // Exercício 2
        /*System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.print("DIGITE UM NÚMERO: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("VALORES: " + Arrays.toString(vect));

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        System.out.print("SOMA= " + sum);

        double average = sum / vect.length;

        System.out.println();
        System.out.printf("MEDIA = %.1f%n", average);

        sc.close();*/



        // Exercício 1
        /*System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i = 0; i < n; i++){
            if(vect[i] < 0)
                System.out.printf("%d\n", vect[i]);
        }

        sc.close();*/

    }
}