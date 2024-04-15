/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.hospital.persons;

import core.hospital.management.Appointment;
import java.util.ArrayList;

public abstract class Doctor {

    protected int id;
    protected Team team;
    protected ArrayList<Appointment> appointments;
    protected ArrayList<Patient> patients;

    public Doctor(int id) {
        this.id = id;
        this.team = null;
        this.appointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public Doctor(Team team, int id) {
        this.id = id;
        this.team = team;
        this.appointments = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public boolean addPatient(Patient patient) {
        if (!this.patients.contains(patient)) {
            this.patients.add(patient);
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
    
    public int getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
