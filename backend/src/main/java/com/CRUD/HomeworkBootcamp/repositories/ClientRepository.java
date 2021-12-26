package com.CRUD.HomeworkBootcamp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.HomeworkBootcamp.entites.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
