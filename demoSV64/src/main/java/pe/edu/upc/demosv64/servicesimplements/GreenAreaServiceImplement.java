package pe.edu.upc.demosv64.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demosv64.entities.GreenArea;
import pe.edu.upc.demosv64.repositories.IGreenAreaRepository;
import pe.edu.upc.demosv64.servicesinterfaces.IGreenAreaService;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class GreenAreaServiceImplement implements IGreenAreaService {
    @Autowired
    private IGreenAreaRepository gaR;
    @Override
    public void insert(GreenArea ga) {
        gaR.save(ga);
    }

    @Override
    public List<GreenArea> list() {
        return gaR.findAll();
    }

    @Override
    public void delete(int id) {
        gaR.deleteById(id);
    }

    @Override
    public GreenArea listId(int id) {
        return gaR.findById(id).orElse(new GreenArea());
    }

    @Override
    public List<GreenArea> findByDateCreationGreenArea(LocalDate fecha) {
        return gaR.findByDateCreationGreenArea(fecha);
    }

    @Override
    public void Actualizar(Integer id, GreenArea greenArea) {
        GreenArea encontrado = gaR.findById(id).orElseThrow();
        encontrado.setNameGreenArea(greenArea.getNameGreenArea());
        encontrado.setExtensioGreenArea(greenArea.getExtensioGreenArea());
        encontrado.setDateCreationGreenArea(greenArea.getDateCreationGreenArea());
        encontrado.setUbicationGreenArea(greenArea.getUbicationGreenArea());
        gaR.save(encontrado);
    }


}
