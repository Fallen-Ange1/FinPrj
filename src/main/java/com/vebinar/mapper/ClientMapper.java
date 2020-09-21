package com.vebinar.mapper;

import com.vebinar.entity.Client;
import com.vebinar.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper implements RowMapper<Client> {

    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Client client = new Client();
        client.setId(resultSet.getInt("customerID"));
        client.setName(resultSet.getString("Name"));
        client.setLogin(resultSet.getString("mail"));
        client.setPassword(resultSet.getString("password"));
        return client;
    }
}
