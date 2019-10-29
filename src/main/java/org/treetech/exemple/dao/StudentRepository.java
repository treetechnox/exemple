package org.treetech.exemple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.treetech.exemple.entities.Departement;
import org.treetech.exemple.entities.Student;

import java.util.List;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>{

   /* @Query(nativeQuery = true, value = "select * from student inner join departement on student.departement_id = departement.id_dept where departement_id= :x")
    public List<Student> getSearchStudent(@Param("x") Long x);*/

    @RestResource(path = "/byname")
    public List<Student> findByNameContains(@Param("name") String nom);

    @RestResource(path = "/bydept")
    public List<Student> findByDepartement_DeptContains(@Param("dept") String dept);

    @RestResource(path = "/bydn")
    public List<Student> findByDepartement_DeptContainsAndAndNameContains(@Param("dept") String dept,@Param("name") String name);


}
