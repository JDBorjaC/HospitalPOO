package core.hospital;

import core.hospital.management.Appointment;
import core.hospital.management.Ward;
import core.hospital.persons.ConsultantDoctor;
import core.hospital.persons.Doctor;
import core.hospital.persons.JuniorDoctor;
import core.hospital.persons.Patient;
import core.hospital.persons.Team;
import java.util.ArrayList;

public class Hospital {

    private ArrayList<Team> teams;
    private ArrayList<Ward> wards;

    public Hospital() {
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }

    public void numberDoctorsPatient() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                System.out.println("Patient " + patient.getId() + " has " + patient.getNumberOfDoctors() + " doctors");
            }
        }
    }

    public void numberPatientsTeam() {
        for (Team team : this.teams) {
            System.out.println("Team " + team.getId() + " has " + team.getPatients().size() + " patients");
        }
    }

    public void relationAppoiments() {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                System.out.println("Patient " + patient.getId() + " has " + patient.getAppointments().size() + " appointments");
                for(Appointment appointment: patient.getAppointments()){
                    System.out.println("Patient " + patient.getId() + " has an appointment with the doctor " + appointment.getDoctor().getId());
                }
            }
        }
    }

    public boolean addTeam(int id, int consultantDoctorID) {
        ConsultantDoctor doctor = new ConsultantDoctor(consultantDoctorID);
        this.teams.add(new Team(id, doctor));
        return true;
    }

    public boolean addJuniorDoctor(Team team, int id) {
        team.getDoctors().add(new JuniorDoctor(team, id));
        return true;
    }

    public boolean addWard(int id) {
        this.wards.add(new Ward(id));
        return true;
    }

    public boolean addPatient(Ward ward, Team team, int id) {
        new Patient(ward, team, id);
        return true;
    }

    public boolean assignPatientDoctor(Patient patient, int id) {
        Doctor doctor = patient.getTeam().getDoctor(id);
        doctor.addPatient(patient);
        patient.addDoctor(doctor);
        return true;
    }

    public boolean assignAppointment(Patient patient, int id) {
        Doctor doctor = patient.getTeam().getDoctor(id);
        new Appointment(doctor, patient);
        return true;
    }

    public Team getTeam(int id) {
        for (Team team : this.teams) {
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    public Ward getWard(int id) {
        for (Ward ward : this.wards) {
            if (ward.getId() == id) {
                return ward;
            }
        }
        return null;
    }

    public Patient getPatient(int id) {
        for (Ward ward : this.wards) {
            for (Patient patient : ward.getPatients()) {
                if (patient.getId() == id) {
                    return patient;
                }
            }
        }
        return null;
    }

}
