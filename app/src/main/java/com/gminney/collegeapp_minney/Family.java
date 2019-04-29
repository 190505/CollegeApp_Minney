package com.gminney.collegeapp_minney;

import java.util.ArrayList;

public class Family {

    private final String TAG = Family.class.getName();

    private ArrayList<FamilyMember> family;

    private static Family sFamily;

    private Family(){
        family = new ArrayList<>();
        Guardian mom = new Guardian("Mom", "Mom", "Writer");
        Guardian dad = new Guardian("Dad", "Dad", "Farmer");
        Sibling sibling = new Sibling("Sibling", "Sibling");
        family.add(mom);
        family.add(dad);
        family.add(sibling);
    }

    public static Family getFamily(){
        if (sFamily == null){
            sFamily = new Family();
        }
        return sFamily;
    }

    public ArrayList<FamilyMember> getFamilyList(){
        return family;
    }

    public void setFamily(ArrayList<FamilyMember> family) {
        this.family = family;
    }

    public void addFamilyMember(FamilyMember familyMember){
        family.add(familyMember);
    }

    public void deleteFamilyMember(FamilyMember familyMember){
        family.remove(familyMember);
    }














}
