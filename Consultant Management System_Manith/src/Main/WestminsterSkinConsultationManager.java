package Main;



import GUI.Consultation;
import GUI.MainGui;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class WestminsterSkinConsultationManager implements SkinConsultationManager{

    private ArrayList<Doctor> doctors= new ArrayList<>();

    private ArrayList<Patient>patients =new ArrayList<>();

    private ArrayList<Consultation>consultations= new ArrayList<>();


    public WestminsterSkinConsultationManager() {


    }


    @Override
    public void addDoctor(Doctor doctor) {
        //checking the doctor already registered
        if (doctors.contains(doctor)) {
            System.out.println("Doctor is already registered!!!...");
        } else {
            //adding the doctor into the list
            doctors.add(doctor);
            System.out.println(doctor.getFullName() + " - " + doctor.getMedicalLicenceNumber()
                    + " registered successfully as a Doctor.");
        }
    }

    @Override
    public void deleteDoctor(String name, String medicalLicenceNumber) {

        //checking the doctor list is empty
        if (doctors.isEmpty()) {
            System.out.println("No doctors in the list!!!...");
            return;
        }

        boolean checker = false;
        //finding the relevant doctor from the  list
        for (Doctor doctor : doctors) {
            if (doctor.getFullName().equalsIgnoreCase(name)) {
                if (doctor.getMedicalLicenceNumber().equalsIgnoreCase(medicalLicenceNumber)) {
                    //removing the relevant doctor
                    doctors.remove(doctor);
                    System.out.println("Dr. " + doctor.getFullName() + " successfully removed.");
                    checker = true;
                    break;
                }
            }
        }

        //if no matching results found
        if (!checker) {
            System.out.println("Entered details does not match!!!...");
        }
    }

    public int compare(Doctor d1, Doctor d2) {
        return d1.getSurname().compareTo(d2.getSurname());
    }

    @Override
    public void printDoctorsList() {
        doctors.sort(new Comparator<Doctor>() {
            @Override
            public int compare(Doctor o1,Doctor o2) {
                return o1.getSurname().compareTo(o2.getSurname());}});


        //checking list is empty
        if (doctors.isEmpty()) {
            System.out.println("No doctors available!!!...");
            return;
        }
        //printing all the doctors
        for (Doctor doctor : doctors) {
            System.out.println("Dr. " + doctor.getFullName() + " - " + doctor.getMedicalLicenceNumber());
        }
    }

    @Override
    public boolean checkDoctorRegistered(String licence) {
        return false;
    }




    @Override
    public void saveDataToFile() {


        try {
            //creating the file output stream and setting the file for the doctors list
            File inFile = new File("newFile.txt");
            //creating the object output stream for the doctors list
            PrintStream writer = new PrintStream (inFile);
            //getting objects from doctors list
            for (Doctor doctor : doctors) {
                writer.println("Doctor name    : " + doctor.getName() + "\n"+ "Doctor Surname: " + doctor.getSurname());
                writer.println("Specialization : " + doctor.getSpecialisation());
                writer.println("licenceNum     :" + doctor.getMedicalLicenceNumber());
                writer.println(" ");

            }

            System.out.println("Data saved to the file Successfully!!");

            System.out.println("Successfully Saved...");
            System.out.println("");
            writer.close();

        } catch (FileNotFoundException e) {
            //if file not found
            System.out.println("File not Found");
            //e.printStackTrace();
        } catch (Exception e) {
            //if any other error occurred
            System.out.println("Something went Wrong");
        }
    }



    @Override
    public void displayGUI() {

        MainGui mainGui= new MainGui(doctors,consultations);

        mainGui.setVisible(true);



    }



}
