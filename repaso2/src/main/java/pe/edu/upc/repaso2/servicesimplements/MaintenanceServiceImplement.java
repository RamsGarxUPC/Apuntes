package pe.edu.upc.repaso2.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.repaso2.entities.Manteinance;
import pe.edu.upc.repaso2.repositories.IManteinanceRepository;
import pe.edu.upc.repaso2.servicesinterfaces.IMaintenanceService;

import java.time.LocalDate;
import java.util.List;

@Service
public class MaintenanceServiceImplement implements IMaintenanceService {
    @Autowired
    private IManteinanceRepository miR;

    @Override
    public void insert(Manteinance manteinance) {
        miR.save(manteinance);
    }

    @Override
    public List<Manteinance> list() {
        return miR.findAll();
    }

    @Override
    public List<Manteinance> findBygcProgramDate(LocalDate date) {
        return miR.findBygcProgramDate(date);
    }

    @Override
    public int quantityOrdersByCampament(String campament) {
        return miR.quantityOrdersByCampament(campament);
    }


}
