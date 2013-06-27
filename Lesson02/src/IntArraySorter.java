public class IntArraySorter {

    public int[] sortArray(int[] array) {
        // Selection Sort - One of the conceptually simpler sorting algorithms; not terribly efficient
        // For each element in the array;
        // For inspectedElement in array after element;
        // If element > inspectedElement;
        // swap(element, inspectedElement);
        for (int i = 0; i <= array.length; i++ ) {
            for (int j = i+1; j < array.length; j++) {
                int element = array[i];
                int inspectedElement = array[j];

                if (element > inspectedElement) {
                    array[i] = inspectedElement;
                    array[j] = element;
                }
            }
        }

        return array;
    }
}