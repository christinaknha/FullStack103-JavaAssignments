package PracticeJavaProblems;
import java.util.Map;

public class WarmUp1 {

//  SLEEPIN
    public boolean sleepIn(boolean weekday, boolean vacation) {
//      Check for when code would return true
//      This occurs if weekday = false  or vacation = true

        if (weekday == false || vacation == true){
//          We sleep in, so return true.
            return true;

//      If weekday = true  and vacation = true, the code automatically runs.
//      We don't sleep in, so return false.
        } return false;

    }


//  HELLONAME
//  This one was short and easy. Not really sure how you want me to explain my thought process...
    public String helloName(String name) {
//      Concatenate the string "hello" with user input name
        return "Hello " + name + "!";
    }

//  CIGARPARTY
    public boolean cigarParty(int cigars, boolean isWeekend) {
//      check scenarios that will return false:
//      if cigars is < 40 or
//      if it's not a weekend and cigars>60
        if (cigars < 40 || isWeekend == false && cigars >60){
            return false;
//      Check to see if it is not a weekend and cigars are in appropriate range >=40 and <=60
        } else if (isWeekend == false && cigars >= 40 && cigars <= 60){
//          If so, return true
            return true;
//      return true if isWeekend == true && cigars >= 40
        } return true;

    }

//  MAPBULLY
    public Map<String, String> mapBully(Map<String, String> map) {
//      Checks to see if the Map contains "a" as a key.
        if (map.containsKey("a")){
//          if so, saves the value into a variable
            String newValue = map.get("a");
//          replaces or adds key b with the value of a
            map.put("b", newValue);
//          replaces or adds key a with a blank value
            map.put("a", "");
        }return map;
    }

//  TOPPING1
    public Map<String, String> topping1(Map<String, String> map) {
//      Checks to see if the map contains the key ice cream
        if (map.containsKey("ice cream")){
//          if so, it changes the value of ice cream to cherry
            map.put("ice cream", "cherry");
//          and adds the key bread with the value butter
            map.put("bread", "butter");
        }else{
//          even if it does not contain the key ice cream,
//          add the key bread and value butter
            map.put("bread", "butter");
        }return map;
    }

//  STRINGTIMES
    public String stringTimes(String str, int n) {

        String newStr = "";
//      Checks to see if the integer is greater than zero
        if(n > 0){
//          if so, needs to print str out as many times as the integer value
            for (int i = 0; i < n; i ++)
//              new string needs to be saved into variable so that it can be used to iterate through properly.
//              new string variable needs to be declared outside to prevent scoping issues.
                newStr = newStr + str;
//      Accounts for if n = 0. empty string should be returned
        } else if(n == 0){
            newStr = newStr;
        }
        return newStr;
    }

//  FIRSTLAST6
    public boolean firstLast6(int[] nums) {
//      Check to see if the first or the last index is equal to 6.
//      Have to do length-1 because indexing starts at 0.
        if (nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
//      if case doesn't fit the scenario, return false.
        }return false;
    }

//  NOTEENSUM
public int noTeenSum(int a, int b, int c) {
//  Define sum to equal to 0 so that you have something to add your variables to.
    int sum = 0;

//  Check all three variables to get the appropriate value if they are situated in the teens.
    a = fixTeen(a);
    b = fixTeen(b);
    c = fixTeen(c);

//  add all updated variables together
    sum = a +b + c;
    return sum;

}
    public int fixTeen(int n){
//      Check to see if the input variable is between 13 and 19, excluding 15 and 16.
        if(n >= 13 && n <= 19 && n != 15 && n != 16){
//          if true, set the value equal to 0.
            n = 0;
        } return n;
    }


}
