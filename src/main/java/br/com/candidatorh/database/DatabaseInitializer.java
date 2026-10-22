package br.com.candidatorh.database;

import java.sql.Connection;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void initialize() {

        String sql = """
            CREATE TABLE IF NOT EXISTS companies (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                company_name TEXT NOT NULL,
                glassdoor_rating REAL,
                vacancy_type TEXT,
                requirements TEXT,
                email_hr TEXT NOT NULL
            );
            """;

        try (
                Connection conn = ConnectionFactory.getConnection();
                Statement stmt = conn.createStatement()
        ) {

            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}