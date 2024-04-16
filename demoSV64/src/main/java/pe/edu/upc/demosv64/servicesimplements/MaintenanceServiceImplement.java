package pe.edu.upc.demosv64.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosv64.entities.Maintenance;
import pe.edu.upc.demosv64.repositories.IMaintenanceRepository;
import pe.edu.upc.demosv64.servicesinterfaces.IMaintenanceService;

import java.util.List;
@Service
public class MaintenanceServiceImplement implements IMaintenanceService {
    @Autowired
    private IMaintenanceRepository mR;
    @Override
    public void insert(Maintenance maintenance) {
        mR.save(maintenance);
    }

    @Override
    public List<Maintenance> list() {
        return mR.findAll();
    }

    @Override
    public List<String[]> quantityMaintenanceByGreenArea() {
        return mR.quantityMaintenanceByGreenArea();
    }

    @Override
    public List<String[]> amountMaintenanceByGreenArea() {
        return mR.amountMaintenanceByGreenArea();
    }

    @Override
    public List<Maintenance> maintenanceByGreenArea(String d) {
        return mR.maintenanceByGreenArea(d);
    }
}
