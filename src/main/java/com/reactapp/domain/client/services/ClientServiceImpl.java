package com.reactapp.domain.client.services;

import com.reactapp.domain.client.exceptions.ClientCreationException;
import com.reactapp.domain.client.model.Client;
import com.reactapp.domain.client.repos.ClientRepo;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {
    private ClientRepo clientRepo;

    public ClientServiceImpl(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    @Override
    public Client create(Client client) throws ClientCreationException {
        return clientRepo.save(client);
    }

    @Override
    public Iterable<Client> getAllClients() {
        return clientRepo.findAll();

    }
}
