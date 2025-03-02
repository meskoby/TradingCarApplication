package com.workbeattalent.tradingcar.service;

import com.workbeattalent.tradingcar.dto.ClientRequest;
import com.workbeattalent.tradingcar.model.Client;
import com.workbeattalent.tradingcar.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client create(ClientRequest request) {
        Client client = new Client(
                request.firstname(),
                request.lastname(),
                request.email(),
                request.gender()
        );
        Client saved = this.repository.save(client);
        return saved;
    }

    @Override
    public List<Client> getAll() {
        return this.repository.findAll();
    }
}
