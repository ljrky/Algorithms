import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StackWithArray {

    public static void main(String[] args) {
        System.out.println("Stack implemented using array!");

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
        return array.remove(array.size() - 1);
    }

    static public int peak(List<Integer> array){
        return array.get(array.size() - 1);
    }

    static public void enumerator(List<Integer> array){
        for (int i = (array.size() - 1); i >= 0; i--) {
            System.out.println(array.get(i));
        }
    }
}
