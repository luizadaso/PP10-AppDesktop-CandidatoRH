package org.example;

public class Company {

    private String name;
    private double glassdoorRating;
    private String vacancyType;
    private String requirements;
    private String emailHR;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getGlassdoorRating() {
        return glassdoorRating;
    }

    public void setGlassdoorRating(double glassdoorRating) {
        this.glassdoorRating = glassdoorRating;
    }

    public String getVacancyType() {
        return vacancyType;
    }

    public void setVacancyType(String vacancyType) {
        this.vacancyType = vacancyType;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getEmailHR() {
        return emailHR;
    }

    public void setEmailHR(String emailHR) {
        this.emailHR = emailHR;
    }
}