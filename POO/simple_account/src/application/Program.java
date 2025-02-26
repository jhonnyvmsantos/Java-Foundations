package application;

import entities.Account;
import entities.BusinnesAcount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //OBS: Toda subclass É UMA superclass, mas com alguns "extras" ou modificações

        Account acc = new Account(1001, "Alex", 0.0);
        BusinnesAcount bacc = new BusinnesAcount(1002, "Maria", 0.0, 500.0);

        Account acc01 = bacc; //"Upcasting" - Ato de atribuir um objeto (subclass) à um outro objeto (superclass)
//        acc01.loan(100.0); //Não funciona pois a variavel do tipo Account não contém tal metodo.
        Account acc02 = new BusinnesAcount(1003, "Leo", 0.0, 800.0);
        Account acc03 = new SavingsAccount(1004, "Anna", 0.0, 0.1);

        BusinnesAcount acc04 = (BusinnesAcount)acc02; // "Downcasting" - Inverso de upcasting
        //OBS: O compilador reconhece como "Erro", então é preciso forçar a conversão atraves de um "casting manual"
        acc04.loan(100.0);

        //Embora não seja reconhecido como um erro, o erro ocorre durante a execução.
//        BusinnesAcount acc05  = (BusinnesAcount)acc03;

        //Veririfca se tal objeto é uma instancia de tal classe
        if (acc03 instanceof BusinnesAcount) {
            BusinnesAcount acc05  = (BusinnesAcount)acc03;
            acc05.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc03 instanceof SavingsAccount) {
            SavingsAccount acc05  = (SavingsAccount)acc03;
            acc05.updateBalance();
            System.out.println("Update!");
        }
    }
}