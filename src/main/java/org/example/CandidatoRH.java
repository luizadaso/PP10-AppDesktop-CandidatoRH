package org.example;

import java.util.ArrayList;
import java.util.List;

public class CandidatoRH {
    public static void main(String[] args) {

        Company iventis = new Company();
        iventis.setName("Iventis");
        iventis.setGlassdoorRating(4.7);
        iventis.setVacancyType("Desenvolvedor Java");
        iventis.setRequirements("Java, Spring Boot");
        iventis.setEmailHR("recrutamento@iventis.com.br");

        Company totvs = new Company();
        totvs.setName("TOTVS");
        totvs.setGlassdoorRating(4.1);
        totvs.setVacancyType("Desenvolvedor Java");
        totvs.setRequirements("Java, Spring Boot");
        totvs.setEmailHR("contatopaulista@totvs.com.br");

        Company ntConsult = new Company();
        ntConsult.setName("NTCONSULT");
        ntConsult.setGlassdoorRating(4.2);
        ntConsult.setVacancyType("Desenvolvedor Java");
        ntConsult.setRequirements("Java, Spring Boot");
        ntConsult.setEmailHR("lucas.marczal@ntconsult.com.br");

        List<Company> companies = new ArrayList<>();

        companies.add(iventis);
        companies.add(totvs);
        companies.add(ntConsult);

        for (Company company : companies) {
            System.out.println(company.getName());
            System.out.println(company.getGlassdoorRating());
            System.out.println(company.getVacancyType());
            System.out.println(company.getRequirements());
            System.out.println(company.getEmailHR());
            System.out.println("----------------");
        }

    }
}