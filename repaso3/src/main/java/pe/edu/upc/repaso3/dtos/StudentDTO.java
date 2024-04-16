package pe.edu.upc.repaso3.dtos;

public class StudentDTO {
    private int gcIdStudent;
    private String gcDNI;
    private String gcName;
    private String gcLastName;
    private double gcEV1;
    private double gcEV2;
    private double gcNF;
    private boolean gcApproved;

    public int getGcIdStudent() {
        return gcIdStudent;
    }

    public void setGcIdStudent(int gcIdStudent) {
        this.gcIdStudent = gcIdStudent;
    }

    public String getGcDNI() {
        return gcDNI;
    }

    public void setGcDNI(String gcDNI) {
        this.gcDNI = gcDNI;
    }

    public String getGcName() {
        return gcName;
    }

    public void setGcName(String gcName) {
        this.gcName = gcName;
    }

    public String getGcLastName() {
        return gcLastName;
    }

    public void setGcLastName(String gcLastName) {
        this.gcLastName = gcLastName;
    }

    public double getGcEV1() {
        return gcEV1;
    }

    public void setGcEV1(double gcEV1) {
        this.gcEV1 = gcEV1;
    }

    public double getGcEV2() {
        return gcEV2;
    }

    public void setGcEV2(double gcEV2) {
        this.gcEV2 = gcEV2;
    }

    public double getGcNF() {
        return gcNF;
    }

    public void setGcNF(double gcNF) {
        this.gcNF = gcNF;
    }

    public boolean isGcApproved() {
        return gcApproved;
    }

    public void setGcApproved(boolean gcApproved) {
        this.gcApproved = gcApproved;
    }
}
