package GUI;


import Main.Doctor;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DoctorModel extends AbstractTableModel{





    private String[] columns = {"Name", "SurName" , "Date Of Birth" , "Mobile Number" , "Medical Licence No",
            "Specification"};

    private ArrayList<Doctor> doctors;


    public DoctorModel(ArrayList<Doctor> doctorArrayList){
        this.doctors = doctorArrayList;
    }

    @Override
    public int getRowCount() {return doctors.size();}

    @Override
    public int getColumnCount() {return columns.length;}

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {


        switch (columnIndex){
            case 0:
                return doctors.get(rowIndex).getName();
            case 1:
                return doctors.get(rowIndex).getSurname();
            case 2:
                return doctors.get(rowIndex).getDateOfBirth();
            case 3:
                return doctors.get(rowIndex).getMobileNumber();
            case 4:
                return doctors.get(rowIndex).getMedicalLicenceNumber();
            case 5:
                return doctors.get(rowIndex).getSpecialisation();
            default:
                return null;
        }
    }

    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }
}