package org.JDBC.Zad2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.sql.*;

public class Main {
    private static final String USER_INSERT_SQL = "insert into user (name, password, language) values (?,?,?)";
    private static final String USER_DELETE_SQL = "DELETE FROM user WHERE id = ? ";
    private static final String USER_FILTER_LANGUAGE_SQL = "SELECT * FROM user WHERE language = ?";
    private static final String USER_FILTER_NAME_SQL = "SELECT id, name, password, language FROM user WHERE name = ?";
    private static Connection connection;

    public static void main(String[] args) {
        try {
            openConnection();
//            saveUser(new User("Jan", "sdasa", Language.FR));
//            removeUserById(6);
            List<User> user = filterByLanguage(Language.PL);
            System.out.println(user);
//            filterByName("Mariusz");

            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void openConnection() throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost:3306/java_jdbc";
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "root!54");
        connectionProps.put("serverTimezone", "CET");
        connectionProps.put("useSSL", "false");

        connection = DriverManager.getConnection(DB_URL, connectionProps);
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }

    public static void saveUser(User user) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(USER_INSERT_SQL);
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getLanguage().name());

        int rowsNr = preparedStatement.executeUpdate();
        System.out.println("Rows changed: " + rowsNr);
    }


    public static void removeUserById(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(USER_DELETE_SQL);
        preparedStatement.setInt(1, id);

        int rowsNr = preparedStatement.executeUpdate();
        System.out.println("Rows changed: " + rowsNr);
    }

    public static List<User> filterByLanguage(Language language) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(USER_FILTER_LANGUAGE_SQL);
        preparedStatement.setString(1, language.name());

        List<User> users = new LinkedList<>();

        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            String password = rs.getString(3);
//            String lg = rs.getString(4);
            users.add(new User(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    Language.valueOf(rs.getString(4))
            ));
        }
        return users;
    }

    public static void filterByName(String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(USER_FILTER_NAME_SQL);
        preparedStatement.setString(1, name);

        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Language: " + rs.getString(4));
        }
    }
}
