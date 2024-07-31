import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static void dupes(String str){
        Map<Character, Integer> countmap = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char i : chars){
            if (countmap.containsKey(i)){
                countmap.put(i, countmap.get(i)+1);
            }else {
                countmap.put(i, 1);
            }
        }
        System.out.println("Duplicate characters and their counts in the given string:");
        for (Map.Entry<Character, Integer> entry : countmap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    public static void main(String[] args){
        String str = "mohanmohan";
        dupes(str);
    }
}
