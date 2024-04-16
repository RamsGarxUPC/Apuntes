package pe.edu.upc.demosv64.servicesinterfaces;

import pe.edu.upc.demosv64.entities.GreenArea;

import java.time.LocalDate;
import java.util.List;

public interface IGreenAreaService {

    public void insert(GreenArea ga);
    public List<GreenArea> list();
    public void delete(int id);
    public GreenArea listId(int id);
    public List<GreenArea> findByDateCreationGreenArea(LocalDate fecha);

}







