import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen

        HashSet<Integer> secretnumber = randomnumbergenerator();
        System.out.println(secretnumber);
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(stringnumber);

    }

    public static HashSet randomnumbergenerator(){
        HashSet<Integer> randomNumbers = new HashSet<Integer>();

        while(randomNumbers.size() < 4){
            int randomNumber = (int) (Math.random() * 10);
            randomNumbers.add(randomNumber);
        }
        return randomNumbers;
    }

    public static String setToStringConverter(HashSet<Integer> set) {
        StringBuilder numberString = new StringBuilder();

        for (int item : set) {
            numberString.append(item);
        }

        return numberString.toString();
    }



    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");

        while (true) {
            feedback.setLength(0);
            System.out.println("Doe een gok, Let op vul 4 getallen in.");
            String guess = scanner.nextLine();
            if (Objects.equals(guess, stringnumber)) {
                System.out.println("gefeliciteerd je hebt het goed");
                break;
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("0");
                    } else {
                        feedback.append("X");
                    }
                }
            }
            System.out.println(feedback.toString());
        }

    }
}

//Waarom is een Hasset geen goede keuze voor deze opdracht?
//Omdat een secret code nooit twee dezelfde cijfers kan bevatten