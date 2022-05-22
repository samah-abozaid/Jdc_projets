package dao.doas.impl;

import dao.doas.interfaces.IClientDao;
import dao.doas.interfaces.IOrderDao;
import dao.models.Client;
import dao.models.Order;
import dao.services.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientDao implements IClientDao {

    @Override
    public ArrayList<Client> getAll() {
        ArrayList<Client> clients=new ArrayList<>();
        try{
            Connection connection= DatabaseConnection.getInstance();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("SELECT * FROM clients");
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String companyName=resultSet.getString("companyName");
                String firstName=resultSet.getString("firstName");
                String lastName=resultSet.getString("lastName");
                String email=resultSet.getString("email");
                String phone=resultSet.getString("phone");
                String address=resultSet.getString("address");
                String zipCode=resultSet.getString("zipCode");
                String city=resultSet.getString("city");
                String country=resultSet.getString("country");
                int state=resultSet.getInt("state");

                clients.add(new Client(id,companyName,firstName,lastName,email,phone,
                        address,zipCode,city,country,state));

            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return clients;
    }





    @Override
    public Client getById(int id) {
        try {
            Connection connection =DatabaseConnection.getInstance();
            System.out.println("Connexion établie avec succés!");

            PreparedStatement statement = connection.prepareStatement(
                    "Slecte FROM `clients` WHERE id='?'");

            statement.setInt(1, id);
            statement.executeQuery();
            System.out.println("Suppression réalisée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }







        return null;
    }

    @Override
    public void save(Client client) {
        try {
            Connection connection =DatabaseConnection.getInstance();
            System.out.println("Connexion établie avec succés!");

            PreparedStatement statement = connection.prepareStatement(
                    "save FROM `clients` ");


            statement.executeQuery();
            System.out.println("Suppression réalisée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }




    @Override
    public void update(Client client) {
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
        Connection connection =DatabaseConnection.getInstance();
        System.out.println("Connexion établie avec succés!");
        PreparedStatement statement = connection.prepareStatement(
                "UPDATE `clients` " +
                        "SET firstName = '?', lastName = '?'" +
                        "WHERE id='?' ");

        statement.setString(1, firstName);
        statement.setString(1, lastName);
        statement.setInt(3, client.getId());


        statement.executeQuery();
        // Attente erreur si suppression d'un ID non existant

        System.out.println("Suppression réalisée");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }


    }

    @Override
    public void delete(int id) {
        try {
            Connection connection =DatabaseConnection.getInstance();
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





    }

