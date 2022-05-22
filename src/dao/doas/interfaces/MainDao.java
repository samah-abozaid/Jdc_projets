package dao.doas.interfaces;

import dao.doas.impl.ClientDao;
import dao.models.Client;

import java.util.ArrayList;


    // T => Client
// T => Order
    public interface MainDao<T> {
        ArrayList<T> getAll();

        T getById(int id);

        void save(T t);

        void update(T t);

        void delete(int id);


    }