//import javax.swing.text.DateFormatter;
//import java.lang.reflect.Array;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//import java.util.Arrays;
//import java.util.stream.Stream;
//
//public class Five {
//    public static void main (String[] args){
//        try{
//            List<Integer> number = Arrays.asList(1,2,3,4,5);
//            Stream<Integer> filtered = number.stream()
//                                .filter(n->n%2!= 0)
//                                .map(n-> n*9);
//            filtered.forEach(n-> System.out.println(n));
//            //            number.forEach(n-> System.out.println(n));
//        } catch (Exception e){
//            System.out.println("Something wentwrong");
//        }
//
//        try{
////            Date
//            LocalDate date  = LocalDate.now();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
//            String formattedDate = date.format(formatter);
//            System.out.println(formattedDate);
////            ArrayList
//            ArrayList<Integer> numbers = new ArrayList<Integer>();
//            numbers.add(10);
//            numbers.add(2);
//            numbers.add(3);
//            numbers.add(4);
//            numbers.add(5);
//            numbers.add(6);
//            Collections.sort(numbers);
//            for (int i: numbers){
//                System.out.println(i);
//            }
////            LinkedList
//            LinkedList<String> cars = new LinkedList<String>();
//            cars.add("BMW");
//            cars.add("Ford");
//            cars.add("Ferrari");
//
//            cars.addFirst("Mercedes");
//            System.out.println(cars);
//
////            HashMap
//            HashMap<Integer, String> peeps = new HashMap<Integer, String>();
//            peeps.put(1, "Mohan");
//            peeps.put(2, "Bhav");
//            peeps.put(3, "Reddy");
//            peeps.put(4, "Kumar");
//            for (int i : peeps.keySet()){
//                System.out.println(i);
//            }
//            for (String i : peeps.values()){
//                System.out.println(i);
//            }
////            HashSet
//            HashSet<Integer> rolls = new HashSet<Integer>();
//            rolls.add(101);
//            rolls.add(102);
//            rolls.add(103);
//            rolls.add(103);
//            System.out.println(rolls);
//            for (int i : rolls){
//                System.out.println(i);
//            }
////            Iterator
//            Iterator<Integer> it = rolls.iterator();
//            System.out.println(it.next());
//            while (it.hasNext()){
//                System.out.println(it.next());
//            }
//        } catch (Exception e){
//            System.out.println("Wrong Date");
//        }finally {
//            System.out.println("Completed");
//        }
//
//    }
//}
