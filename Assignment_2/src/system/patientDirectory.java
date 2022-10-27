/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;


public class patientDirectory {
    
    private ArrayList<Patient> patientHistory;
    
    public patientDirectory(){
    this.patientHistory= new ArrayList<Patient>(); 
    }

    public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    public Patient addNewPat(){
    
    Patient newPat= new Patient();
    patientHistory.add(newPat);
    return newPat;
    }
    
    public void deletePatient(Patient p){
        patientHistory.remove(p);
    }
    
}
