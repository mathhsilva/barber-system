package com.barbersystem.controller;

import com.barbersystem.model.Barber;
import com.barbersystem.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barbers")
public class BarberController {
    @Autowired
    private BarberService barberService;

    @GetMapping
    public List<Barber> getAllBarbers() {
        return barberService.getAllBarbers();
    }

    @PostMapping
    public Barber saveBarber(@RequestBody Barber barber) {
        return barberService.saveBarber(barber);
    }
}

