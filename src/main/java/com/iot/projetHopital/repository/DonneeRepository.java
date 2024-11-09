package com.iot.projetHopital.repository;

import com.iot.projetHopital.entities.Donnee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonneeRepository extends JpaRepository<Donnee, Long> {
}
