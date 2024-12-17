package course;

public class Program {

    public static void main(String[] args) {
       String original = "    abcd EFGH IjK lMn DCba    ";

       System.out.printf("toLowerCase: - %s -\n", original.toLowerCase()); //Transformar tudo em minusculo
       System.out.printf("toUpperCase: - %s -\n", original.toUpperCase()); //Transformar tudo em maiusculo
       System.out.printf("trim: - %s -\n", original.trim()); //Retirar espaços em brancos no começo ou fim da string

       System.out.printf("substring (No End): - %s -\n", original.substring(2)); //Recortar do caractere 2 adiante
       System.out.printf("substring: - %s -\n", original.substring(2, 10)); //Recortar do caractere 2 até o 10
       System.out.printf("replace: - %s -\n", original.replace(" ", "-")); //Trocar uma letra ou conjunt de letras por outro(s)

       System.out.printf("indexOf: - %s -\n", original.indexOf("a")); //Trazer o index da primeira aparição
       System.out.printf("lastIndexOf: - %s -\n", original.lastIndexOf("a")); //Trazer o index da ultima aparição
    }
}