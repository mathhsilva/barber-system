package com.barbersystem.controller;

import com.barbersystem.model.Cut;
import com.barbersystem.service.CutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/cuts")
public class CutController {
    @Autowired
    private CutService cutService;

    @GetMapping("/barber/{barberId}")
    public List<Cut> getCutsByBarberAndDate(@PathVariable Long barberId, @RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return cutService.getCutsByBarberAndDate(barberId, startDate, endDate);
    }

    @GetMapping
    public List<Cut> getAllCutsByDate(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate) {
        return cutService.getAllCutsByDate(startDate, endDate);
    }

    @PostMapping
    public Cut saveCut(@RequestBody Cut cut) {
        return cutService.saveCut(cut);
    }
}
