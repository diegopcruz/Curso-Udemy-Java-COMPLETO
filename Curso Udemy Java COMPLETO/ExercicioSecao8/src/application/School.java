package application;

import java.util.Scanner;
import entities.Student;

public class School {
    public static void main(String[] args){
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir o nome e as notas do aluno
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite as três notas do aluno:");
        double notaPrimeiroTrimestre = scanner.nextDouble();
        double notaSegundoTrimestre = scanner.nextDouble();
        double notaTerceiroTrimestre = scanner.nextDouble();

        // Criar um objeto Student com os valores fornecidos pelo usuário
        Student student = new Student(nome, notaPrimeiroTrimestre, notaSegundoTrimestre, notaTerceiroTrimestre);

        // Calcular e mostrar a nota final do aluno
        double notaFinal = student.notaFinal();
        System.out.printf("Nota final: %.2f%n", notaFinal);

        // Verificar se o aluno está aprovado e mostrar a mensagem correspondente
        if (student.isAprovado()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Faltaram %.2f pontos%n", student.pontosFaltando());
        }

        // Fechar o objeto Scanner
        scanner.close();
    }
}
