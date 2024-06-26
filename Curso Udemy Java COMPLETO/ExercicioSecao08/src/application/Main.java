package application;

import java.awt.*;
import java.util.Scanner;
import java.util.Locale;
import entities.Bank;
import entities.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        Account account;
        if(response == 'y' || response == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else{
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        // Meu código
        /*System.out.print("Enter account number: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String resposta = sc.nextLine();

        Bank bank;
        if(resposta.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            double saldo = sc.nextDouble();
            bank = new Bank(conta, name, saldo);
        } else {
            bank = new Bank(conta, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        bank.deposito(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        bank.sacar(sc.nextDouble());
        System.out.println("Update account data: ");
        System.out.println(bank);*/

        sc.close();

    }

}