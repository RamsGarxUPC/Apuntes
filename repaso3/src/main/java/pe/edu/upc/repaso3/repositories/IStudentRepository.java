package pe.edu.upc.repaso3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.repaso3.entities.Student;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT s.gcApproved FROM Student s WHERE s.gcDNI = :dni")
    boolean studentApprovedByDNI(@Param("dni") String dni);
}
