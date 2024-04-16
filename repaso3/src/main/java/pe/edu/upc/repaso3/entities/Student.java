package pe.edu.upc.repaso3.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "/Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gcIdStudent;
    @Column(name = "gcDNI", nullable = false, length = 8)
    private String gcDNI;
    @Column(name = "gcName", nullable = false, length = 30)
    private String gcName;
    @Column(name = "gcLastName", nullable = false, length = 35)
    private String gcLastName;
    @Column(name = "gcEV1", nullable = false)
    private double gcEV1;
    @Column(name = "gcEV2", nullable = false)
    private double gcEV2;
    @Column(name = "gcNF", nullable = false)
    private double gcNF;
    @Column(name = "gcApproved", nullable = false)
    private boolean gcApproved;

    @PrePersist
    public void prePersist(){
        gcNF=(gcEV1*0.4) + (gcEV2*0.6);
        if (gcNF > 12.0) {
            gcApproved = true;
        } else {
            gcApproved = false;
        }
    }

    public Student() {
    }
    public Student(int gcIdStudent, String gcDNI, String gcName, String gcLastName, double gcEV1, double gcEV2, double gcNF, boolean gcApproved) {
        this.gcIdStudent = gcIdStudent;
        this.gcDNI = gcDNI;
        this.gcName = gcName;
        this.gcLastName = gcLastName;
        this.gcEV1 = gcEV1;
        this.gcEV2 = gcEV2;
        this.gcNF = gcNF;
        this.gcApproved = gcApproved;
    }

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
