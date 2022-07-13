package com.reactapp.domain.client.repos;

import com.reactapp.domain.client.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client,Long> {
}
