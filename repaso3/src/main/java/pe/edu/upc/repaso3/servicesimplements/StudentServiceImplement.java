package pe.edu.upc.repaso3.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.repaso3.dtos.StudentDTO;
import pe.edu.upc.repaso3.entities.Student;
import pe.edu.upc.repaso3.repositories.IStudentRepository;
import pe.edu.upc.repaso3.servicesinterfaces.IStudentService;

import java.util.List;

@Service
public class StudentServiceImplement implements IStudentService {
    @Autowired
    private IStudentRepository sR;

    @Override
    public void insert(Student st) {
        sR.save(st);
    }

    @Override
    public List<Student> list() {
        return sR.findAll();
    }

    @Override
    public boolean studentApprovedByDNI(String dni) {
        return sR.studentApprovedByDNI(dni);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public void Update(int id, Student newSt) {
        Student studentfounded = sR.findById(id).orElseThrow();
        studentfounded.setGcDNI(newSt.getGcDNI());
        studentfounded.setGcName(newSt.getGcName());
        studentfounded.setGcLastName(newSt.getGcLastName());
        studentfounded.setGcEV1(newSt.getGcEV1());
        studentfounded.setGcEV2(newSt.getGcEV2());
        studentfounded.setGcNF(newSt.getGcNF());
        studentfounded.setGcApproved(newSt.isGcApproved());
        sR.save(studentfounded);
    }

}
