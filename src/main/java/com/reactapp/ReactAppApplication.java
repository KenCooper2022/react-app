package com.reactapp;

import com.reactapp.domain.client.model.Client;
import com.reactapp.domain.client.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactAppApplication implements CommandLineRunner {
    private static Logger logger = LoggerFactory.getLogger(ReactAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReactAppApplication.class, args);
    }
    @Autowired
    private ClientService clientService;
    @Override
    public void run(String... args) throws Exception {
        Client client = new Client("Tariq","Hook","T@gmail.com","password");
        client = clientService.create(client);
        logger.info(client.toString());

    }
}
