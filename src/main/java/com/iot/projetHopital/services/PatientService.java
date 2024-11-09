package com.iot.projetHopital.services;

import java.util.List;

import com.iot.projetHopital.entities.Patient;
import com.iot.projetHopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient patientDetails) {
        Patient patient = getPatientById(id);
        if (patient != null) {
            patient.setNom(patientDetails.getNom());
            patient.setPrenom(patientDetails.getPrenom());
            patient.setAdresse(patientDetails.getAdresse());
            patient.setNumeroTelephone(patientDetails.getNumeroTelephone());
            patient.setEmail(patientDetails.getEmail());
            patient.setAge(patientDetails.getAge());
            patient.setEtatDeSante(patientDetails.getEtatDeSante());
            return patientRepository.save(patient);
        }
        return null;
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
