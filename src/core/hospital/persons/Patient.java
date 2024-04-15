package core.hospital.persons;

import core.hospital.management.Appointment;
import core.hospital.management.Ward;
import java.util.ArrayList;

public class Patient {

    private int id;
    private Team team;
    private Ward ward;
    private ArrayList<Appointment> appointments;
    private ArrayList<Doctor> doctors;

    public Patient(Ward ward, Team team, int id) {
        this.id = id;
        this.team = team;
        this.ward = ward;
        this.appointments = new ArrayList<>();
        this.doctors = new ArrayList<>();

        team.addPatient(this);
        ward.addPatient(this);
    }

    public boolean addDoctor(Doctor doctor) {
        if (!this.doctors.contains(doctor)) {
            this.doctors.add(doctor);
            return true;
        }
        return false;
    }
    
    public boolean addAppointment(Appointment appointment){
        if(!this.appointments.contains(appointment)){
        this.appointments.add(appointment);
        return true;
        }
        return false;
    }
    
    public int getNumberOfDoctors(){
        return this.doctors.size();
    }

    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public Ward getWard() {
        return ward;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

}
