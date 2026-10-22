package br.com.candidatorh;

import br.com.candidatorh.model.Company;
import java.util.ArrayList;
import java.util.Scanner;

public class CandidatoRH {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Company> companies = new ArrayList<>();

        Company company = new Company();

        System.out.print("Nome da empresa: ");
        company.setCompanyName(scanner.nextLine());

        System.out.print("Avaliação Glassdoor: ");
        company.setGlassdoorRating(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Tipo de vaga: ");
        company.setVacancyType(scanner.nextLine());

        System.out.print("Requisitos: ");
        company.setRequirements(scanner.nextLine());

        System.out.print("Email RH: ");
        company.setEmailHR(scanner.nextLine());

        companies.add(company);

        System.out.println("Total de empresas: " + companies.size());

        company.showCompanies();

    }
}