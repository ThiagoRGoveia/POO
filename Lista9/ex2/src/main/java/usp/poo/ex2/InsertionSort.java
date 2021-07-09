package usp.poo.ex2;

public class InsertionSort<T extends Comparable<T>> {
    private T[] array;

    public InsertionSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1].compareTo(temp) > 0) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}

