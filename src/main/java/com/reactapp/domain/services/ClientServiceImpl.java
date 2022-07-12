package com.reactapp.domain.services;

import com.reactapp.domain.model.Client;
import com.reactapp.domain.repos.ClientRepo;

public class ClientServiceImpl implements ClientService {
    private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client create(Client client) {
        return clientRepo.save(client);

    }
}
