package org.example;

public class Company {

    private String companyName;
    private double glassdoorRating;
    private String vacancyType;
    private String requirements;
    private String emailHR;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setGlassdoorRating(double glassdoorRating) {
        this.glassdoorRating = glassdoorRating;
    }

    public void setVacancyType(String vacancyType) {
        this.vacancyType = vacancyType;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public void setEmailHR(String emailHR) {
        this.emailHR = emailHR;
    }

    public void showCompanies() {
        System.out.println("Nome salvo: " + this.companyName);
        System.out.println("Nome salvo: " + this.glassdoorRating);
        System.out.println("Nome salvo: " + this.vacancyType);
        System.out.println("Nome salvo: " + this.requirements);
        System.out.println("Nome salvo: " + this.emailHR);
    }
}