package Main;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;




public class Main {


    private static final Scanner myScanner = new Scanner(System.in);  //creating a global scanner
    static SkinConsultationManager consultationManager = new WestminsterSkinConsultationManager();



    public static void main(String[] args ){

        displayMenu();
 }


    private static void displayMenu() {

        menu:
        //infinite loop
        while (true) {
            System.out.println("");
            System.out.println( "Press 1 to Register a Doctor");
            System.out.println("Press 2 to Delete a Doctor");
            System.out.println("Press 3 to Print Doctors List");
            System.out.println("Press 4 to Display GUI");
            System.out.println("Press 5 to Save Details in a Text File");
            System.out.println("Press 0 to Quit from the Application" );
            System.out.println("Enter your choice : ");
            int choice;
            boolean flag = Boolean.TRUE;

            while (flag) {
                //checking input is an integer or not using try catch
                try {
                    choice = myScanner.nextInt();

                    switch (choice) {
                        case 1:
                            addDoctor();
                            break;
                        case 2:
                            deleteDoctor();
                            break;
                        case 3:
                           consultationManager.printDoctorsList();
                            break;
                        case 4:
                            consultationManager.displayGUI();
                            break;
                        case 5:
                            consultationManager.saveDataToFile();
                            backToMenu();

                        case 0:
                            System.out.println("Thank You for using the System. Have a Pleasant Day!");
                            System.exit(0);
                            break menu;
                        default:
                            System.out.println("You Selected an Invalid Option. Please Try Again!");
                            displayMenu();
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter valid option!!!...");
                    String input = myScanner.next();
                    if (input.equalsIgnoreCase("y")) {
                        backToMenu();
                    } else {
                        break;
                    }
                }
                flag = false;
            }
        }
    }




    private static void backToMenu() {
        System.out.println("Press \"Y\" to continue with main menu, press \"Q\" to exit:..");
        String input = myScanner.next();
        if (input.equalsIgnoreCase("y")) {
            displayMenu();
        } else if(input.equalsIgnoreCase("Q")) {
            System.exit(0);
        }
        else {

        }
    }




    private static void addDoctor() {
        Doctor doctor = new Doctor();
        SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");

        //getting user inputs

        System.out.println("Enter the licence number of the Doctor : ");
        String licence = myScanner.next();
        if (consultationManager.checkDoctorRegistered(licence)) {
            System.out.println("Doctor with given licence number already registered!!!...");
            return;
        } else {
            doctor.setMedicalLicenceNumber(licence);
        }




        System.out.println("Enter the name of the Doctor : ");
        try {
            String name = myScanner.next();
            doctor.setName(name);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid name.");
        }

        System.out.println("Enter the surname of the Doctor : ");
        try {
            String surname = myScanner.next();
            doctor.setSurname(surname);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid surname.");
        }

        System.out.println("Enter the specialization of the Doctor : ");
        try {
            String specialization = myScanner.next();
            doctor.setSpecialisation(specialization);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid specialization.");
        }








        System.out.println("Enter the date of birth of the Doctor (yyyy-MM-dd) : ");
        String dob = myScanner.next();
        try {
            Date date = dateInput.parse(dob);
            doctor.setDateOfBirth(date);
        } catch (ParseException e) {
            System.out.println("Invalid input!!!...");
            return;
        }
        System.out.println("Enter the mobile number of the Doctor : ");
        int mobileNumber = myScanner.nextInt();
        doctor.setMobileNumber(mobileNumber);

        consultationManager.addDoctor(doctor);
    }




    private static void deleteDoctor() {

        System.out.println("Enter the Doctor name you want to Delete (name(space)surname) : ");
        String fullName = myScanner.next();
        fullName += myScanner.nextLine(); // accept inputs with spaces
        System.out.println("Enter the licence number of the Doctor you want to Delete : ");
        String licenceNo = myScanner.next();
        consultationManager.deleteDoctor(fullName, licenceNo);
    }



}
