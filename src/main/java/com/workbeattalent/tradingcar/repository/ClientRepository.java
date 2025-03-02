package com.workbeattalent.tradingcar.repository;

import com.workbeattalent.tradingcar.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
