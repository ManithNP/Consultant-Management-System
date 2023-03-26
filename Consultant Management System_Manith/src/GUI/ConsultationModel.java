package GUI;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ConsultationModel extends AbstractTableModel {
    private String[] columnNames = {"Date", "Doctor Name", "Start Time", "End Time","Cost","Notes"};

    private ArrayList<Consultation> consultations;
    public ConsultationModel(ArrayList<Consultation> consultationArrayList) {this.consultations=consultationArrayList;}



    @Override
    public int getRowCount() {
        return consultations.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    public Object getValueAt(int row, int col){
        Consultation consultation = consultations.get(row);
       switch (col){
           case 0: return consultation.getConDate();
           case 1: return consultation.getDocName();
           case 2: return consultation.getStTime();
           case 3: return consultation.getEnTime();
           case 4: return consultation.getCost();
           case 5: return consultation.getNotes();
          default: return null;
       }



    }

}
