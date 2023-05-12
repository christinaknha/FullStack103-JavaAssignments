package SchoolManagementSystem;
import java.util.List;

/**
 * Created by Christina on 05/11/2023
 * Create arraylist for teachers and students
 * The school can have many teachers and many students
 */


public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int amountMoneyEarned;
    private static int amountMoneySpent;

    /**
     * new school object is created
     * @param teachers List of teachers in the school
     * @param students List of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;

        amountMoneyEarned = 0;
        amountMoneySpent = 0;

    }

    /**
     *
     * @returns the list of teachers in the school
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }

    /**
     * adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void updateTeachers(Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @returns the list of students in the school
     */
    public List<Student> getStudents(){
        return students;
    }

    /**
     * adds a student to the school
     * @param student the student to be added
     */
    public void updateStudents(Student student){
        students.add(student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getAmountMoneyEarned(){
        return amountMoneyEarned;
    }

    /**
     *Adds up the total money earned by the school.
     * @param moneyEarned is money to be added
     */
    public static void updateAmountMoneyEarned(int moneyEarned){
        amountMoneyEarned = amountMoneyEarned + moneyEarned;
    }

    /**
     *
     * @returns money spent by the school
     */
    public int getAmountMoneySpent(){
        return amountMoneySpent;
    }

    /**
     * Update the money spent by the school to pay teachers
     * @param moneySpent is the money spent by the school.
     */
    public static void updateAmountMoneySpent(int moneySpent){
        amountMoneyEarned = amountMoneyEarned - moneySpent;
    }
}
