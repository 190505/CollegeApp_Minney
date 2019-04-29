package com.gminney.collegeapp_minney;

public abstract class FamilyMember {

    String mFirstName;
    String mLastName;

    public static final String EXTRA_RELATION = "org.pltw.examples.collegeapp.relation";
    public static final String EXTRA_INDEX = "org.pltw.examples.collegeapp.index";

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public FamilyMember(){
        mFirstName = "Family";
        mLastName = "Member";
    }

    public FamilyMember(String firstName, String lastName){
        mFirstName = firstName;
        mLastName = lastName;
    }

    @Override
    public String toString(){
        return "Family Member: "+ getFirstName() + " "+ getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Guardian) && (this instanceof Guardian)) {

            if (((Guardian)o).getFirstName().equals(this.getFirstName()) && ((Guardian)o).getLastName().equals(this.getLastName())) {
                return true;
            }
        }
        else if ((o instanceof Sibling) && (this instanceof Sibling)) {

            if (((Sibling)o).getFirstName().equals(this.getFirstName())&& ((Sibling)o).getLastName().equals(this.getLastName())) {
                return true;
            }
        }
        return false;
    }
}
