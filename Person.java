/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;


/**
 *
 * @author EmoshiogweOmokhudu
 */
public class Person {
    private String name;
    private int age;
    private String priority; // Urgent, Medium, Low
    private String gpDetails;
    private boolean fromHospital;

    public Person(String name, int age, String priority, String gpDetails, boolean fromHospital1) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.fromHospital = fromHospital;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPriority() {
        return priority;
    }

    public String getGpDetails() {
        return gpDetails;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }

   @Override
    public String toString() {
        return name + " (" + priority + ") Age: " + age + " GP: " + gpDetails + " From Hospital: " + fromHospital;
    }
}
   
    

