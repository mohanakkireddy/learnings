public class Fibonacci {
    public static void fib(int x){
        int first =0;
        int sec= 1;
        for (int i=0; i<x; i++ ){
            System.out.println(first + "");
            int next = first+sec;
            first= sec;
            sec=next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int x= 10;
        fib(x);
    }
}
