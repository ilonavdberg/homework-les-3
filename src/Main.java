import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeric = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        String[] alphabetic = { "een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen" };

        Translator translator = new Translator(numeric, alphabetic);

        while (true) {
            System.out.println("Typ 'v' om te vertalen \nTyp 'x' om te stoppen");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                break;
            }
            if (!input.equals("v")) {
                System.out.println("Ongeldige invoer!");
                continue;
            }
            System.out.println("Typ een cijfer van 1 t/m 9");
            Integer number = scanner.nextInt();
            scanner.nextLine();

            String result = translator.translate(number);
            if (result == null) {
                System.out.println("Ongeldige invoer!");
                continue;
            }
            System.out.println("De vertaling van " + number + " is: " + result);
        }
    }
}
