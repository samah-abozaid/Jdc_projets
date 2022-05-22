package dao.services;

import dao.constantes.Constantes;

import java.sql.*;

public class DatabaseConnection {
    private static Connection connection;
    final private static String URL= Constantes.URL;
    final private static String USERNAME=Constantes.USERNAME;
    final private static String PASSWORD=Constantes.PASSWORD;

    private DatabaseConnection(){}

    public static Connection getInstance() throws SQLException {
        if(connection==null){
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }
        return connection;
    }









}
