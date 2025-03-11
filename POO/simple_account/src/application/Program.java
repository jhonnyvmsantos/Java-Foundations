package application;

import entities.Account;
import entities.BusinnesAcount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        //OBS: Uma "abstract class" não pode ser instanciada
        //OBS: Toda subclass É UMA superclass, mas com alguns "extras" ou modificações

        Account acc = new Account(1001, "Alex", 1800.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        BusinnesAcount bacc = new BusinnesAcount(1002, "Maria", 2000.0, 500.0);
        bacc.withdraw(400.0);
        System.out.println(bacc.getBalance());

        SavingsAccount sacc = new SavingsAccount(1005, "Julio", 300.0, 0.02);
        sacc.withdraw(100.0);
        System.out.println(sacc.getBalance());

        Account acc01 = bacc; //"Upcasting" - Ato de atribuir um objeto (subclass) à um outro objeto (superclass)
//        acc01.loan(100.0); //Não funciona pois a variavel do tipo Account não contém tal metodo.
        Account acc02 = new BusinnesAcount(1003, "Leo", 0.0, 800.0);
        Account acc03 = new SavingsAccount(1004, "Anna", 1600.0, 0.1);

        //"Polimorfismo" - Quando varias variaveis do mesmo tipo atuam de forma diferente a depender da classe instanciada
        acc.withdraw(50.0); //Operação normal
        acc03.withdraw(50.0); //Operação que sofreu sobreposição
        //O objeto "acc03" é uma instancia diferente da instancia do objeto "acc", embora sejam o mesmo tipo
        System.out.println(acc.getBalance() + " | " + acc03.getBalance());
        //A operação que sofreu sobreposição no obj acc03, manterá sua logica sobreescrita, atuando de forma diferente do obj acc

        BusinnesAcount acc04 = (BusinnesAcount)acc02; // "Downcasting" - Inverso de upcasting
        //OBS: O compilador reconhece como "Erro", então é preciso forçar a conversão atraves de um "casting manual"
        acc04.loan(100.0);

        //Embora não seja reconhecido como um erro, o erro ocorre durante a execução.
//        BusinnesAcount acc05  = (BusinnesAcount)acc03;

        //Verifica se tal objeto é uma instancia de determinada classe
//        if (acc03 instanceof BusinnesAcount) { //FALSE
//            BusinnesAcount acc05  = (BusinnesAcount)acc03;
//            acc05.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (acc03 instanceof SavingsAccount) { //TRUE
//            SavingsAccount acc05  = (SavingsAccount)acc03;
//            acc05.updateBalance();
//            System.out.println("Update!");
//        }
    }
}