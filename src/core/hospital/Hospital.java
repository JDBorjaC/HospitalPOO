
package core.hospital;

import core.hospital.management.Ward;
import core.hospital.persons.Team;
import java.util.ArrayList;


public class Hospital {
    private ArrayList<Team> teams;
    private ArrayList <Ward> wards;
    
    public Hospital(){
        this.teams = new ArrayList<>();
        this.wards = new ArrayList<>();
    }
}
