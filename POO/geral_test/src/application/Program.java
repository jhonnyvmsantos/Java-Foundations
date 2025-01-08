package application;

import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int x = 102;

//        Object obj = x; //"Boxing" (Conversão de um obj tipo primitivo valor para tipo referencial)
        Integer obj; //"Wrapper Class" (Tipo refencial para um tipo primitivo. Ex: Boolean, Char, Number...)
        //Wrapper Class são classes, sendo, normalmente, usadas no lugar de tipos primitivos (Iniciam "null")
        obj = x;

        //"Unboxing" (Conversão do tipo referêncial pro tipo valor)
//        int y = (int) obj - 3; //Casting pro tipo INT
        int y = obj - 3;

        System.out.println(x + " | " + y);
    }
}