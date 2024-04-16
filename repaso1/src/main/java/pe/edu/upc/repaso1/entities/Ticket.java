package pe.edu.upc.repaso1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gcidTicket;

    @Column(name = "gcGrandstand", nullable = false, length = 25)
    private String gcGrandstand;

    @Column(name = "gcQuantity", nullable = false)
    private int gcQuantity;
    @Column(name = "gcPrice", nullable = false)
    private double gcPrice;

    @Column(name = "gcMatchDate", nullable = false)
    private LocalDate gcMatchDate;

    @Column(name = "gcEmissionDate", nullable = false)
    private LocalDate gcEmissionDate;

    @Column(name = "gcStadium", nullable = false, length = 50)
    private String gcStadium;

    @PrePersist
    public void prePersist() {
        gcEmissionDate = LocalDate.now();
    }

    public Ticket() {
    }

    public Ticket(int gcidTicket, String gcGrandstand, int gcQuantity, double gcPrice, LocalDate gcMatchDate, LocalDate gcEmissionDate, String gcStadium) {
        this.gcidTicket = gcidTicket;
        this.gcGrandstand = gcGrandstand;
        this.gcQuantity = gcQuantity;
        this.gcPrice = gcPrice;
        this.gcMatchDate = gcMatchDate;
        this.gcEmissionDate = gcEmissionDate;
        this.gcStadium = gcStadium;
    }

    public int getGcidTicket() {
        return gcidTicket;
    }

    public void setGcidTicket(int gcidTicket) {
        this.gcidTicket = gcidTicket;
    }

    public String getGcGrandstand() {
        return gcGrandstand;
    }

    public void setGcGrandstand(String gcGrandstand) {
        this.gcGrandstand = gcGrandstand;
    }

    public int getGcQuantity() {
        return gcQuantity;
    }

    public void setGcQuantity(int gcQuantity) {
        this.gcQuantity = gcQuantity;
    }

    public double getGcPrice() {
        return gcPrice;
    }

    public void setGcPrice(double gcPrice) {
        this.gcPrice = gcPrice;
    }

    public LocalDate getGcMatchDate() {
        return gcMatchDate;
    }

    public void setGcMatchDate(LocalDate gcMatchDate) {
        this.gcMatchDate = gcMatchDate;
    }

    public LocalDate getGcEmissionDate() {
        return gcEmissionDate;
    }

    public void setGcEmissionDate(LocalDate gcEmissionDate) {
        this.gcEmissionDate = gcEmissionDate;
    }

    public String getGcStadium() {
        return gcStadium;
    }

    public void setGcStadium(String gcStadium) {
        this.gcStadium = gcStadium;
    }
}
