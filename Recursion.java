/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.List;

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class Recursion {
  public static int countUrgentPatients(List<Person> patients, int index) {
        if (patients == null || patients.isEmpty() || index >= patients.size()) {
            return 0;
        }
        int count = patients.get(index).getPriority().equalsIgnoreCase("Urgent") ? 1 : 0;
        return count + countUrgentPatients(patients, index + 1);
          }
}