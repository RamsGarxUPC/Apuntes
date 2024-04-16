package pe.edu.upc.demosv64.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Maintenance")
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMaintenance;
    @Column(name = "descriptionMaintenance",nullable = false, length = 300)
    private String descriptionMaintenance;
    @Column(name = "dateMaintenance",nullable = false)
    private LocalDate dateMaintenance;
    @Column(name = "responsibleMaintenance",nullable = false, length = 45)
    private  String responsibleMaintenance;
    @Column(name = "amountMaintenance", nullable = false)
    private  double amountMaintenance;
    @ManyToOne
    @JoinColumn(name = "greenareaId")
    private  GreenArea greenArea;

    public Maintenance() {
    }

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

    public Maintenance(int idMaintenance, String descriptionMaintenance, LocalDate dateMaintenance, String responsibleMaintenance, double amountMaintenance, GreenArea greenArea) {
        this.idMaintenance = idMaintenance;
        this.descriptionMaintenance = descriptionMaintenance;
        this.dateMaintenance = dateMaintenance;
        this.responsibleMaintenance = responsibleMaintenance;
        this.amountMaintenance = amountMaintenance;
        this.greenArea = greenArea;
    }
}
