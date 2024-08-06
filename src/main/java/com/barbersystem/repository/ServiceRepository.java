package com.barbersystem.repository;

import com.barbersystem.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}