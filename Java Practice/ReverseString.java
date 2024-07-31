import java.util.Scanner;

public class ReverseString {
    public static String rev(String org){
        String reversedStr = "";
        for (int i =0; i<org.length(); i++){
            reversedStr = org.charAt(i) + reversedStr;
        }
        return reversedStr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String org = input.nextLine();
        String result = rev(org);
        System.out.println(result);
    }
}
