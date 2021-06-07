package util.stack_queues;

public class Main {
    public static void main(String[] args) {
        Stacks newStack = new Stacks();
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        System.out.println(newStack.isEmpty());
        System.out.println(newStack.peek());
        System.out.println(newStack.pop());
        System.out.println(newStack.peek());

    }
}
