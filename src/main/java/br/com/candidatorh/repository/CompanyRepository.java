package br.com.candidatorh.repository;

import br.com.candidatorh.database.ConnectionFactory;
import br.com.candidatorh.model.Company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompanyRepository {

    public void save(Company company) {

        String sql = """
            INSERT INTO companies
            (company_name,
             glassdoor_rating,
             vacancy_type,
             requirements,
             email_hr)
            VALUES (?, ?, ?, ?, ?)
            """;

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, company.getCompanyName());
            stmt.setDouble(2, company.getGlassdoorRating());
            stmt.setString(3, company.getVacancyType());
            stmt.setString(4, company.getRequirements());
            stmt.setString(5, company.getEmailHR());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar empresa.");
            e.printStackTrace();
        }
    }
}