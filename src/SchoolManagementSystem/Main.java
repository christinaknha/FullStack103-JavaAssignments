package SchoolManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        /**
         * Creates a list of teachers
         */
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher( 3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        /**
         * Creates a list of students
         */
        Student tamasha = new Student( 1, "Tamasha",4);
        Student rakshith = new Student( 2, "Rakshith Vasudev", 12);
        Student rabbi = new Student( 3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        Teacher megan = new Teacher( 6, "Megan", 900);
        ghs.updateTeachers(megan);
        
        Student meegan = new Student(5,"Meegan", 10);
        ghs.updateStudents(meegan);

        System.out.println("GHS has earned $" + ghs.getAmountMoneyEarned());

        tamasha.payFees(5000);
        System.out.println("GHS has earned $" + ghs.getAmountMoneyEarned());
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getAmountMoneyEarned());

        System.out.println("Making School Pay Teacher Salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent $" + lizzy.getSalary()  + " to " + lizzy.getName()
                + " and now has $" + ghs.getAmountMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent $" + vanderhorn.getSalary()  + " to " + vanderhorn.getName()
                + " and now has $" + ghs.getAmountMoneyEarned());

        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);

    }
}
