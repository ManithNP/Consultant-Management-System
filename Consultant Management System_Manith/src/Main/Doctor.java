package Main;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Person {
    private String medicalLicenceNumber;
    private String specialisation;
    private static ArrayList<Doctor> doctorArrayList = new ArrayList<>(10);


    public Doctor() {
        super();
        this.medicalLicenceNumber = medicalLicenceNumber;
        this.specialisation =specialisation;
    }



    public static ArrayList<Doctor> getDoctorArrayList() {
        return doctorArrayList;
    }

    public static void setDoctorArrayList(ArrayList<Doctor> doctorArrayList) {
        Doctor.doctorArrayList = doctorArrayList;
    }

    public String getMedicalLicenceNumber() {
        return medicalLicenceNumber;
    }

    public void setMedicalLicenceNumber(String medicalLicenceNumber) {this.medicalLicenceNumber = medicalLicenceNumber;}

    public String getSpecialisation(){return specialisation;}

    public void setSpecialisation(String specialisation){this.specialisation=specialisation;}




}