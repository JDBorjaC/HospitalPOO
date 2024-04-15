
package core.hospital.management;

import core.hospital.persons.Doctor;
import core.hospital.persons.Patient;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    
    public Appointment(Doctor doctor, Patient patient){
        this.doctor = doctor;
        this.patient = patient;
        
        doctor.addAppointment(this);
        patient.addAppointment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }
    
    
}
