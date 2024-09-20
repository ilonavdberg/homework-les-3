import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> map;

    public Translator(Integer[] numeric, String[] alphabetic) {
        this.map = setMap(numeric, alphabetic);
    }

    public String translate(Integer num) {
        if (map.containsKey(num)) {
            return map.get(num);
        }
        return null;
    }

    private HashMap<Integer, String> setMap(Integer[] numeric, String[] alphabetic) throws IllegalArgumentException {
        HashMap<Integer, String> map = new HashMap<>();
        if (numeric.length != alphabetic.length) {
            throw new IllegalArgumentException("numeric and alphabetic arrays must have the same length");
        }
        for (int i = 0; i < numeric.length; i++) {
            map.put(numeric[i], alphabetic[i]);
        }
        return map;
    }
}
