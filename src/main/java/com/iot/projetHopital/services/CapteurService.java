package com.iot.projetHopital.services;

import java.util.List;
import com.iot.projetHopital.entities.Capteur;
import com.iot.projetHopital.repository.CapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapteurService {

    @Autowired
    private CapteurRepository capteurRepository;

    public List<Capteur> getAllCapteurs() {
        return capteurRepository.findAll();
    }

    public Capteur getCapteurById(Long id) {
        return capteurRepository.findById(id).orElse(null);
    }

    public Capteur createCapteur(Capteur capteur) {
        return capteurRepository.save(capteur);
    }

    public Capteur updateCapteur(Long id, Capteur capteurDetails) {
        Capteur capteur = getCapteurById(id);
        if (capteur != null) {
            capteur.setType(capteurDetails.getType());
            capteur.setType(capteurDetails.getType());
            return capteurRepository.save(capteur);
        }
        return null;
    }

    public void deleteCapteur(Long id) {
        capteurRepository.deleteById(id);
    }
}
