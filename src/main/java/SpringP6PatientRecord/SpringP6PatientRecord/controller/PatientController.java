package SpringP6PatientRecord.SpringP6PatientRecord.controller;

import SpringP6PatientRecord.SpringP6PatientRecord.entity.Patient;
import SpringP6PatientRecord.SpringP6PatientRecord.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/savePatient")
    public ResponseEntity<String> addPatient(@RequestBody List<Patient> patient) {
        patient.forEach(Patient1 -> {
            System.err.println(Patient1);
            patientService.savePatient(Patient1);
        });
        return new ResponseEntity<>("Patient details saved", HttpStatus.CREATED);
    }

    @GetMapping("/getAllPatient")
    public ResponseEntity<List<Patient>> getAllPatient() {
        List<Patient> patientlist = patientService.getAllPatient();
        return new ResponseEntity<>(patientlist, HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Patient> getById(@PathVariable("id") int id) {
        Patient patient = patientService.getById(id);
        if (patient != null) {
            return ResponseEntity.ok(patient);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/deleteById/{id}")
    public ResponseEntity<String> deleteById(int id) {
        String str = patientService.deleteById(id);
        return new ResponseEntity<>(str, HttpStatus.OK);
    }

    @PutMapping("/UpdateById/{id}")
    public ResponseEntity<Patient> updateById(@PathVariable("id") int id, @RequestBody Patient patient) {
        Patient p = patientService.updateById(id, patient);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
}
