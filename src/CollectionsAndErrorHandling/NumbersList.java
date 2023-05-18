package CollectionsAndErrorHandling;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class NumbersList {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(9);
        listNumbers.add(9);
        listNumbers.add(7);
        listNumbers.add(5);
        listNumbers.add(8);

        try {
            Set<Integer> noDups = new HashSet<>();
            noDups.addAll(listNumbers);

            System.out.println(noDups);

//      sum of listNumbers
            int numTotal = 0;
            for (int num : noDups) {
                numTotal += num;
            }
            System.out.println(numTotal);

//      Calculate average
            if(noDups.size() > 0) {
                int avg = numTotal / noDups.size();
                System.out.println(avg);
            }
        } catch (IndexOutOfBoundsException ioobe){
            System.out.println("An error occurred: " + ioobe.getMessage());
        }catch (IllegalArgumentException iae){
            System.out.println("An error occurred: " + iae.getMessage());
        }catch(ArithmeticException ae){
            System.out.println("An error occurred: " + ae.getMessage());
        }finally{
            System.out.println("The code ends here.");
        }
    }
}