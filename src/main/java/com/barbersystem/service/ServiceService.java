package com.barbersystem.service;

import com.barbersystem.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public List<com.barbersystem.model.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    public com.barbersystem.model.Service getServiceById(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public com.barbersystem.model.Service saveService(com.barbersystem.model.Service service) {
        return serviceRepository.save(service);
    }
}
