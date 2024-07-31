import java.util.*;

public class Practice {
    public static boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsValue(c)){
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();



    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = input.nextLine();
        input.close();
        Boolean result = isValid(s);
        System.out.println(result);


    }
}

