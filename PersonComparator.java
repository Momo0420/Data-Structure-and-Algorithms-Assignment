/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.Comparator;

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2){
        if (p1.getPriority().equals(p2.getPriority())){
            if (p1.isFromHospital() && !p2.isFromHospital()) return -1;
            if (!p1.isFromHospital() && p2.isFromHospital()) return 1;
            return Integer.compare(p2.getAge(), p1.getAge());
            
        }
        return p1.getPriority().compareTo(p2.getPriority());
    }
    
}
