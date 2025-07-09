class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insertBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            System.out.println("Deleted: " + head.data);
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else if (head.next == null) {
            System.out.println("Deleted: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted: " + temp.next.data);
            temp.next = null;
        }
    }

    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int count = 1;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void reverseList() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertBeg(100);
        list.insertBeg(200);
        list.insertBeg(300);
        list.insertBeg(400);

        System.out.print("Initial List: ");
        list.printList();

        list.reverseList();
        System.out.print("After Reversing: ");
        list.printList();
    }
}
