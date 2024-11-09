package com.iot.projetHopital.services;

import java.util.List;

import com.iot.projetHopital.entities.Donnee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonneeService {

    @Autowired
    private DonneeRepository donneeRepository;

    public List<Donnee> getDonneesByCapteurId(Long capteurId) {
        return donneeRepository.findByCapteurId(capteurId);
    }

    public Donnee addDonnee(Donnee donnee) {
        return donneeRepository.save(donnee);
    }
}
