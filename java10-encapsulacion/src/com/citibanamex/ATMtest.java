package com.citibanamex;

public class ATMtest {
    public static void main(String[] args) {
        ATM myAtm = new ATM(10_000);       
        System.out.println("Initial Balance: " + myAtm.getBalance());
 
        try {
            myAtm.deposit(1);
            myAtm.withdraw(10_001);
            myAtm.deposit(4_322);
            myAtm.withdraw(300);
            myAtm.withdraw(45);
            myAtm.deposit(3_000);
            myAtm.withdraw(900);
            myAtm.withdraw(665);
            myAtm.deposit(1_000);
            //myAtm.printLog();
            System.out.println(myAtm.printAllRegisters());
            System.out.println(">>>>>>>>>>");
            System.out.println(myAtm.printAllDeposit());

            
            System.out.println("\nFinal Balance: " + myAtm.getBalance());
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        } catch (OverTheBalanceException e) {
            e.printStackTrace();
        }
    }
}
