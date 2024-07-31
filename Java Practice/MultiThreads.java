public class MultiThreads extends Thread{
    public static void main(String[] args){
        MultiThreads multiThreads = new MultiThreads();
        multiThreads.start();
        System.out.println("Out");
    }
    public void run(){
        System.out.println();
    }
}
