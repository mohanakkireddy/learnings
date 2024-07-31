import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Paranthesis {
    static boolean para(String s){
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if (map.containsValue(c)){
                stack.push(c);
            } else {
                if (stack.empty() || stack.pop() != map.get(c)){
                    return false;
                }
            }
        }
        return stack.empty();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the characters");
        String s = input.nextLine();
        input.close();

        Boolean result = para(s);
        System.out.println(result);
    }
}
