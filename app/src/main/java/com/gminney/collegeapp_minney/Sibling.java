package com.gminney.collegeapp_minney;

public class Sibling extends FamilyMember {

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        this.mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.mFirstName = firstName;
    }

    public Sibling(){
        super();
    }

    public Sibling(String firstName, String lastName){
        super(firstName, lastName);
    }

    public Sibling(String firstName, String lastName, String occupation){
        super(firstName, lastName);
    }


    @Override
    public String toString(){
        return "Sibling: "+ getFirstName() + " "+ getLastName();
    }

}
