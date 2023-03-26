package Main;

import java.util.ArrayList;

public class Patient extends Person{
    private String patientId;
    private static ArrayList<Patient> patientArrayList = new ArrayList<>();

    public Patient(){
        super();
        this.patientId = patientId;

    }

    public static ArrayList<Patient> getPatientArrayList() {
        return patientArrayList;
    }

    public static void setPatientArrayList(ArrayList<Patient> patientArrayList) {
        Patient.patientArrayList = patientArrayList;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}

