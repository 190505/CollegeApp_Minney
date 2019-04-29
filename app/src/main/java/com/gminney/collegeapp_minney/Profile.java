package com.gminney.collegeapp_minney;

public class Profile {

    String firstName = "Gavin";
    String lastName = "Minney";
    public static final String PHOTOFILENAME = "IMG_PROFILE.jpg";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhotoFilename(){
        return PHOTOFILENAME;
    }


}
