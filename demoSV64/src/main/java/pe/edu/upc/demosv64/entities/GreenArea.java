package pe.edu.upc.demosv64.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "GreenArea")
public class GreenArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGreenArea;
    @Column(name = "nameGreenArea", nullable = false, length = 35)
    private String nameGreenArea;
    @Column(name = "extensioGreenArea", nullable = false)
    private float extensioGreenArea;
    @Column(name = "dateCreationGreenArea", nullable = false)
    private LocalDate dateCreationGreenArea;
    @Column(name = "ubicationGreenArea", nullable = false, length = 55)
    private String ubicationGreenArea;

    public GreenArea() {
    }

    public GreenArea(int idGreenArea, String nameGreenArea, float extensioGreenArea, LocalDate dateCreationGreenArea, String ubicationGreenArea) {
        this.idGreenArea = idGreenArea;
        this.nameGreenArea = nameGreenArea;
        this.extensioGreenArea = extensioGreenArea;
        this.dateCreationGreenArea = dateCreationGreenArea;
        this.ubicationGreenArea = ubicationGreenArea;
    }

    public int getIdGreenArea() {
        return idGreenArea;
    }

    public void setIdGreenArea(int idGreenArea) {
        this.idGreenArea = idGreenArea;
    }

    public String getNameGreenArea() {
        return nameGreenArea;
    }

    public void setNameGreenArea(String nameGreenArea) {
        this.nameGreenArea = nameGreenArea;
    }

    public float getExtensioGreenArea() {
        return extensioGreenArea;
    }

    public void setExtensioGreenArea(float extensioGreenArea) {
        this.extensioGreenArea = extensioGreenArea;
    }

    public LocalDate getDateCreationGreenArea() {
        return dateCreationGreenArea;
    }

    public void setDateCreationGreenArea(LocalDate dateCreationGreenArea) {
        this.dateCreationGreenArea = dateCreationGreenArea;
    }

    public String getUbicationGreenArea() {
        return ubicationGreenArea;
    }

    public void setUbicationGreenArea(String ubicationGreenArea) {
        this.ubicationGreenArea = ubicationGreenArea;
    }
}
