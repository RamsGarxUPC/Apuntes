package pe.edu.upc.repaso1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.repaso1.entities.Ticket;
import pe.edu.upc.repaso1.repositories.ITicketRepository;
import pe.edu.upc.repaso1.servicesinterfaces.ITicketService;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketServiceImplement implements ITicketService {
    @Autowired
    private ITicketRepository tiR;


    @Override
    public void insert(Ticket ti) {
        tiR.save(ti);
    }

    @Override
    public List<Ticket> list() {
        return tiR.findAll();
    }

    @Override
    public int quantityTicketByStadium(String estadio) {
        return tiR.quantityTicketByStadium(estadio);
    }

    @Override
    public double amountPricesByMatchDate(LocalDate fecha) {
        return tiR.amountPricesByMatchDate(fecha);
    }


}
