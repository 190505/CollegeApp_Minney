package com.gminney.collegeapp_minney;

public class Guardian extends FamilyMember {

    String mOccupation;

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

    public void setOccupation(String occupation) {
        mOccupation = occupation;
    }

    public String getOccupation() {
        return mOccupation;
    }

    public Guardian(){
        super();
        mOccupation = "Unknown";
    }

    public Guardian(String firstName, String lastName){
        super(firstName, lastName);
        mOccupation = "Unknown";
    }

    public Guardian(String firstName, String lastName, String occupation){
        super(firstName, lastName);
        mOccupation = occupation;
    }

    @Override
    public String toString(){
        return "Guardian: "+ getFirstName() + " "+ getLastName()+ "\nOccupation: " + this.getOccupation();
    }


}
