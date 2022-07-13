package com.reactapp.domain.client.services;

import com.reactapp.domain.client.exceptions.ClientCreationException;
import com.reactapp.domain.client.model.Client;

public interface ClientService {
    Client create(Client client) throws ClientCreationException;
    Iterable<Client>getAllClients();
}
