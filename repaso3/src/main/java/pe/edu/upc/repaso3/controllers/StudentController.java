package pe.edu.upc.repaso3.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.repaso3.dtos.StudentDTO;
import pe.edu.upc.repaso3.entities.Student;
import pe.edu.upc.repaso3.servicesinterfaces.IStudentService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/GarciaCardenas")
public class StudentController {
    @Autowired
    private IStudentService stR;

    @PostMapping
    public void insertar(@RequestBody StudentDTO studentDTO){
        ModelMapper m=new ModelMapper();
        Student s=m.map(studentDTO, Student.class);
        stR.insert(s);
    }

    @GetMapping
    public List<StudentDTO> listar(){
        return stR.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, StudentDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/alumnoAprobadoPorDNI")
    public List<Boolean> alumnoAprobadoPorDNI(@RequestParam String dni){
        boolean studentApproved = stR.studentApprovedByDNI(dni);
        return List.of(studentApproved);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        stR.delete(id);
    }

    @PutMapping("/{id}")
    public void Actualizar (@PathVariable int id, @RequestBody StudentDTO studentDTO){
        ModelMapper m=new ModelMapper();
        Student s=m.map(studentDTO,Student.class);
        stR.Update(id,s);
    }

}
