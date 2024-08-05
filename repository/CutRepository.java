package com.barbersystem.repository;

import com.barbersystem.model.Barber;
import com.barbersystem.model.Cut;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CutRepository extends JpaRepository<Cut, Long> {
    List<Cut> findByBarberAndDateBetween(Barber barber, LocalDate startDate, LocalDate endDate);
    List<Cut> findByDateBetween(LocalDate startDate, LocalDate endDate);
}
