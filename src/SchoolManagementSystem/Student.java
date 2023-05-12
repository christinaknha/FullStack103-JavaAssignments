package SchoolManagementSystem;

/** Created by Christina on 05/11/2023
    This class is responsible for tracking student information
    such as id, name, grade, and fees paid
 */
public class Student {

//  Set items to private so no one can change it
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

/**  Create a new student object by initializing values
    Id parameter is unique for each student
    Name parameter shows student name
    Grade parameter shows student grade level
    Fees for every student is $30000 per year
    FeesPaid initially is $0
 */
    public Student(int studentId, String studentName, int studentGrade){
        this.id = studentId;
        this.name = studentName;
        this.grade = studentGrade;
        feesPaid = 0;
        feesTotal = 30000;
    }

//  We are not going to change student names or student id or feesTotal. Do not need to set.
//  We do need to set student grade, or feesPaid.

/** Used to update student grade level
    grade is the new grade of the student
*/
    public void setGrade(int grade){
        this.grade = grade;
    }


/** Used to change
    Keep adding the fees to feesPaid
    Add the fees to the feesPaid
    The school is going to receive the funds
 */

    public void payFees(int fees){
        feesPaid = feesPaid + fees;
        School.updateAmountMoneyEarned(feesPaid);
//      or feesPaid += fees
    }

/** We need to get the objects that we just set
 *  The following functions do the following respectively
 *  returns student id
 *  returns student name
 *  returns student grade level
 *  returns amount of fees paid
 *  returns total amount of fees due
 */

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getPayFees(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     *
     * @returns remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name :" + name +
                " Total fees paid so far: $" + feesPaid;
    }
}
