package com.vicko.SpringTutorias2;

import com.vicko.SpringTutorias2.dao.ClientDAOImplementation;
import com.vicko.SpringTutorias2.dao.clientDAO;
import com.vicko.SpringTutorias2.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private clientDAO DAO;


    @PostMapping
    public void save(@RequestBody  Client client){
        DAO.save(client);
    }

}
