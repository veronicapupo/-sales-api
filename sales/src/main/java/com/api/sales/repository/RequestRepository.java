package com.api.sales.repository;

import com.api.sales.entity.Client;
import com.api.sales.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {

    List<Request> findByClient(Client client);
}
