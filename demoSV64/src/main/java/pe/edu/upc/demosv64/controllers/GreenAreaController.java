package pe.edu.upc.demosv64.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demosv64.dtos.GreenAreaDTO;
import pe.edu.upc.demosv64.entities.GreenArea;
import pe.edu.upc.demosv64.servicesinterfaces.IGreenAreaService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/areasverdes")
public class GreenAreaController {
    @Autowired
    private IGreenAreaService iG;

    @PostMapping
    public void insertar(@RequestBody GreenAreaDTO greenAreaDTO){
        ModelMapper m=new ModelMapper();
        GreenArea g=m.map(greenAreaDTO,GreenArea.class);
        iG.insert(g);
    }
    @GetMapping
    public List<GreenAreaDTO> listar(){
        return iG.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,GreenAreaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iG.delete(id);
    }
    @GetMapping("/{id}")
    public GreenAreaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        GreenAreaDTO dto=m.map(iG.listId(id),GreenAreaDTO.class);
        return dto;
    }

    @GetMapping("/buscar")
    public List<GreenAreaDTO> buscarFecha(@RequestParam  LocalDate fecha){
        return iG.findByDateCreationGreenArea(fecha).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,GreenAreaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("/{id}")
    public void Actualizar (@PathVariable Integer id, @RequestBody GreenAreaDTO greenAreaDTO){
        ModelMapper m=new ModelMapper();
        GreenArea g=m.map(greenAreaDTO,GreenArea.class);
        iG.Actualizar(id,g);
    }
}














