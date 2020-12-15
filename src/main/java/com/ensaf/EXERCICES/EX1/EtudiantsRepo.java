package com.ensaf.EXERCICES.EX1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantsRepo extends JpaRepository<Etudiant,Long> {
    public Etudiant findByNom(String name);
}
