package it.code.smallgreenclinic.repository;

import it.code.smallgreenclinic.model.Patient;
import it.code.smallgreenclinic.model.SmallGreenClinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClinicRepo extends JpaRepository<Patient, Long> {

    Optional<Patient> findPatientById(Long patientId);


}
