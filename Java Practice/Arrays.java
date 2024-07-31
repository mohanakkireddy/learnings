import java.util.Scanner;
import java.util.stream.Stream;

public class Arrays {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the size of the array:");
//        int x = scan.nextInt();
//        int [] array = new int[x];
//        for (int i =0; i<x; i++){
//            array[i] = scan.nextInt();
//        }
//        System.out.println("Output:");
//        for (int i:array){
//            System.out.println(i);
//        }
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int [] [] array = new int[3][5];
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
