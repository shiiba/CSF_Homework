public class IntArraySorter {

    public int[] sortArray(int[] array) {
<<<<<<< HEAD
        // For each number in the array
        // Look at every number after it, in sequence
        // If the first number is greater than the second, swap them
=======
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
>>>>>>> 0a0b612d688e76e42b1735c40ee87acee384e48e

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }
}