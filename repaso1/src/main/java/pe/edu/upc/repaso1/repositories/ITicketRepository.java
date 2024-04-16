package pe.edu.upc.repaso1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.repaso1.entities.Ticket;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ITicketRepository extends JpaRepository<Ticket,Integer> {
    @Query("SELECT SUM(ti.gcQuantity) FROM Ticket ti WHERE ti.gcStadium = :estadio")
    int quantityTicketByStadium(@Param("estadio") String estadio);

    @Query("SELECT SUM(ti.gcPrice) FROM Ticket ti WHERE ti.gcMatchDate = :fecha")
    double amountPricesByMatchDate(@Param("fecha") LocalDate fecha);
}
