import java.util.ArrayList;
import java.util.List;

public class QueueWithArray {

    public static void main(String[] args) {
        System.out.println("Queue implemented using array!");

        List<Integer> array = new ArrayList<>();

        push(array,10);
        push(array,20);
        push(array,30);
        push(array,40);
        enumerator(array);

        System.out.println("Pop one item : " + pop(array));
        System.out.println("Pop one item : " + pop(array));
        enumerator(array);

        System.out.println("Peak one item : " + peak(array));
        enumerator(array);
    }

    static public void push(List<Integer> array, int element){
        array.add(element);
    }

    static public int pop(List<Integer> array){
        return array.remove(0);
    }

    static public int peak(List<Integer> array){
        return array.get(0);
    }

    static public void enumerator(List<Integer> array){
        array.forEach(System.out::println);
    }
}
