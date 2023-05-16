package HashMapPracticeProblems;
import java.util.HashMap;

public class Abbreviations{
    private String abbreviation;
    private String explanation;

    public Abbreviations(String abbreviation, String explanation){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
    }

    public String getAbbreviation(){
        return this.abbreviation;
    }

    public String getExplanation(){
        return this.explanation;
    }

    public void setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public void setExplanation (String explanation){
        this.explanation = explanation;
    }

    public String toString() {
        String message = "The abbreviation is " + this.abbreviation + " and it means " + this.explanation + ".";
        System.out.println(message);
        return message;
    }

    private HashMap<String, Abbreviations> abbreviations;
    public Abbreviations(){
        abbreviations = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviations.put(abbreviation, new Abbreviations(abbreviation,explanation));
    }

    //      Check if abbreviation already exists. Returns true or false
    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)) {
//            System.out.println("This abbreviation already exists.");
            return true;
        } else {
            return false;
        }
    }

        //  find explanation for abbreviation. return null if not added yet
    public String findExplanationFor(String abbreviation) {
        if (abbreviations.containsKey(abbreviation)){
//            System.out.println(abbreviations.get(abbreviation).getExplanation());
            return abbreviations.get(abbreviation).getExplanation();
        }else {
//            System.out.println("This abbreviation has not yet been added.");
            return null;
        }
    }


    public static void main(String[] args) {
//        Abbreviations abbreviationList = new Abbreviations();
//        Abbreviations ex1 = new Abbreviations("e.g.", "for example");
//        Abbreviations ex2 = new Abbreviations("etc.", "and so on");
//
//
//
//
//        abbreviationList.addAbbreviation("i.e.", "more precisely");
//        abbreviationList.addAbbreviation("e.g.", "for example");
//        abbreviationList.addAbbreviation("etc.", "and so on");
//
//        abbreviationList.hasAbbreviation("e.g.");
//
//        abbreviationList.findExplanationFor("etc");
//
//
//        abbreviationList.toString();

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

}
