package Main;


public interface SkinConsultationManager {


     void addDoctor(Doctor doctor);

     void deleteDoctor(String name, String medicalLicenceNumber);

     int compare(Doctor d1, Doctor d2);

     void printDoctorsList();

     boolean checkDoctorRegistered(String id);


     void saveDataToFile();

     void displayGUI();



}
