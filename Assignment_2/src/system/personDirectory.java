/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.ArrayList;


public class personDirectory {
    
    private ArrayList<Person> personHistory;
    
    public personDirectory(){
    this.personHistory= new ArrayList<Person>(); 
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    
    public Person addNewPer(){
    
    Person newPer = new Person();
    personHistory.add(newPer);
    return newPer;
    }
    
    public void deletePerson(Person p){
        personHistory.remove(p);
    }
    
}
