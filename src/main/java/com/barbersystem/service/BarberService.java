package com.barbersystem.service;

import com.barbersystem.model.Barber;
import com.barbersystem.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberService {
    @Autowired
    private BarberRepository barberRepository;

    public List<Barber> getAllBarbers() {
        return barberRepository.findAll();
    }

    public Barber getBarberById(Long id) {
        return barberRepository.findById(id).orElse(null);
    }

    public Barber saveBarber(Barber barber) {
        return barberRepository.save(barber);
    }
}