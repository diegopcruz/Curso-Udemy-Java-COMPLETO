import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        // Exemplo da Aula 01
    
    /*Scanner sc = new Scanner(System.in);
    
    int hora;
    
    System.out.println("Quantas horas?");
    hora = sc.nextInt();

    if(hora < 12){
      System.out.println("Bom dia!");    
    } else if (hora < 18){
      System.out.println("Boa tarde!"); 
    } else{
      System.out.println("Boa noite!");
    }
    
    sc.close();
    */



        // Exemplo da Aula 02
    /*Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor dos Minutos: ");
    int minutos = sc.nextInt();

    double conta = 50.0;

    if(minutos > 100){
      conta += (minutos - 100) * 2;
    }

    System.out.printf("Valor da conta: R$ %.2f\n", conta);

    sc.close();*/



        // Exemplo da Aula 03
    /*Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    String dia;
    
    if (x == 1) {
      dia = "domingo";
    } else if (x == 2) {
      dia = "segunda";
    } else if (x == 3) {
      dia = "terca";
    } else if (x == 4) {
      dia = "quarta";
    } else if (x == 5) {
      dia = "quinta";
    } else if (x == 6) {
      dia = "sexta";
    } else if (x == 7) {
      dia = "sabado";
    } else { 
      dia = "valor invalido";
    }
    
    System.out.println("Dia da semana: " + dia);
    
    sc.close();*/



        // Exemplo da Aula 04
    /* Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    String dia;
    switch (x) {           
      case 1:        
        dia = "domingo";
        break;
      case 2:
        dia = "segunda";
        break;
      case 3:
        dia = "terca";
        break;
      case 4:
        dia = "quarta";
        break;
      case 5:
        dia = "quinta";
        break;
      case 6:
        dia = "sexta";
        break;
      case 7:
        dia = "sabado";
        break;
      default:
        dia = "valor invalido";
        break;
      }
    System.out.println("Dia da semana: " + dia);
    sc.close();*/



        // Exemplo da Aula 05
        // Expressão Condicional Tenária
    /*if (preco < 20.0) {
    desconto = preco * 0.1;
    }
    else {
    desconto = preco * 0.05;
    }

    double preco = 34.5;
    double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
    */



        // Exemplo da Aula 06
        // Escopo e Inicialização
    /*double price = sc.nextDouble();
    
    if (price > 100.0) {
      double discount = price * 0.1;
    }
    System.out.println(discount);*/



        // Exercício 01
    /*Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Digite um número: ");
    num = sc.nextInt();

    if (num < 0){
      System.out.println("NEGATIVO");
    } else {
      System.out.println("NAO NEGATIVO");
    }
    
    sc.close(); */



        // Exercício 02
    /*Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Digite um número: ");
    num = sc.nextInt();

    if (num % 2 == 0){
      System.out.println("PAR");
    } else {
      System.out.println("IMPAR");
    } 
    sc.close(); */



        // Exercício 03
    /*Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.println("Digite um número: ");
    a = sc.nextInt();

    System.out.println("Digite outro número: ");
    b = sc.nextInt();

    if (a % b == 0 || b % a == 0){
      System.out.println("São múltiplos");
    } else{
      System.out.println("Não são múltiplos");
    }

    sc.close();*/



        // Exercício 04
    /*Scanner sc = new Scanner(System.in);

    System.out.println("Digite a Hora Inicial: ");
    int horaInicial = sc.nextInt();
    
    System.out.println("Digite a Hora Final: ");
    int horaFinal = sc.nextInt();

    int duracao;
    
    if (horaInicial < horaFinal) {
      duracao = horaFinal - horaInicial;
    }
    else {
      duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    sc.close();*/



        // Exercício 05
    /*Scanner sc = new Scanner(System.in);

    int codigo = sc.nextInt();
    int quantidade = sc.nextInt();

    double total;
    if (codigo == 1) {
      total = quantidade * 4.0;
    }
    else if (codigo == 2) {
      total = quantidade * 4.5;
    }
    else if (codigo == 3) {
      total = quantidade * 5.0;
    }
    else if (codigo == 4) {
      total = quantidade * 2.0;
    }
    else {
      total = quantidade * 1.5;
    }

    System.out.printf("Total: R$ %.2f%n", total);

    sc.close();*/



        // Exercício 06
    /*Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double numero = sc.nextDouble();

    if (numero < 0.0 || numero > 100.0) {
      System.out.println("Fora de intervalo");
    }
    else if (numero <= 25.0) {
      System.out.println("Intervalo [0,25]");
    }
    else if (numero <= 50.0) {
      System.out.println("Intervalo (25,50]");
    }
    else if (numero <= 75.0) {
      System.out.println("Intervalo (50,75]");
    }		
    else {
      System.out.println("Intervalo (75,100]");
    }

    sc.close();*/



        // Exercício 07
    /*Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double x = sc.nextDouble();
    double y = sc.nextDouble();

    if (x == 0.0 && y == 0.0) {
      System.out.println("Origem");
    }
    else if (x == 0.0) {
      System.out.println("Eixo Y");
    }
    else if (y == 0.0) {
      System.out.println("Eixo X");
    }
    else if (x > 0.0 && y > 0.0) {
      System.out.println("Q1");
    }
    else if (x < 0.0 && y > 0.0) {
      System.out.println("Q2");
    }
    else if (x < 0.0 && y < 0.0) {
      System.out.println("Q3");
    }
    else {
      System.out.println("Q4");
    }

    sc.close();*/



        // Exercício 08
    /*Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double salario = sc.nextDouble();

    double imposto;
    if (salario <= 2000.0) {
      imposto = 0.0;
    }
    else if (salario <= 3000.0) {
      imposto = (salario - 2000.0) * 0.08;
    }
    else if (salario <= 4500.0) {
      imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
    }
    else {
      imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
    }

    if (imposto == 0.0) {
      System.out.println("Isento");
    }
    else {
      System.out.printf("R$ %.2f%n", imposto);
    }

    sc.close();*/

    }
} 
