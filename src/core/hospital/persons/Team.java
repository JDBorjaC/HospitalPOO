
package core.hospital.persons;

import java.util.ArrayList;

public class Team {
    private int id;
    private ConsultantDoctor teamLeader;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    
    public Team(int id, ConsultantDoctor teamLeader){
        this.id = id;
        this.teamLeader = teamLeader;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        
        this.doctors.add(teamLeader);
        teamLeader.setTeam(this);
    }
    
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    
    public Doctor getDoctor(int id){
        int doctorID = this.id + id;
        for(Doctor doctor: this.doctors){
            if(doctor.getId() == doctorID)
                return doctor;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public ConsultantDoctor getTeamLeader() {
        return teamLeader;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    
    
}
