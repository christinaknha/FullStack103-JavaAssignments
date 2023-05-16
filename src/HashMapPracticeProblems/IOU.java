package HashMapPracticeProblems;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> amountOwed;
    public IOU() {
        amountOwed = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
//        double amountDue = this.amountOwed.getOrDefault(amount, 0.00);
        this.amountOwed.put(toWhom, amount);
//        System.out.println(amountOwed);
    }

    public double howMuchDoIOweTo(String toWhom){
        return this.amountOwed.get(toWhom);

    }

    public static void main(String[] args){
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);
//        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
