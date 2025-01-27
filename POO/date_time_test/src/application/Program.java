package application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
        //Para converter do horario global GMT (UTC), necessita especificar uma timezone especifica

        //Objetos data/hora são objetos com valores imutáveis (constantes)
        LocalDate dLocal = LocalDate.now(); //Traz apenas a data local
        LocalDateTime dtLocal = LocalDateTime.now(); //Traz a data/hora local
        Instant dtGlobal = Instant.now(); //Traz a data/hora local convertida para a data/hora global GMT (UTC)

        //Constante de um obj "date" convertida de uma data customizada
        final LocalDate fDate = LocalDate.parse("09/08/2019", dFormat);
//        System.out.println("Data constante: " + fDate);

        final LocalDateTime fDateTime = LocalDateTime.parse("09/08/2006 00:00", dtFormat);
//        System.out.println("Data/Hora constante: " + fDateTime);

        //Classe com foco em calculo entre diferentes datas
        Duration dtPast = Duration.between(fDateTime, dtLocal);
        //OBS: O OBJ "Instant" FUNCIONA IGUAL AO OBJ "LocalDateTime"

        //MétodoS para converter um "LocalDate" para um "LocalDateTime" ao adicionar "tempo"
        Duration dPast = Duration.between(fDate.atStartOfDay(), dLocal.atTime(0, 0));
        //OBS: A CLASSE "DURATION" ACEITA APENAS OBJ'S "LocalDateTime", ENT NECESSITA CONVERTER O OBJ "LocalDate"...

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

        //Transformando do horario de São Paulo (TZ: -3:00) para o global
//        dtGlobal = Instant.parse("2020-04-02T12:00:10-03:00");

        //Convetendo para obj "date" atraves de um formato customizado
//        dLocal = LocalDate.parse("11/02/2012", dFormat);
//        dtLocal = LocalDateTime.parse("11/02/2012 21:09", dtFormat);

        //Objeto está sendo automáticamente transformado em String pelo método "toString"...
        System.out.println("Data Local: " + dLocal);
        System.out.println("Data/Hora Local: " + dtLocal);
        System.out.println("Data/Hora Local -> Global: " + dtGlobal);

        //Transforma o horario de londres na timezone local (Pode especificar outra timezone...)
        System.out.println("Data/Hora Global -> Local: " + LocalDateTime.ofInstant(dtGlobal, ZoneId.systemDefault()));
        System.out.println("Data/Hora Global -> Tokyo: " + LocalDateTime.ofInstant(dtGlobal, ZoneId.of("Asia/Tokyo")));

        //Método para subtrair uma qtd de dias de uma data
        System.out.println("Data/Hora Local (-7 dias): " + dLocal.minusDays(7));
        //Método para adicionar uma qtd de semanas em uma data
        System.out.println("Data/Hora Local (+5 semanas): " + dLocal.plusWeeks(5));
        //OBS: COM MÉTODOS "plus" E "minus", É POSSÍVEL MANIPULAR OS DADOS DE UM OBJ "date" E REALIZAR CALCULOS

        //Instant tem seus dados (date) manipulados de forma diferente... "ChronoUnit" permite escolher o dado a ser manipulado
        System.out.println("Data/Hora Global (+7 dias): " + dtGlobal.plus(7, ChronoUnit.DAYS));
//        System.out.println("Data/Hora Global (-2 anos): " + dtGlobal.minus(2, ChronoUnit.YEARS));
        //OBS: OS MÉTODOS "plus" E "minus", EM INSTANT, NÃO SUPORTAM UNIDADES DE MEDIDAS ACIMA DE DIAS...

        //Método para contar os dias entre uma data e outra
        System.out.println("Diferença em dias (Data/Hora): " + dtPast.toDays());
        System.out.println("Diferença em dias (Data): " + dPast.toDays());

        //Transformando obj "date" para um formato customizado...
//        System.out.println("Data Local: " + dLocal.format(dFormat));
//        System.out.println("Data/Hora Global -> Local: " + zFormat.format(dtGlobal));


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