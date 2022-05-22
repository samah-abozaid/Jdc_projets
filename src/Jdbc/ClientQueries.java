package Jdbc;

import java.sql.*;
import java.util.ArrayList;

public class ClientQueries {
    public static ArrayList<Client> clients (ResultSet resultSet) {

        ArrayList<Client> clients = new ArrayList<>();

        try {
            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("companyName"),
                        resultSet.getString("firstName"),
                        resultSet.getString("lastName"),
                        resultSet.getString("email") ,
                        resultSet.getString("phone"),
                        resultSet.getString("address"),
                        resultSet.getString("zipCode"),
                        resultSet.getString("city"),
                        resultSet.getString("country"),
                        resultSet.getInt("state"));

                clients.add(client);

            }

                return clients;


            } catch (SQLException e) {
                System.out.println("Une erreur est survenue!");
                return null;
            }







    }
}