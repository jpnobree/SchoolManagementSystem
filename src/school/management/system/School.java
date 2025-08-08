package school.management.system;

import java.util.List;

public class School {
    /**
     * Uma escola pode ter diversos professores, diversos estudantes.
     * Array para esse caso não seria uma boa escolha, pelo fato da qtde de professores e estudantes serem bastante voláteis.
     * Implementar professores e estudantes usando uma ArrayList
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * novo objeto da escola é criado.
     * @param teachers lista de professores na escola
     * @param students lista de estudantes na escola
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned - totalMoneySpent;
    }

    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }
}
