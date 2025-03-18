/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.Stack;

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class MissedAppointments {
    private Stack<Person> missedStack = new Stack<>();
    
    public void addMissedPerson(Person p){
    if (missedStack.size() >= 5){
        missedStack.remove(0);
        
             
               }
              missedStack.push(p);
     
           }
        public Stack<Person> getMissedAppointments(){
        return missedStack ;
            
    }

    String displayMissedAppointments() {
    if(missedStack.isEmpty()){
        return "No missed appointments";
    }
    StringBuilder result = new StringBuilder();
    for (Person p : missedStack){
        result.append(p.getName()).append("(").append(p.getPriority()).append(")\n");
    }
    return result.toString();
    }

    void addMissedAppointment(Person missedPatient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
