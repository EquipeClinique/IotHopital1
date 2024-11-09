package com.iot.projetHopital.repository;

import com.iot.projetHopital.entities.Soignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoignantRepository extends JpaRepository<Soignant , Long> {
}
