package entities;

public class Student {
    // Atributos para armazenar o nome e as notas do aluno
    public String nome;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    // Construtor para inicializar os atributos
    public Student(String nome, double notaPrimeiroTrimestre, double notaSegundoTrimestre, double notaTerceiroTrimestre) {
        this.nome = nome;
        this.notaPrimeiroTrimestre = notaPrimeiroTrimestre;
        this.notaSegundoTrimestre = notaSegundoTrimestre;
        this.notaTerceiroTrimestre = notaTerceiroTrimestre;
    }

    // Método para calcular a nota final do aluno
    public double notaFinal() {
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    // Método para verificar se o aluno está aprovado
    public boolean isAprovado() {
        return notaFinal() >= 60;
    }

    // Método para calcular quantos pontos faltam para o aluno ser aprovado
    public double pontosFaltando() {
        if (isAprovado()) {
            return 0;
        } else {
            return 60 - notaFinal();
        }
    }
}
