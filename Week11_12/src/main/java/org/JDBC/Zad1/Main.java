package org.JDBC.Zad1;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/java_jdbc";
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "root!54");
        connectionProps.put("serverTimezone", "CET");
        connectionProps.put("useSSL", "false");

        Statement stmt = null;

        try(Connection conn = DriverManager.getConnection(DB_URL, connectionProps)) {
            stmt = conn.createStatement();

//            //Sprawdzanie wersji SQL
//            ResultSet rs = stmt.executeQuery("select version()");
//            rs.next();
//            System.out.println(rs.getString(1));

//            //Dodawanie użytkownika do bazy z JAVY
//            int rowsChanged = stmt.executeUpdate("INSERT INTO user(name, password,language) VALUES('John', '123' , 'pl')");
//            System.out.println("Rows changed: " + rowsChanged);// ile wierszy się zmieniło

//            //zmiana danych użytkownika
//            stmt.executeUpdate("UPDATE user " +
//                    "SET name = 'Joe', password = 'abc', language = 'eng' " +
//                    "WHERE id = 2");

//            //USUWANIE
//            stmt.executeUpdate("DELETE FROM user WHERE id = 3 ");//

            //WYŚWIETLANIE
            ResultSet rs = stmt.executeQuery("SELECT id, name, password, language FROM user WHERE language = 'PL'");
            //Extract data from result set
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt(1));
                System.out.println("Name: " + rs.getString(2));
                System.out.println("Password: " + rs.getString(3));
                System.out.println("Language: " + rs.getString(4));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
