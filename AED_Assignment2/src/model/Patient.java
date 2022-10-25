package model;

/**
 *
 */
public class Patient {
    
    private String patientID;
    private String primaryDoctorName;
    private String city;
    private VitalSignHistory vitalSignHistory;
    private int age;
    private Patient patient;
    private String personhouse;
    private String personcommunity;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getPersonhouse() {
        return personhouse;
    }

    public void setPersonhouse(String personhouse) {
        this.personhouse = personhouse;
    }

    public String getPersoncommunity() {
        return personcommunity;
    }

    public void setPersoncommunity(String personcommunity) {
        this.personcommunity = personcommunity;
    }
    
    
    public Patient() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public String getPatientID() {
        return patientID;
    }
    
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getcity() {
        return city;
    }
    
    public void setcity(String prefferedPharmacy) {
        this.city = city;
    }
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patientID);
    }
}
