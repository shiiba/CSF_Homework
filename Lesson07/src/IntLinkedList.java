public class IntLinkedList {
    // Variables
    IntListNode firstNode;

    // Constructor
    public IntLinkedList(int value) {
       firstNode = new IntListNode(value, null);
    }



    // Methods
    public void insert(int value) {
        while (firstNode.getNext() != null) {
            IntListNode element = new IntListNode(value, null);


            firstNode = firstNode.nextNode;
        }

    }


    public void print() {
        System.out.println(newNode.nodeValue);
    }

}
