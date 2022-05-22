import Jdbc.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class QueriesMain {

    public static void deleteClientById(int id) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succés!");

            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM `clients` WHERE id='?'");

            statement.setInt(1, id);
            statement.executeQuery();
            System.out.println("Suppression réalisée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void updateClient(Client clientToUpdate) {
        String firstName = null;
        String lastName = null;
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Quel est votre prénom?");
            firstName = input.nextLine();
        } catch (Exception e) {
            System.out.println("Une erreur est intevenue");
        }

        try {
            System.out.println("Quel est votre nom?");
            lastName = input.nextLine();
        } catch (Exception e) {
            System.out.println("Une erreur est intevenue");
        }

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/poe_ang_v1", "root", "");
            System.out.println("Connexion établie avec succés!");

            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE `clients` " +
                            "SET firstName = '?', lastName = '?'" +
                            "WHERE id='?' ");

            statement.setString(1, firstName);
            statement.setString(1, lastName);
            statement.setInt(3, clientToUpdate.getId());


            statement.executeQuery();
            // Attente erreur si suppression d'un ID non existant

            System.out.println("Suppression réalisée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
    }



