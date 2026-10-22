package br.com.candidatorh;

import br.com.candidatorh.database.DatabaseInitializer;
import br.com.candidatorh.model.Company;
import br.com.candidatorh.repository.CompanyRepository;

import java.util.Scanner;

public class CandidatoRH {
    public static void main(String[] args) {

        DatabaseInitializer.initialize();
        Scanner scanner = new Scanner(System.in);
        CompanyRepository repository = new CompanyRepository();

        while (true) {

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

            System.out.print("E-mail RH: ");
            company.setEmailHR(scanner.nextLine());

            repository.save(company);

            System.out.println("Empresa salva com sucesso!");

            System.out.print("Cadastrar outra empresa? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}