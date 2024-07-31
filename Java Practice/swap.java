import java.sql.Array;
import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = input.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the numbers");

        for (int i=0; i<size; i++){
            a[i] = input.nextInt();
        }
        input.close();
        for (int i =0; i<size; i++){
            System.out.println(a[i]);
        }

//        System.out.println("Enter the second number");
//        int b = input.nextInt();
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("Swapped numbers are  " + a + "and" + b);
//        if (a==2){
//            System.out.println("Not a prime number");
//        }
//        else if (a%2==0 || a%3==0){
//            System.out.println("Not a prime number");
//        } else {
//            System.out.println("Prime");
//        }





    }
}
