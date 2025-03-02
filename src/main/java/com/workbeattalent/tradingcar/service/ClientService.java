package com.workbeattalent.tradingcar.service;

import com.workbeattalent.tradingcar.dto.ClientRequest;
import com.workbeattalent.tradingcar.model.Client;

import java.util.List;

public interface ClientService {
    Client create(ClientRequest request);

    List<Client> getAll();
}
