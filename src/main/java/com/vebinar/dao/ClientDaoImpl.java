package com.vebinar.dao;

import com.vebinar.entity.Client;
import com.vebinar.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void save(Client client) {
        String sql = "INSERT INTO customer (Name, mail, password, customerID) VALUES (?, ?, ?,?)";
        jdbcTemplate.update(sql, client.getName(),client.getLogin(),client.getPassword(),client.getId());

    }

    public Client getById(int id) {
        String sql = "SELECT * FROM customer WHERE clientID=?";
        return jdbcTemplate.queryForObject(sql, new ClientMapper(), id);
    }

    public List<Client> findAll() {
        String sql = "SELECT * FROM customer";
        return jdbcTemplate.query(sql, new ClientMapper());
    }

    public void update(Client client) {
        String sql = "UPDATE customer SET Name=?, mail=?, password=? WHERE customerID=?";
        jdbcTemplate.update(sql, client.getName(), client.getLogin(), client.getPassword(), client.getId());
    }

    public void delete(int id) {
        String sql = "DELETE FROM customer WHERE customerID=?";
        jdbcTemplate.update(sql, id);

    }
}
