package org.treetech.exemple.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.treetech.exemple.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
