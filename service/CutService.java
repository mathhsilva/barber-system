package com.barbersystem.service;

import com.barbersystem.model.Barber;
import com.barbersystem.model.Cut;
import com.barbersystem.repository.BarberRepository;
import com.barbersystem.repository.CutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CutService {
    @Autowired
    private CutRepository cutRepository;

    @Autowired
    private BarberRepository barberRepository;

    public List<Cut> getCutsByBarberAndDate(Long barberId, LocalDate startDate, LocalDate endDate) {
        Barber barber = barberRepository.findById(barberId).orElse(null);
        return cutRepository.findByBarberAndDateBetween(barber, startDate, endDate);
    }

    public List<Cut> getAllCutsByDate(LocalDate startDate, LocalDate endDate) {
        return cutRepository.findByDateBetween(startDate, endDate);
    }

    public Cut saveCut(Cut cut) {
        return cutRepository.save(cut);
    }
}
