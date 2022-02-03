package com.vicko.SpringTutorias2.dao;

import com.vicko.SpringTutorias2.domain.Client;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class ClientDAOImplementation implements clientDAO{
    @Override
    public void save(Client client) {
        System.out.println("Guardando un cliente");
        System.out.println(client.toString());
    }
}
