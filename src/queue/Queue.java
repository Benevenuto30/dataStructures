package queue;

public class Queue {

    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.enQueue(9);
        myQueue.enQueue(3);
        myQueue.enQueue(2);
        myQueue.enQueue(1);

        myQueue.peak();
        myQueue.deQueue();
        myQueue.display();
    }

    int queueLength = 4;
    int items[] = new int[queueLength];
    int front = -1;
    int back = -1;

    boolean isFull() {
        if (back == queueLength - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (front == -1 && back == -1) {
            return true;
        } else {
            return false;
        }
    }


    void enQueue(int itemValue) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1 && back == -1) {
            front = back = 0;
            items[back] = itemValue;
        } else {
            back++;
            items[back] = itemValue;
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue");
        } else if (front == back) {
            front = back = -1;
        } else {
            front++;
        }
    }

    void display() {
        int i;

        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= back; i++) {
                System.out.println(items[i]);
            }
        }
    }

    void peak() {
        System.out.println("Front value is: " + items[front]);
    }
}
