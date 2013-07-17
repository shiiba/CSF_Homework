public class IntListNode {
    // Variables
    int nodeValue;
    IntListNode nextNode;

    // Constructors
    public IntListNode(int value, IntListNode next) {
        this.nodeValue = value;
        this.nextNode = next;
    }

    // Getters and Setters
    public int getValue() {
        return this.nodeValue;
    }

    public void setValue(int value) {
        this.nodeValue = value;
    }

    public IntListNode getNext() {
         return this.nextNode;
    }

    public void setNext(IntListNode next) {
        this.nextNode = next;
    }


}
