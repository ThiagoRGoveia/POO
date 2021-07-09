package usp.poo.ex2;

public class Main {
    public static void main(String[] args) {
        // Integer[] array = {40, 20, 15, 50, 5, 80, 10, 90, 70, 60};
        // InsertionSort<Integer> insertionSort = new InsertionSort<Integer>(array);

        // insertionSort.printArray();
        // insertionSort.sort();
        // insertionSort.printArray();

        StudentSortableByGrade[] students = {
            new StudentSortableByGrade(
                "Joao",
                18,
                9.9,
                123456789
            ),
            new StudentSortableByGrade(
                "Maria",
                19,
                8.0,
                123456857
            ),
            new StudentSortableByGrade(
                "Joana",
                17,
                7.5,
                123457188
            ),
            new StudentSortableByGrade(
                "Pedro",
                20,
                8.2,
                100448068
            ),
            new StudentSortableByGrade(
                "Paula",
                19,
                6.0,
                10571668
            ),
            new StudentSortableByGrade(
                "Carlos",
                17,
                2.3,
                10541383
            )
        };

        InsertionSort<StudentSortableByGrade> insertionSort = new InsertionSort<StudentSortableByGrade>(students);

        insertionSort.sort();
        insertionSort.printArray();

    }
}
