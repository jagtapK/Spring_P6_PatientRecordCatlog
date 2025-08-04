package SpringP6PatientRecord.SpringP6PatientRecord.repository;

import SpringP6PatientRecord.SpringP6PatientRecord.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
