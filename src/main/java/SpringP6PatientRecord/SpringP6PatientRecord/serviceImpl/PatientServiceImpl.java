package SpringP6PatientRecord.SpringP6PatientRecord.serviceImpl;

import SpringP6PatientRecord.SpringP6PatientRecord.entity.Patient;
import SpringP6PatientRecord.SpringP6PatientRecord.repository.PatientRepository;
import SpringP6PatientRecord.SpringP6PatientRecord.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;


    @Override
    public String savePatient(Patient patient) {
        Patient patient1 = patientRepository.save(patient);
        return "patient details saved";
    }

    @Override
    public List<Patient> getAllPatient() {
        List<Patient> patient = patientRepository.findAll();
        return patient;
    }

    @Override
    public Patient getById(int id) {
    Patient patient = patientRepository.findById(id).orElseThrow(()
            ->new NullPointerException("id is not found"+id));
        return patient;
    }

    @Override
    public String deleteById(int id) {
        patientRepository.deleteById(id);
        return "Given Id Deleted";
    }


}
