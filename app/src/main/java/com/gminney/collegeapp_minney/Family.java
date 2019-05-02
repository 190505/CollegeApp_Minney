package com.gminney.collegeapp_minney;

import java.util.ArrayList;

public class Family {

    ////////    Variable instantiation for family object and arraylist      ///////////////////////////////////////////////////////////////
    private final String TAG = Family.class.getName();
    private ArrayList<FamilyMember> family;
    private static Family sFamily;

    ////////    Creates an arraylist and populates with default 2 Guardians and 1 Sibling       ///////////////////////////////////////////////////////////////
    private Family(){
        family = new ArrayList<>();
        Guardian mom = new Guardian("Mom", "Mom", "Writer");
        Guardian dad = new Guardian("Dad", "Dad", "Farmer");
        Sibling sibling = new Sibling("Sibling", "Sibling");
        family.add(mom);
        family.add(dad);
        family.add(sibling);
    }

    ////////    Getter for Family object      //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static Family getFamily(){
        if (sFamily == null){
            sFamily = new Family();
        }
        return sFamily;
    }

    ////////    Getter for family arraylist      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public ArrayList<FamilyMember> getFamilyList(){
        return family;
    }

    ////////    Setter for family arraylist     ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }

    ////////    Adds familymember object to a family arraylist      ////////////////////////////////////////////////////////////////////////////////////////////
    public void addFamilyMember(FamilyMember familyMember){
        family.add(familyMember);
    }

    ////////    Deletes a familymember object from a family arraylist     //////////////////////////////////////////////////////////////////////////////////////
    public void deleteFamilyMember(FamilyMember familyMember){
        family.remove(familyMember);
    }














}
