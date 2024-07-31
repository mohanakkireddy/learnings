
class Container<T>{
   private T total;

    public T getTotal() {
        return total;
    }

    public void setTotal(T total) {
        this.total = total;
    }
}
public class Generics {
    public static void main(String[] args){
        Container<Integer> obj = new Container<>();
        obj.setTotal(2);
        System.out.println(obj.getTotal());
    }
}
