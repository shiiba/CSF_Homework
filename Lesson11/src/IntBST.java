import java.util.LinkedList;


public class IntBST {
    private IntNode rootNode;

    public void printBFS() {
        // TODO: Implement a BFS of a tree using a queue
        System.out.print("BFS of BST:" );
    }

    public void printDFS() {
        // TODO: Impelement a DFS (of your choice) of a tree using recursion
        System.out.println("DFS of BST:" );
    }

    public void valuesGreaterThan(int n) {
        // TODO: Prints out values that are greater than or equal to n.
        // Do this with the lowest computational complexity you can manage.
        System.out.println("Values in tree greater than " + n + ":");
    }

    public void insertValue(int value) {
        if (rootNode == null) {
            rootNode = new IntNode(value);
        }
        else {
            IntNode currentNode = rootNode;

            while (currentNode.getValue() != value) {
                if (value > currentNode.getValue()) { // Right child path
                    if (currentNode.getRightChild() == null) {
                        currentNode.setRightChild(new IntNode(value));
                    }
                    currentNode = currentNode.getRightChild();
                }
                else { // Left child path
                    if (currentNode.getLeftChild() == null) {
                        currentNode.setLeftChild(new IntNode(value));
                    }
                    currentNode = currentNode.getLeftChild();
                }
            }
        }
    }

    public boolean search(int value) {
        IntNode currentNode = rootNode;

        while(currentNode != null && (currentNode.getValue() != value)) {
            if (value > currentNode.getValue()) { // Continue down the right child path
                currentNode = currentNode.getRightChild();
            }
            else { // Continue down the left child path
                currentNode = currentNode.getLeftChild();
            }
        }
        // If the current node exists and its value is equal to the input, return true, else return false
        return currentNode != null && (currentNode.getValue() == value);
    }
}
