package org.example;

public class CandidatoRH {
    public static void main(String[] args) {

        Company company = new Company();

        company.setName("Iventis");
        company.setGlassdoorRating(4.7);
        company.setVacancyType("Desenvolvedor Java");
        company.setRequirements("Java, Spring Boot");
        company.setEmailHR("recrutamento@iventis.com.br");

        System.out.println("Empresa: " + company.getName());
        System.out.println("Nota Glassdoor: " + company.getGlassdoorRating());
        System.out.println("Vaga: " + company.getVacancyType());
        System.out.println("Exigências: " + company.getRequirements());
        System.out.println("Email RH: " + company.getEmailHR());
    }
}