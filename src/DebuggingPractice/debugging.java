package DebuggingPractice;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class debugging {

    public static void main(String[] args){
        ArrayList<Integer> myNumList = new ArrayList<>();

        myNumList.add(1);
        myNumList.add(2);
        myNumList.add(3);
        myNumList.add(4);
        myNumList.add(5);


        double avg = findAverage(myNumList);
        System.out.println(avg);

////      Null Pointer Exception Occurs on line 29
////      This will return NullPointerException because debuggingList is set equal to null
//        myNumList = null;
//        System.out.println(myNumList.size());
/*        In order to debug this code, I put in a breakpoint in at line 23 and stepped over to line 24.
            Once I got to line 29, it displayed myNumList:null, which showed me that a null pointer exception occurred.
 */


//      Array Index Out of Bounds Exceptions occurs on line 32
//      This will return IndexOutOfBoundsExceptions because there is no index equal to my.NumList.size()
//        System.out.println(myNumList.get(myNumList.size()));
/*     To debug this, I placed a debugger at line 32. It showed a "Method will fail" between the last two closing
        parenthesis. From there, I was able to click a dropdown arrow next to size = 5 that shows each of the indexes
        within the array and their corresponding values. It showed only 4 indexes which is less than numList size.
 */

//      Logic Error occurs on line 43 with the code being from line 41 - 45
//      This code should be subtracting two values but instead, adds them. This doesn't generate an error message but
//      returns incorrect values
//        double difference = 0;
//        for (int i = myNumList.size()-1; i > 0; i --){
//            difference = (myNumList.get(i) + myNumList.get(i-1));
//            System.out.println(difference);
//        }
/*      For this code with the given array, a difference of 1 is expected between each of the values.
        However, when the code is run, it returns, 9, 7, 5, and 3.
        To debug this code, I put a breakpoint on line 41. I stepped over into line 42, and then
        stepped into the for loop to see what values the code was returning each time.
 */



    }

    public static double findAverage(ArrayList<Integer> numList){
        double sum = 0;
        for (int i = 0; i < numList.size(); i++){
            sum += numList.get(i);
        }
        double average = sum/numList.size();
        System.out.println("Average: " + average);
        return average;
    }

//  My code ran the proper values the first time around.
}
