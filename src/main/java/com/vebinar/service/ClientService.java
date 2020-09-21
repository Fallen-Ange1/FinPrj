package com.vebinar.service;

import com.vebinar.entity.Client;
import com.vebinar.entity.User;

import java.util.List;

public interface ClientService {

    List<Client> findAll();

    void save(Client client) throws Exception;

    Client getById(int id);

    void update(Client client);

    void delete(int id);
}
