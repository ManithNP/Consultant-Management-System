package GUI;





public class Consultation {
    private  String docName;
    private String patName;
    private String patSurName;
    private String patDOB;
    private int patMobNo;
    private String conDate;
    private String stTime;
    private String enTime;
    private int cost;
    private String notes;


    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {this.docName =docName;}

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName =patName;
    }

    public String getPatSurName() {
        return patSurName;
    }

    public void setPatSurName(String patSurName) {
        this.patSurName = patSurName;
    }

    public String getPatDOB() {
        return patDOB;
    }

    public void setPatDOB(String patDOB) {
        this.patDOB = patDOB;
    }

    public int getPatMobNo() {
        return patMobNo;
    }

    public void setPatMobNo(int patMobNo) {
        this.patMobNo =patMobNo;
    }

    public String getConDate() {
        return conDate;
    }

    public void setDate(String conDate) {
        this.conDate = conDate;
    }

    public String getStTime() {return stTime;}

    public void setStTime(String stTime) {
        this.stTime = stTime;
    }

    public String getEnTime() {return enTime;}

    public void setEnTime(String enTime) {
        this.enTime = enTime;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


}
