package SchoolManagementSystem;

/**
 * Created by Christina on 05/11/2023
 * This class is responsible for keeping track of
 * teacher information including name, id, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
     * @param teacherId id for the teacher
     * @param teacherName name of the teacher
     * @param teacherSalary salary of the teacher
     */
    public Teacher(int teacherId, String teacherName, int teacherSalary ){
        this.id = teacherId;
        this.name = teacherName;
        this.salary = teacherSalary;
        this.salaryEarned = 0;
    }

    /**
     * Need to get teacher id, name, and salary
     *
     * The following methods to these respectively
     * returns the id
     * returns the name
     * returns the salary
     */
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    /**
     * Want to make changes to salary so need to set it
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to teacher salary
     * Removes from the total money earned by the school
     * @param salary amount due to teacher
     */
    public void receiveSalary(int salary){
        salaryEarned = salaryEarned +salary;
        School.updateAmountMoneySpent(salary);
    }

    @Override
    public String toString(){
        return "Name of the teacher: " + name +
                " Total salary earned so far: $" + salaryEarned;
    }
}
