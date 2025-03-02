package com.workbeattalent.tradingcar.controller;

import com.workbeattalent.tradingcar.dto.ClientRequest;
import com.workbeattalent.tradingcar.model.Client;
import com.workbeattalent.tradingcar.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Client> createClient(@RequestBody ClientRequest request) {
        return new ResponseEntity<>(this.service.create(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Client>> getClients() {
        return new ResponseEntity<>(this.service.getAll(), HttpStatus.OK);
    }

}
