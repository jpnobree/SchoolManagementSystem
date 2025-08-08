package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher jonas = new Teacher(1, "Jonas", 3000);
        Teacher joao = new Teacher(2, "Joao", 2500);
        Teacher maria = new Teacher(3, "Maria", 3500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(jonas);
        teacherList.add(joao);
        teacherList.add(maria);

        Student levi = new Student(1, "Levi", 4);
        Student mariah = new Student(2, "Maria", 2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(mariah);
        studentList.add(levi);


        School jao = new School(teacherList, studentList);

        levi.payFees(5000);
        System.out.println("Jaime Alencar de Oliveira ganhou R$: " + jao.getTotalMoneyEarned());

        System.out.println("----- SCHOOL PAY SALARY -----");
        jonas.receiveSalary(jonas.getSalary());
        System.out.println("Jaime Alencar de Oliveira pagou ao " + jonas.getName() + " e agora tem: R$" + jao.getTotalMoneyEarned());
    }
}
