import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> map;

    public Translator(Integer[] numeric, String[] alphabetic) {
        this.map = setMap(numeric, alphabetic);
    }

    public String translate(Integer num) {
        return map.get(num);
    }

    private HashMap<Integer, String> setMap(Integer[] numeric, String[] alphabetic) {
        HashMap<Integer, String> map = new HashMap<>();
        if (numeric.length != alphabetic.length) {
            System.out.println("Invalid input. Array lengths don't match!");
            return null;
        }
        for (int i = 0; i < numeric.length; i++) {
            map.put(numeric[i], alphabetic[i]);
        }
        return map;
    }
}
