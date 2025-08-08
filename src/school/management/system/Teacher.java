package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // retorna o ID do professor
    public int getId(){
        return id;
    }

    // retorna o nome do professor
    public String getName(){
        return name;
    }

    // retorna o salário do professor
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "\nTeacher's name: " +name+
                " \nTotal salary earned: " +salaryEarned;
    }
}
