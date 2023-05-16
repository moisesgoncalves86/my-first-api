package com.moises.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moises.api.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
