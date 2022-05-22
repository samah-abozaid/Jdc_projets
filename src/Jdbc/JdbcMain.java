package Jdbc;

import java.sql.*;

public class JdbcMain {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succés!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM orders;");

            var orders = Orders.orders(resultSet);


            System.out.println(orders);


        } catch (SQLException e) {

            System.out.println("Echec de la requête");

            System.out.println(e.getMessage());

        }




    }
}