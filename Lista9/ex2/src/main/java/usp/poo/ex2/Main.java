package usp.poo.ex2;

public class Main {
    public static void main(String[] args) {
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
                10541372
            ),
            new StudentSortableByGrade(
                "Rafael",
                19,
                6.5,
                10541341
            ),
            new StudentSortableByGrade(
                "Julia",
                17,
                0.5,
                11616383
            ),
            new StudentSortableByGrade(
                "Joaquim",
                19,
                9.5,
                11616168
            ),
            new StudentSortableByGrade(
                "JAqueline",
                19,
                5.5,
                12868686
            ),
        };

        InsertionSort<StudentSortableByGrade> insertionSort = new InsertionSort<StudentSortableByGrade>(students);
        System.out.println("Antes da ordenação");
        insertionSort.printArray();
        insertionSort.sort();
        System.out.println("Após a ordenação");
        insertionSort.printArray();

    }
}
