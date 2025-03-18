/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class BloodTestQueue implements Scheduler {
    private PriorityQueue<Person> queue = new PriorityQueue<>(new PersonComparator());
    

    @Override
    public void addPerson(Person person) {
        queue.add(person);

    }

    @Override
    public Person getNextPatient() {
        return queue.poll();
        
    }
    public boolean isEmpty() {
        return queue.isEmpty();
        
    }

    List<Person> getAllPatients() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 }

    

