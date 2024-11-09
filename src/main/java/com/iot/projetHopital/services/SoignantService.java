package com.iot.projetHopital.services;

import java.util.List;

import com.iot.projetHopital.entities.Patient;
import com.iot.projetHopital.entities.Soignant;
import com.iot.projetHopital.repository.SoignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoignantService {

    @Autowired
    private SoignantRepository soignantRepository;

    public List<Soignant> getAllSoignants() {
        return soignantRepository.findAll();
    }

    public Soignant getSoignantById(Long id) {
        return soignantRepository.findById(id).orElse(null);
    }

    public Soignant addSoignant(Soignant soignant) {
        return soignantRepository.save(soignant);
    }

    public void assignPatientToSoignant(Long soignantId, Patient patient) {
        Soignant soignant = getSoignantById(soignantId);
        if (soignant != null) {
            soignant.getPatients().add(patient);
            soignantRepository.save(soignant);
        }
    }
}
