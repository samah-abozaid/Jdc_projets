package dao.doas.impl;

import dao.doas.interfaces.IClientDao;
import dao.doas.interfaces.IOrderDao;
import dao.models.Client;
import dao.models.Order;
import dao.services.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        return null;
    }

    @Override
    public void save(Client client) {

    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(int id) {

    }
}
