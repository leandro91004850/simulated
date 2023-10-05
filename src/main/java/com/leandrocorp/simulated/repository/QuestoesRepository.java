package com.leandrocorp.simulated.repository;

import com.leandrocorp.simulated.domain.Questoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestoesRepository extends JpaRepository<Questoes, Integer> {

    @Query(value = "Select * from software where tema = ?1", nativeQuery = true)
    List<Questoes> conteudo(String conteudo);


}
