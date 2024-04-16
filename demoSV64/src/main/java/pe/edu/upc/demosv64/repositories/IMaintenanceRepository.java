package pe.edu.upc.demosv64.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demosv64.entities.Maintenance;

import java.util.List;

@Repository
public interface IMaintenanceRepository extends JpaRepository<Maintenance,Integer> {
    @Query(value = "select ga.name_green_area as AreaVerde, count(*) as Cantidad \n" +
            "from green_area ga inner join Maintenance m \n" +
            "on ga.id_green_area=m.greenarea_id \n" +
            "group by ga.name_green_area ",nativeQuery = true)
    public List<String[]> quantityMaintenanceByGreenArea();

    @Query(value = "select ga.name_green_area as AreaVerde, sum(m.amount_maintenance) as Monto \n" +
            "from green_area ga inner join Maintenance m  \n" +
            "on ga.id_green_area=m.greenarea_id \n" +
            "group by ga.name_green_area ",nativeQuery = true)
    public List<String[]> amountMaintenanceByGreenArea();

    @Query(" from Maintenance  m where m.greenArea.nameGreenArea=:d")
    public List<Maintenance> maintenanceByGreenArea(@Param("d") String  d);

}
