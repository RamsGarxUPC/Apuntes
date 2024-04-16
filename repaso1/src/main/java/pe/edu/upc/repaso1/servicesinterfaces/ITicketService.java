package pe.edu.upc.repaso1.servicesinterfaces;

import pe.edu.upc.repaso1.entities.Ticket;

import java.time.LocalDate;
import java.util.List;

public interface ITicketService {
    public void insert(Ticket ti);

    public List<Ticket> list();

    public int quantityTicketByStadium(String estadio);

    public double amountPricesByMatchDate(LocalDate fecha);
}
