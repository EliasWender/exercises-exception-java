import model.entities.ContaBancaria;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            sc.nextLine();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            sc.nextLine();
            ContaBancaria contaBancaria = new ContaBancaria(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double withdraw = sc.nextDouble();


            contaBancaria.withdraw(withdraw);
            sc.nextLine();
            System.out.print("New Balance: " + contaBancaria.getBalance());
        }
        catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }













        sc.close();

    }
}