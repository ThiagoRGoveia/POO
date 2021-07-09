package usp.poo.ex2;

public class StudentSortableByGrade implements Comparable<StudentSortableByGrade> {
    private String name;
    private int age;
    private double grade;
    private int nUSP;

    public StudentSortableByGrade(String name, int age, double grade, int nUSP) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.nUSP = nUSP;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }
    public int getNUSP() {
        return nUSP;
    }

    public int compareTo(StudentSortableByGrade o) {
        return o.getGrade() < this.getGrade() ? 1 : (o.getGrade() == this.getGrade() ? 0 : -1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------\n");
        sb.append("NUSP: " + nUSP + "\n");
        sb.append("Nome: " + name + "\n");
        sb.append("Idade: " + age + "\n");
        sb.append("Nota: " + grade + "\n");
        sb.append("--------------------\n");
        return sb.toString();
    }
}
