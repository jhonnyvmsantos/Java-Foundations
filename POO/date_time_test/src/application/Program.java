package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        //"DateTimeFormatter" serve para definir padrões customizados de data/hora
        DateTimeFormatter dFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Data customizada
//        DateTimeFormatter tFormat = DateTimeFormatter.ISO_DATE_TIME; //Data/Hora definida previamente (Veja o site)
        DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //Data/Hora customizada

        //"WithZone" converte a data/hora equivalente à timezone alocada e "ZoneId.systemDefault()" pega a timezone local
        DateTimeFormatter zFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //Para converter do horario global (Instant - UTC || GMT), necessita especificar uma timezone especifica

        //Objetos data/hora são objetos com valores imutáveis (constantes)
        LocalDate dLocal = LocalDate.now(); //Traz apenas a data local
        LocalDateTime dtLocal = LocalDateTime.now(); //Traz a data/hora local
        Instant dtGlobal = Instant.now(); //Traz a data/hora local convertida para o de londres (Global - UTC || GMT)

        //Método para conseguir um obj "date" a partir de dados isolados
//        dLocal = LocalDate.of(2022, 7, 10);

        //OBS: É POSSÍVEL PEGAR OS DADOS ISOLADOS DE UM OBJ "LocalDate".
//        System.out.println(dLocal.getDayOfMonth());
//        System.out.println(dLocal.getMonth()); //Mês em escrito
//        System.out.println(dLocal.getMonthValue()); //Mês em número
//        System.out.println(dLocal.getYear());

        //Além dos métodos do "LocalDate", o obj "LocalDateTime" contém os seguintes metodos:
//        System.out.println(dtLocal.getHour());
//        System.out.println(dtLocal.getMinute());

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
        System.out.println("Data/Hora Local -> Londres: " + dtGlobal);

        //Transforma o horario de londres na timezone local (Pode especificar outra timezone...)
        System.out.println("Data/Hora Londres -> Local: " + LocalDateTime.ofInstant(dtGlobal, ZoneId.systemDefault()));
        System.out.println("Data/Hora Londres -> Tokyo: " + LocalDateTime.ofInstant(dtGlobal, ZoneId.of("Asia/Tokyo")));

        //Transformando obj "date" para um formato customizado...
//        System.out.println("Data Local: " + dLocal.format(dFormat));
//        System.out.println("Data/Hora Londres -> Local: " + zFormat.format(dtGlobal));


//        System.out.print("Trazer a lista de TimeZone's? ");
//        char verification = sc.next().charAt(0);
//        if (verification == 'y') {
//            zone_list();
//        }

        sc.close();

    }

    public static void zone_list() {
        //"ZoneId.getAvailableZoneIds()" traz a lista com todas as timezones disponiveis
        for (String e : ZoneId.getAvailableZoneIds()) {
            System.out.println(e);
        }
    }

}