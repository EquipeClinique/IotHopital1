package com.iot.projetHopital.repository;

import com.iot.projetHopital.entities.Capteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapteurRepository extends JpaRepository<Capteur, Long> {
}
