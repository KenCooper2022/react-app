package com.reactapp.domain.client.controllers;

import com.reactapp.domain.client.model.Client;
import com.reactapp.domain.client.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private ClientService clientService;
@Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/clients")
    public Iterable<Client>getAllClients(){
        return clientService.getAllClients();
    }
}
