package entities;

public class Bank {
    private int conta;
    private String name;
    private double saldo;

    public Bank(int conta, String name, double depositoInicial) {
        this.conta = conta;
        this.name = name;
        this.saldo = depositoInicial;
    }

    public Bank(int conta, String name) {
        this.conta = conta;
        this.name = name;
        this.saldo = 0.0;
    }

    public int getConta() {
        return conta;
    }

    public String getName() {
        return name;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposito(double quantia){
        if(quantia > 0){
            saldo += quantia;
        }
    }

    public void sacar(double quantia){
        saldo -= (quantia + 5.00);
    }

    @Override
    public String toString() {
        return "Account: " + conta + ", Holder: " + name + ", Balance: $" + String.format("%.2f", saldo);
    }

}
