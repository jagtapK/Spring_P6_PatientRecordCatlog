package SpringP6PatientRecord.SpringP6PatientRecord.serviceImpl;

import SpringP6PatientRecord.SpringP6PatientRecord.entity.Patient;
import SpringP6PatientRecord.SpringP6PatientRecord.repository.PatientRepository;
import SpringP6PatientRecord.SpringP6PatientRecord.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public String savePatient(Patient patient) {
        Patient patient1 = patientRepository.save(patient);
        return "patient details saved";
    }
}
