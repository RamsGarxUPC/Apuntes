package pe.edu.upc.repaso2.servicesinterfaces;

import pe.edu.upc.repaso2.entities.Manteinance;

import java.time.LocalDate;
import java.util.List;

public interface IMaintenanceService {
    public void insert(Manteinance manteinance);
    public List<Manteinance> list();
    public List<Manteinance> findBygcProgramDate(LocalDate date);
    public int quantityOrdersByCampament(String campament);
}
