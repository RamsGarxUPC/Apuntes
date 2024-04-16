package pe.edu.upc.demosv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosv64.entities.GreenArea;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IGreenAreaRepository extends JpaRepository<GreenArea,Integer> {
    public List<GreenArea> findByDateCreationGreenArea(LocalDate fecha);

}
