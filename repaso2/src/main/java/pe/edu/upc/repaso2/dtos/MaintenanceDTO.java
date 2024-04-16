package pe.edu.upc.repaso2.dtos;

import java.time.LocalDate;

public class MaintenanceDTO {
    private int gcIdMaintenance;
    private String gcDescription;
    private double gcAmount;
    private double gcAmountWithIGV;
    private LocalDate gcEmissionDate;
    private LocalDate gcProgramDate;
    private boolean gcExecutionEstatus;
    private String gcCampament;

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

    public double getGcAmountWithIGV() {
        return gcAmountWithIGV;
    }

    public void setGcAmountWithIGV(double gcAmountWithIGV) {
        this.gcAmountWithIGV = gcAmountWithIGV;
    }
}
