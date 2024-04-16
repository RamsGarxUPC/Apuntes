package pe.edu.upc.repaso1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.repaso1.dtos.TicketDTO;
import pe.edu.upc.repaso1.entities.Ticket;
import pe.edu.upc.repaso1.servicesinterfaces.ITicketService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/GarciaCardenas")
public class TicketController {
    @Autowired
    private ITicketService iT;

    @PostMapping
    public void insertar(@RequestBody TicketDTO ticketDTO){
        ModelMapper m=new ModelMapper();
        Ticket t=m.map(ticketDTO, Ticket.class);
        iT.insert(t);
    }

    @GetMapping
    public List<TicketDTO> listar(){
        return iT.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, TicketDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidadTicketsPorEstadio")
    public List<Integer> cantidadTicketsPorEstadio(@RequestParam String estadio){
        int quantityTickets = iT.quantityTicketByStadium(estadio);
        return List.of(quantityTickets);
    }

    @GetMapping("/montoPreciosPorFecha")
    public List<Double> montoPreciosPorFecha(@RequestParam LocalDate fecha){
        double amountPrices = iT.amountPricesByMatchDate(fecha);
        return List.of(amountPrices);
    }
}
