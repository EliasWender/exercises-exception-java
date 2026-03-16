package model.entities;

import model.exceptions.DomainException;

import java.text.ParseException;

public class ContaBancaria {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public ContaBancaria(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }


    public String getHolder() {
        return holder;
    }



    public Double getBalance() {
        return balance;
    }



    public Double getWithdrawLimit() {
        return withdrawLimit;
    }



    public void deposit(Double amount) {
    balance += amount;
}

public void withdraw(Double amount) throws DomainException{



        if (amount > withdrawLimit) {
            throw new DomainException ("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainException("Withdraw error: The amount exceeds balance");
        }

        else {
            balance -= amount;
        }


}


}
