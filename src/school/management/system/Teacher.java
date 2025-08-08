package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
}
