/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package model;

/**
 */
public class Person {
    private String personName;
    private int age;
    private Patient patient;
    private int personHouseNo;
    private String personCommunity;
    private String personCity;

    public int getPersonhouse() {
        return personHouseNo;
    }

    public void setPersonhouse(int personhouse) {
        this.personHouseNo = personhouse;
    }

    public String getPersoncommunity() {
        return personCommunity;
    }

    public void setPersoncommunity(String personcommunity) {
        this.personCommunity = personcommunity;
    }

    public String getPersoncity() {
        return personCity;
    }

    public void setPersoncity(String personcity) {
        this.personCity = personcity;
    }
    
    public String getPersonName() {
        return personName;
    }
    
    public void setPersonName(String personName) {
        this.personName = personName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString()
    {
        return this.personName;
    }
}
