public class Main {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office Desk";

        byte age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);

        System.out.printf("%s years old, code %s and gender: %S\n", age, code, gender);
        System.out.printf("US decimal point: %.3f\n", measure);

    }

}
