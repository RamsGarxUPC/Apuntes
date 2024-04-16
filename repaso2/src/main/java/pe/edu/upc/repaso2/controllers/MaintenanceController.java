package pe.edu.upc.repaso2.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.repaso2.dtos.MaintenanceDTO;
import pe.edu.upc.repaso2.entities.Manteinance;
import pe.edu.upc.repaso2.servicesinterfaces.IMaintenanceService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/GarciaCardenas")
public class MaintenanceController {
    @Autowired
    private IMaintenanceService mS;

    @PostMapping
    public void insertar(@RequestBody MaintenanceDTO maintenanceDTO){
        ModelMapper m=new ModelMapper();
        Manteinance mn=m.map(maintenanceDTO, Manteinance.class);
        mS.insert(mn);
    }

    @GetMapping
    public List<MaintenanceDTO> listar(){
        return mS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/buscarPorFechaProgramada")
    public List<MaintenanceDTO> buscarPorFechaProgramada(@RequestParam  LocalDate date){
        return mS.findBygcProgramDate(date).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidadOrdenesPorCampamento")
    public List<Integer> cantidadOrdenesPorCampamento(@RequestParam String campamento) {
        int quantityOrders = mS.quantityOrdersByCampament(campamento);
        return List.of(quantityOrders);
    }
}
