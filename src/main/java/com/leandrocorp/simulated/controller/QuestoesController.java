package com.leandrocorp.simulated.controller;

import com.leandrocorp.simulated.domain.Questoes;
import com.leandrocorp.simulated.service.QuestoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/provas")
public class QuestoesController {

    @Autowired
    private QuestoesService questoesService;

    @RequestMapping(value="/nova_questao", method= RequestMethod.POST)
    public ResponseEntity<Questoes> addQuestao(@RequestBody Questoes questoes){
        return ResponseEntity.ok().body(questoesService.salvar(questoes));
    }

}
