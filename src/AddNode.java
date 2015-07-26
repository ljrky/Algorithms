public class AddNode {

    public static void main(String[] args) {
        System.out.println("add node!");

        Node head = null;

        Node first = new Node();
        first.value = 1;

        Node middle = new Node();
        middle.value = 2;

        Node last = new Node();
        last.value = 3;

        head = AddNode(head,first);
        System.out.println("add first node!");
        PrintList(head);

        head = AddNode(head, middle);
        System.out.println("add a new node!");
        PrintList(head);

        head = AddNode(head,last);
        System.out.println("add another new node!");
        PrintList(head);

    }

    public static void PrintList(Node head){
        while (head != null){
            System.out.println(head.value);
            head = head.next;
        }
    }

    public static Node AddNode(Node head, Node newNode){
//        newNode.next = head;
//        head = newNode;
        Node temp = head;
        head = newNode;
        head.next = temp;
        return head;
    }
}

class Node {
    public int value;
    public Node next;
}
