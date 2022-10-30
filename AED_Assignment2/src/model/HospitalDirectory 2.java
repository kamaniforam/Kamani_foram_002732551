/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author foram
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> listOfHospital;

    public ArrayList<Hospital> getListOfHospital() {
        return listOfHospital;
    }

    public void setListOfHospital(ArrayList<Hospital> listOfHospital) {
        this.listOfHospital = listOfHospital;
    }
    
    public HospitalDirectory(){
        this.listOfHospital = new ArrayList<>();
    }

    public Hospital addNewHospital(){
        Hospital hospital = new Hospital();
        listOfHospital.add(hospital);
        return hospital;
    }
    
    public void deletePerson(Hospital hospital){
        listOfHospital.remove(hospital);
    }

    public void deleteDoctor(Hospital hospital) {
         listOfHospital.remove(hospital);
    }
}
