package pe.edu.upc.repaso3.servicesinterfaces;

import pe.edu.upc.repaso3.dtos.StudentDTO;
import pe.edu.upc.repaso3.entities.Student;

import java.util.List;

public interface IStudentService {
    public void insert(Student st);
    public List<Student> list();
    public boolean studentApprovedByDNI(String dni);
    public void delete(int id);
    public void Update(int id, Student st);
}
