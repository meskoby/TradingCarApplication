package com.workbeattalent.tradingcar.controller;

import com.workbeattalent.tradingcar.dto.ClientRequest;
import com.workbeattalent.tradingcar.model.Client;
import com.workbeattalent.tradingcar.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = {"/api/v1/clients"})
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    public Client createClient(@RequestBody ClientRequest request) {
        Client client = this.service.create(request);
        return client;
    }

    @GetMapping
    public List<Client> getClients() {
        return this.service.getAll();
    }

}
