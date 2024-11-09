package com.iot.projetHopital.repository;

import com.iot.projetHopital.entities.Alerte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlerteRepository extends JpaRepository<Alerte, Long> {
}
