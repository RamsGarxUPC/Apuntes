package pe.edu.upc.demosv64.dtos;

import pe.edu.upc.demosv64.entities.GreenArea;

import java.time.LocalDate;

public class MaintenanceDTO {
    private int idMaintenance;
    private String descriptionMaintenance;
    private LocalDate dateMaintenance;
    private String responsibleMaintenance;
    private double amountMaintenance;
    private GreenArea greenArea;

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getDescriptionMaintenance() {
        return descriptionMaintenance;
    }

    public void setDescriptionMaintenance(String descriptionMaintenance) {
        this.descriptionMaintenance = descriptionMaintenance;
    }

    public LocalDate getDateMaintenance() {
        return dateMaintenance;
    }

    public void setDateMaintenance(LocalDate dateMaintenance) {
        this.dateMaintenance = dateMaintenance;
    }

    public String getResponsibleMaintenance() {
        return responsibleMaintenance;
    }

    public void setResponsibleMaintenance(String responsibleMaintenance) {
        this.responsibleMaintenance = responsibleMaintenance;
    }

    public double getAmountMaintenance() {
        return amountMaintenance;
    }

    public void setAmountMaintenance(double amountMaintenance) {
        this.amountMaintenance = amountMaintenance;
    }

    public GreenArea getGreenArea() {
        return greenArea;
    }

    public void setGreenArea(GreenArea greenArea) {
        this.greenArea = greenArea;
    }
}
