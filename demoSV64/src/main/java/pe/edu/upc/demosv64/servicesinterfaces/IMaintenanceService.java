package pe.edu.upc.demosv64.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.demosv64.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    public void insert(Maintenance maintenance);
    public List<Maintenance> list();
    public List<String[]> quantityMaintenanceByGreenArea();
    public List<String[]> amountMaintenanceByGreenArea();
    public List<Maintenance> maintenanceByGreenArea(String  d);

}
