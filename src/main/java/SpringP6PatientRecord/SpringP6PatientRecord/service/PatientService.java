package SpringP6PatientRecord.SpringP6PatientRecord.service;

import SpringP6PatientRecord.SpringP6PatientRecord.entity.Patient;

import java.util.List;

public interface PatientService {

    public String savePatient(Patient patient);

    public List<Patient> getAllPatient();

    public Patient getById(int id);

    public String deleteById(int id);
}
