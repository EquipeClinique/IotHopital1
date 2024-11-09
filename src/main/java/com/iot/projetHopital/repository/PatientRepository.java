package com.iot.projetHopital.repository;

import com.iot.projetHopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patient, Long> {

}
