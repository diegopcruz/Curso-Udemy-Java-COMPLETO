import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // String product1 = "Computer";
        // String product2 = "Office desk";

        // int age = 30;
        // int code = 5290;
        // char gender = 'F';

        // double price1 = 2100.0;
        // double price2 = 650.50;
        // double measure = 53.234567;

        // System.out.println("Products:");
        // System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        // System.out.printf("%s, wich proce is $ %.2f%n", product2, price2);
        // System.out.printf("\nRecord: %d years old, code %d and gender: %c%n", age, code, gender);
        // System.out.printf(Locale.FRANCE, "\nMeasure with eight decimal places: %.8f", measure);
        // System.out.printf(Locale.FRANCE, "\nRouded (three decimal places): %.3f", measure);
        // System.out.printf(Locale.US, "\nUS decimal point: %.3f", measure);

    /*
    // EXERCÍCIO 1 - NÉLIO ALVES
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois números inteiros: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int soma;

    soma = x + y;

    System.out.println("SOMA= " + soma);
    */

    /*
    // EXERCÍCIO 2 - NÉLIO ALVES
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a área: ");
    double x = sc.nextDouble();
    double pi = 3.14159;
    double area;
    area = pi*(Math.pow(x, 2));

    System.out.printf("A= %.4f", area);
    */

    /*
    // EXERCÍCIO 3 - NÉLIO ALVES
    Scanner sc = new Scanner(System.in);
    int a, b, c, d, diferenca;

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    diferenca = (a * b - c * d);

    System.out.println("DIFERENÇA = " + diferenca);
    */

    /*
    // EXERCÍCIO 4 - NÉLIO ALVES
    Scanner sc = new Scanner(System.in);
    int f, h;
    double salH, sal;
    Systen.out.println("Digite o número do funcionário: ");
    f = sc.nextInt();
    System.out.println("Digite o número de horas trabalhadas: ");
    h = sc.nextInt();
    Systen.out.println("Digite o valor da hora trabalhada: ");
    salH = sc.nextDouble();

    sal = (double) salH * h;

    System.out.printf("NUMBER = %d%n", f);
    System.out.printf("SALARY = U$ %.2f%n", sal);
    */

    /*
    // EXERCÍCIO 5 - NÉLIO ALVES
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite os valores da primeira peça: ");
    double [] peca1 = new double[3];
    peca1[0] = sc.nextDouble();
    peca1[1] = sc.nextDouble();
    peca1[2] = sc.nextDouble();



    System.out.println("Digite os valores da segunda peça: ");
    double [] peca2 = new double[3];
    peca2[0] = sc.nextDouble();
    peca2[1] = sc.nextDouble();
    peca2[2] = sc.nextDouble();

    double valorTotal = (peca1[1] * peca1[2]) + (peca2[1] * peca2[2]);

    System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    */

        // EXERCÍCIO 6 - NÉLIO ALVES
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

    }
}
