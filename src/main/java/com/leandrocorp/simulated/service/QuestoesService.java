package com.leandrocorp.simulated.service;

import com.leandrocorp.simulated.domain.Questoes;
import com.leandrocorp.simulated.repository.QuestoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestoesService {

    @Autowired
    QuestoesRepository questoesRepository;

    public Questoes salvar(Questoes questoes){
        questoes.setEscolha(-1);
        return questoesRepository.save(questoes);
    }

}
