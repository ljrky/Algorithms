import java.util.LinkedList;
import java.util.List;

public class QueueWithLinkedList {

    public static void main(String[] args) {
        System.out.println("Queue implemented using linked list!");

        List<Integer> linkedlist = new LinkedList<>();

        push(linkedlist,10);
        push(linkedlist,20);
        push(linkedlist,30);
        push(linkedlist,40);
        enumerator(linkedlist);

        System.out.println("Pop one item : " + pop(linkedlist));
        System.out.println("Pop one item : " + pop(linkedlist));
        enumerator(linkedlist);

        System.out.println("peak one item : " + peak(linkedlist));
        enumerator(linkedlist);
    }

    static public void push(List<Integer> linkedlist, int element){
        linkedlist.add(element);
    }

    static public int pop(List<Integer> linkedlist){
        return linkedlist.remove(0);
    }

    static public int peak(List<Integer> linkedlist){
        return linkedlist.get(0);
    }

    static public void enumerator(List<Integer> linkedlist){
        linkedlist.forEach(System.out::println);
    }
}
