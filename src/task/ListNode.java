package task;


//1 -> 2 -> 3 -> null
//3 -> 2 -> 1 -> null
// Apache Maven — основы
public class ListNode {
    Node head;

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
    }

    public static Node reverseNode(Node head) {
        if (head == null) return null;

        Node current = head; //1
        Node previous = null; //0
        Node nextNode = null; //0

        while (current.nextNode != null) { //current.nextNode == 2, 3
            nextNode = current.nextNode; //nextNode == 2, 3
            current.nextNode = previous; //2.nextNode = 0, 1
            previous = current; //previous = 1, 2
            current = nextNode; //current = 2, 3
        }
        return null;
    }
}

class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

