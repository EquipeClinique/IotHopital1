package com.iot.projetHopital.services;

import java.util.List;
import com.iot.projetHopital.entities.Alerte;
import com.iot.projetHopital.repository.AlerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlerteService {

    @Autowired
    private AlerteRepository alerteRepository;

    public List<Alerte> getAllAlertes() {
        return alerteRepository.findAll();
    }

    public Alerte getAlerteById(Long id) {
        return alerteRepository.findById(id).orElse(null);
    }

    public Alerte createAlerte(Alerte alerte) {
        return alerteRepository.save(alerte);
    }

    public void deleteAlerte(Long id) {
        alerteRepository.deleteById(id);
    }
}
