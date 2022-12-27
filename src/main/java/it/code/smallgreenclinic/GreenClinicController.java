package it.code.smallgreenclinic;

import it.code.smallgreenclinic.model.Patient;
import it.code.smallgreenclinic.model.SmallGreenClinic;
import it.code.smallgreenclinic.service.GreenClinicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class GreenClinicController{

    private final GreenClinicService clinicService;


    public GreenClinicController(GreenClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Patient>> getAllPatients(){

        List<Patient> patientList =clinicService.findAllPatients();

        return new ResponseEntity<>(patientList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id) {

        Patient patient = clinicService.findPatientById(id);

        return new ResponseEntity<>(patient,HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Patient> addEmployee(@RequestBody Patient patient) {

        Patient newPatient = clinicService.addPatient(patient);

        return new ResponseEntity<>(newPatient,HttpStatus.CREATED);

    }

    @PutMapping("/update")
    public ResponseEntity<Patient> updateEmployee(@RequestBody Patient patient) {

        Patient updatedPatient = clinicService.updatePatient(patient);

        return new ResponseEntity<>(updatedPatient,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePatient(@PathVariable("id")Long id) {

        clinicService.deletePatientById(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/findClinic/{clinicId}")
    public ResponseEntity<SmallGreenClinic> getClinicById(@PathVariable("clinicId") Long id) {


        SmallGreenClinic greenclinic = clinicService.findClinicById(id);

        return new ResponseEntity<>(greenclinic,HttpStatus.OK);
    }
    @PostMapping("/addClinic")
    public ResponseEntity<SmallGreenClinic> addClinic(@RequestBody SmallGreenClinic clinic) {

        SmallGreenClinic newClinic = clinicService.addClinic(clinic);

        return new ResponseEntity<>(newClinic,HttpStatus.CREATED);

    }

    @GetMapping("/clinic")
    public ResponseEntity<List<SmallGreenClinic>> getAllClinics(){

        List<SmallGreenClinic> clinicList =clinicService.findAllClinics();

        return new ResponseEntity<>(clinicList, HttpStatus.OK);
    }
}
