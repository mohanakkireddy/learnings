import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Threads extends Thread {
   public static void main(String[] args){
       List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       int i =0;
       while (i < 4){
           System.out.println(numbers.get(i));
           i++;

       }
       Stream<Integer> desc = numbers.stream()
               .sorted(Comparator.reverseOrder());
       desc.forEach(n-> System.out.println(n));

        Stream.iterate(new int[]{0,1}, series-> new int[]{series[1], series[0]+ series[1]})
               .limit(10)
                .mapToInt(series-> series[0] )
                .forEach(n-> System.out.println(n));

    }

}
