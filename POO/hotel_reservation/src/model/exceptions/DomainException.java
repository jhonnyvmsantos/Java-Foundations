package model.exceptions;

import java.io.Serial;

//Ao extender da classe "Exception", o compilador obriga a tratar as exceções, diferente da classe "RuntimeException"
public class DomainException extends Exception {
    //Subclasses de "Exception" necessitam ter um "Número de versão" por serem "Seriallizable"
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
