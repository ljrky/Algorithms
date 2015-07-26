public class NodeChains {

    public static void main(String[] args) {
        System.out.println("Node Chains!");

        NodeSample first = new NodeSample();
        first.value = 1;

        NodeSample middle = new NodeSample();
        middle.value = 2;

        first.next = middle;

        NodeSample last = new NodeSample();
        last.value = 3;

        middle.next = last;

        PrintList(first);
    }

    public static void PrintList(NodeSample first){
        while (first != null){
            System.out.println(first.value);
            first = first.next;
        }
    }

}

class NodeSample {
    public int value;
    public NodeSample next;
}
