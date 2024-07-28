package stacks;

import java.util.ArrayList;

public class Stack {

    public static void main(String args[]) {
        Stack.StackMethods s = new Stack.StackMethods();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        s.push(34);
        s.push(16);
        s.print();
        System.out.println(s.pop());
        s.print();

    }

    static class StackMethods {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return (list.size() == 0);
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty() == true)
                return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty())
                return -1;
            return list.get(list.size() - 1);
        }

        public static void print() {
            for (int i = 0; i <= list.size() - 1; i++) {
                System.out.println(list);
            }
        }
    }
}
