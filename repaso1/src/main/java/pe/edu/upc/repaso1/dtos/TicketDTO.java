package pe.edu.upc.repaso1.dtos;

import java.time.LocalDate;

public class TicketDTO {
    private int gcidTicket;

    private String gcGrandstand;

    private int gcQuantity;

    private double gcPrice;

    private LocalDate gcMatchDate;

    private LocalDate gcEmissionDate;

    private String gcStadium;

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
