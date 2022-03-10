package com.teksystems.SoftwareDevelopersClub;

public class ClubMember {

    // fields
    public String name;
    public String location;
    public String favoriteLanguage;

    // constructors
    public ClubMember(){

    }

    public ClubMember(String name, String location, String favoriteLanguage) {
        this.name = name;
        this.location = location;
        this.favoriteLanguage = favoriteLanguage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public String toString() {
       return String.format("%s %s %s", name, location, favoriteLanguage);
    }
}
