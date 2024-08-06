package com.barbersystem.controller;

import com.barbersystem.model.Service;
import com.barbersystem.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping
    public List<Service> getAllServices() {
        return serviceService.getAllServices();
    }

    @PostMapping
    public Service saveService(@RequestBody Service service) {
        return (Service) serviceService.saveService(service);
    }
}
