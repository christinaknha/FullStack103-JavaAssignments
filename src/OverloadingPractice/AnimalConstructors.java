package OverloadingPractice;

public class AnimalConstructors {
    //  Set class attributes. Private so that outsiders can't change the values

    private String name;
    private boolean type;


    //  Creating class constructor using all attributes
    public AnimalConstructors(String animalName, boolean animalType){
        this.name = animalName;
        this.type = animalType;
    }

//    Create class constructor using only one attribute
    public AnimalConstructors(String animalName) {
        this.name = animalName;
    }

//    Crate class constructor using no attributes
    public AnimalConstructors(){

    }

    //  Creating getters to get name and type value. Getters allow you to grab the information
    public String getName(){
        return name;
    }

    public boolean getType(){
        return type;
    }

//    Don't need cause the values are not dynamic?
////  Create setters for name and type values allow you to change the information
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setType(boolean type){
//        this.type = type;
//    }

    @Override
    public String toString(){
        String myString = getName() + " is a dog = " + getType();
        return myString;
    }

}

