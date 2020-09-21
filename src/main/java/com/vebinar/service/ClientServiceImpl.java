package com.vebinar.service;

import com.vebinar.dao.ClientDao;
import com.vebinar.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {


    @Autowired
    public ClientDao clientDao;

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public void save(Client client) throws Exception {
        if (client.getName().length() < 2) {
            throw new Exception();
        }
        clientDao.save(client);
    }

    public Client getById(int id) {
        return clientDao.getById(id);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(int id) {
        clientDao.delete(id);

    }
}
