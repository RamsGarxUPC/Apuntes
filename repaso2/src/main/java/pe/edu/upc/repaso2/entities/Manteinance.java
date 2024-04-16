package pe.edu.upc.repaso2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Manteinance")
public class Manteinance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gcIdMaintenance;
    @Column(name = "gcDescription", nullable = false, length = 300)
    private String gcDescription;
    @Column(name = "gcAmount", nullable = false)
    private double gcAmount;
    @Column(name = "gcAmountWithIGV", nullable = false)
    private double gcAmountWithIGV;
    @Column(name = "gcEmissionDate", nullable = false)
    private LocalDate gcEmissionDate;
    @Column(name = "gcProgramDate", nullable = false)
    private LocalDate gcProgramDate;
    @Column(name = "gcExecutionEstatus", nullable = false)
    private boolean gcExecutionEstatus;
    @Column(name = "gcCampament", nullable = false, length = 50)
    private String gcCampament;

    @PrePersist
    public void prePersist(){
        gcEmissionDate=LocalDate.now();
        gcAmountWithIGV=gcAmount*118/100;
    }

    public Manteinance() {
    }

    public Manteinance(int gcIdMaintenance, String gcDescription, double gcAmount, double gcAmountWithIGV, LocalDate gcEmissionDate, LocalDate gcProgramDate, boolean gcExecutionEstatus, String gcCampament) {
        this.gcIdMaintenance = gcIdMaintenance;
        this.gcDescription = gcDescription;
        this.gcAmount = gcAmount;
        this.gcAmountWithIGV = gcAmountWithIGV;
        this.gcEmissionDate = gcEmissionDate;
        this.gcProgramDate = gcProgramDate;
        this.gcExecutionEstatus = gcExecutionEstatus;
        this.gcCampament = gcCampament;
    }

    public int getGcIdMaintenance() {
        return gcIdMaintenance;
    }

    public void setGcIdMaintenance(int gcIdMaintenance) {
        this.gcIdMaintenance = gcIdMaintenance;
    }

    public String getGcDescription() {
        return gcDescription;
    }

    public void setGcDescription(String gcDescription) {
        this.gcDescription = gcDescription;
    }

    public double getGcAmount() {
        return gcAmount;
    }

    public void setGcAmount(double gcAmount) {
        this.gcAmount = gcAmount;
    }

    public double getGcAmountWithIGV() {
        return gcAmountWithIGV;
    }

    public void setGcAmountWithIGV(double gcAmountWithIGV) {
        this.gcAmountWithIGV = gcAmountWithIGV;
    }

    public LocalDate getGcEmissionDate() {
        return gcEmissionDate;
    }

    public void setGcEmissionDate(LocalDate gcEmissionDate) {
        this.gcEmissionDate = gcEmissionDate;
    }

    public LocalDate getGcProgramDate() {
        return gcProgramDate;
    }

    public void setGcProgramDate(LocalDate gcProgramDate) {
        this.gcProgramDate = gcProgramDate;
    }

    public boolean isGcExecutionEstatus() {
        return gcExecutionEstatus;
    }

    public void setGcExecutionEstatus(boolean gcExecutionEstatus) {
        this.gcExecutionEstatus = gcExecutionEstatus;
    }

    public String getGcCampament() {
        return gcCampament;
    }

    public void setGcCampament(String gcCampament) {
        this.gcCampament = gcCampament;
    }
}
