package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * Para criar um novo estudante ao inicializar.
     * Fees vão ser R$30000 por ano.
     * Fees pagas inicialmente serão 0;.
     * @param id // id para o ID do estudante; único.
     * @param name // name para o nome do estudante.
     * @param grade // grade para a turma do estudante
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // Não vamos alterar o nome do estudante e o ID do estudante.

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

}
