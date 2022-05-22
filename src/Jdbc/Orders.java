
package Jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Orders {

    public static ArrayList<Order> orders (ResultSet resultSet) {

        var orders = new ArrayList<Order>();


        try {
            while (resultSet.next()) {
                Order order = new Order(
                        resultSet.getInt("id"),
                        resultSet.getString("typepresta"),
                        resultSet.getString("designation"),
                        resultSet.getInt("nbDays"));

                orders.add(order);
            }

            return orders;

        } catch (SQLException e) {
            System.out.println("Une erreur est survenue!");
            return null;
        }

    }

}

