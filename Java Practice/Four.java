import java.lang.reflect.Array;
import java.util.ArrayList;

public class Four{
    public static void main(String[] args){
        ArrayList<String> family = new ArrayList<String>();
        family.add("Mohan");
        family.add("M");
        family.add("han");
        family.add("han");
        family.add("Mhan");
        family.forEach((n)->{
            System.out.println(n);
        });

    }


}
