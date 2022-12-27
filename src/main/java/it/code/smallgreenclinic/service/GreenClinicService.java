package it.code.smallgreenclinic.service;

import it.code.smallgreenclinic.exception.UserNotFoundException;
import it.code.smallgreenclinic.model.Patient;
import it.code.smallgreenclinic.model.SmallGreenClinic;
import it.code.smallgreenclinic.repository.ClinicRepo;
import it.code.smallgreenclinic.repository.GreenCliniRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class GreenClinicService{
    private GreenCliniRepo greenClinicRepo;
    private final ClinicRepo clinicRepo;
    @Autowired
    public GreenClinicService(ClinicRepo clinicRepo,GreenCliniRepo greenClinicRepo) {
        this.clinicRepo = clinicRepo;
        this.greenClinicRepo = greenClinicRepo;
    }

   public List<Patient> findAllPatients(){

        return clinicRepo.findAll();
    }

    public Patient addPatient(Patient patient){

        patient.setRxCode("Rx-" + UUID.randomUUID());

        return clinicRepo.save(patient);
    }

    public Patient updatePatient(Patient patient){

        return clinicRepo.save(patient);
    }

    public void deletePatientById(Long patientId){clinicRepo.deleteById(patientId);}

    public Patient findPatientById(Long patientId){

        return clinicRepo.findPatientById(patientId).orElseThrow(
                ()->new UserNotFoundException("The specified PatientId " + patientId+" does not exist!"));
    }

    public SmallGreenClinic findClinicById(Long clinicId){
        return greenClinicRepo.findClinicById(clinicId).orElseThrow(
                ()->new UserNotFoundException("The specified clinicId " + clinicId+" does not exist!"));
        };

    public SmallGreenClinic addClinic(SmallGreenClinic clinic) {

        clinic.setClinicCode(""+UUID.randomUUID().toString());

        return greenClinicRepo.save(clinic);
    }

    public List<SmallGreenClinic> findAllClinics(){

        return greenClinicRepo.findAll();
    }
}


