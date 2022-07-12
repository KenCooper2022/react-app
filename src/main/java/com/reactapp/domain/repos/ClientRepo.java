package com.reactapp.domain.repos;

import com.reactapp.domain.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client,Long> {
}
