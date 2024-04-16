package pe.edu.upc.repaso2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.repaso2.entities.Manteinance;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IManteinanceRepository extends JpaRepository<Manteinance, Integer> {
    public List<Manteinance> findBygcProgramDate(LocalDate date);
    @Query("SELECT count (ti.gcIdMaintenance) FROM Manteinance ti WHERE ti.gcCampament = :campamento")
    public int quantityOrdersByCampament(@Param("campamento") String campamento);
}
