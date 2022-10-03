package model;

import java.util.ArrayList;

public class EmployeeHistory {
    
    private ArrayList<EmployeeDetails> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<>();
    }

    public ArrayList<EmployeeDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeDetails> history) {
        this.history = history;
    }
    
    public EmployeeDetails addNewProfile(){
        
        EmployeeDetails newProfile = new EmployeeDetails();
        history.add(newProfile);
        return newProfile;
        
    }
    
    public void deleteEmployee(EmployeeDetails ed){
        history.remove(ed);
    }
    
}
