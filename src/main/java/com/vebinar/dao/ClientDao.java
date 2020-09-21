package com.vebinar.dao;

import com.vebinar.entity.Client;
import com.vebinar.entity.User;

import java.util.List;

public interface ClientDao {

    void save(Client client);

    Client getById(int id);

    List<Client> findAll();

    void update(Client client);

    void delete(int id);

}
