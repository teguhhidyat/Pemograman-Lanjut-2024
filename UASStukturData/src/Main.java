import bag.Bag;
import queue.QueueNode;
import stack.StackNode;

public class Main {
    public static void main(String[] args) {

        StackNode<String> names = new StackNode<>();
        names.push("Teguh Hidayat");
        names.push("Alif");
        names.push("Baim");
        System.out.println(names.isEmpty());
        names.displayStack();

        System.out.println(names.peek());
        System.out.println(names.POP());
        names.displayStack();


    }
}
