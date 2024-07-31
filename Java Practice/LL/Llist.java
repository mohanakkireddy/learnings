package LL;

public class Llist {
    static Node head;
    public static void insert(int data){
        Node n = new Node();
        n.data = data;
        n.next = null;
        if(head == null){
            head = n;
        } else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = n;
        }
    }
    public static void show(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);

    }


    public static void main(String[] args){
        insert(18);
        insert(20);
        insert(30);
        show();

    }
}
