package pe.edu.upc.demosv64.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosv64.dtos.MaintenanceByGreenareaDTO;
import pe.edu.upc.demosv64.dtos.MaintenanceDTO;
import pe.edu.upc.demosv64.dtos.QuantityByGreenareaDTO;
import pe.edu.upc.demosv64.entities.Maintenance;
import pe.edu.upc.demosv64.servicesinterfaces.IMaintenanceService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mantenimientos")
public class MaintenanceController {
    @Autowired
    private IMaintenanceService mS;

    @PostMapping
    public void insetar(@RequestBody MaintenanceDTO maintenanceDTO){
        ModelMapper m=new ModelMapper();
        Maintenance ma=m.map(maintenanceDTO, Maintenance.class);
        mS.insert(ma);
    }

    @GetMapping
    public List<MaintenanceDTO> listar(){
        return mS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidades")
    public List<MaintenanceByGreenareaDTO> cantidad(){
        List<String[]> filaLista=mS.quantityMaintenanceByGreenArea();
        List<MaintenanceByGreenareaDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            MaintenanceByGreenareaDTO dto=new MaintenanceByGreenareaDTO();
            dto.setNameGreenarea(columna[0]);
            dto.setQuantityMaintenance(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/montoPorAreaverdes")
    public List<QuantityByGreenareaDTO> monto(){
        List<String[]> filaLista= mS.quantityByArea();
        List<QuantityByGreenareaDTO> dtoLista=new ArrayList<>();
        for(String [] columna:filaLista){
            QuantityByGreenareaDTO dto=new QuantityByGreenareaDTO();
            dto.setNameGreenarea(columna[0]);
            dto.setQuantityByGreenArea(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/listamatenimientos")
    public List<MaintenanceDTO> listarMantenimientos(@RequestParam String nombre){
        return mS.maintenanceByGreenArea(nombre).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,MaintenanceDTO.class);
        }).collect(Collectors.toList());
    }
}
