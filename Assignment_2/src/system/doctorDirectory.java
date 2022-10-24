/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;

/**
 *
 * @author parth
 */
public class doctorDirectory {
    
    private ArrayList<Doctor> docHistory;
    
    public doctorDirectory(){
    this.docHistory= new ArrayList<Doctor>(); 
    }

    public ArrayList<Doctor> getDocHistory() {
        return docHistory;
    }

    public void setHistory(ArrayList<Doctor> docHistory) {
        this.docHistory = docHistory;
    }
    
    public Doctor addNewDoc(){
    
    Doctor newDoc= new Doctor();
    docHistory.add(newDoc);
    return newDoc;
    }
    
    public void deleteDoctor(Doctor d){
        docHistory.remove(d);
    }
    
}
