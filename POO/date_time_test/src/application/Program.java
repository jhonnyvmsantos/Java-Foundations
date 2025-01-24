package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        //"DateTimeFormatter" serve para definir padrões customizados de data/hora
        DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Data customizada
//        DateTimeFormatter tFormat = DateTimeFormatter.ISO_DATE_TIME; //Data/Hora definida previamente (Veja o site)
        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Data/Hora customizada

        //"WithZone" converte a data/hora equivalente à timezone alocada e "ZoneId.systemDefault()" pega a timezone local
        DateTimeFormatter zFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //Para converter do horario global (Instant - UTC || GMT), necessita especificar uma timezone especifica

        LocalDate dLocal = LocalDate.now(); //Traz apenas a data local
        LocalDateTime dtLocal = LocalDateTime.now(); //Traz a data e hora local
        Instant dtGlobal = Instant.now(); //Traz a data e hora de londres (Global - UTC || GMT)

        //Método para conseguir um obj "date" a partir de dados isolados
//        dLocal = LocalDate.of(2022, 7, 10);

        //Converter texto (Formato ISO 8601) para um objeto "date"...
//        dLocal = LocalDate.parse("2022-01-11");
//        dtLocal = LocalDateTime.parse("2024-01-24T18:00:00");
//        dtGlobal = Instant.parse("2020-04-02T12:00:10Z");
        //Transformando do horario de São Paulo (-3:00) para o de Londres
//        dtGlobal = Instant.parse("2020-04-02T12:00:10-03:00");
        //Convetendo para obj "date" atraves de um formato customizado
//        dLocal = LocalDate.parse("11/02/2012", dFormat);
//        dtLocal = LocalDateTime.parse("11/02/2012 21:09", dtFormat);

        //Objeto está sendo automáticamente transformado em String pelo método "toString"...
        System.out.println("Data Local: " + dLocal);
        System.out.println("Data/Hora Local: " + dtLocal);
        System.out.println("Data/Hora Londres: " + dtGlobal);
        //Transformando obj "date" para um formato customizado...
//        System.out.println("Data Local: " + dLocal.format(dFormat));
//        System.out.println("Data/Hora Londres: " + zFormat.format(dtGlobal));

    }

}