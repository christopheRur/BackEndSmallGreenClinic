package it.code.smallgreenclinic.repository;

import it.code.smallgreenclinic.model.Patient;
import it.code.smallgreenclinic.model.SmallGreenClinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface GreenCliniRepo extends JpaRepository<SmallGreenClinic, Long> {


    Optional<SmallGreenClinic> findClinicById(Long id);
}
