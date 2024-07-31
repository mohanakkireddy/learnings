import java.util.ArrayList;

public class One {

    public static void main(String[] args){
    Three result = (a, b) -> a+b;
    int raw= result.add(1,2);
        System.out.println(raw);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(201);
        scores.add(202);
        scores.add(203);
        scores.add(204);
        scores.add(205);
        scores.forEach(n-> System.out.println(n));



    }

}
