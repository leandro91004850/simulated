package com.leandrocorp.simulated.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Component
@Entity
@Table(name = "software", schema = "public")
public class Questoes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questaoId;

    @Column(length = 65535, columnDefinition = "text")
    private String titulo;

    private String tema;
    private String materia;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String optionE;
    private int resposta;
    private int escolha;
    private String link;

    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDate dataCriacao = LocalDate.now();

    public Questoes() {
        super();
    }

    public Questoes(int questaoId, String titulo, String tema, String optionA, String optionB, String optionC,
                    String optionD,
                    String optionE, int resposta, int escolha, String link, String materia) {
        super();
        this.questaoId = questaoId;
        this.titulo = titulo;
        this.tema = tema;
        this.materia = materia;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.resposta = resposta;
        this.escolha = escolha;
        this.link = link;
    }

    public int getQuestaoId() {
        return questaoId;
    }

    public void setQuestaoId(int questaoId) {
        this.questaoId = questaoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String opticoD) {
        this.optionD = opticoD;
    }

    public String getOptionE() {
        return optionE;
    }

    public void setOptionE(String optionE) {
        this.optionE = optionE;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Questoes [questaoId=" + questaoId + ", titulo=" + titulo+ ", tema=" + tema  + ", optionA=" + optionA +
                ", optionB=" + optionB + ", optionC=" + optionC +  ", optionD=" + optionD +", optionE=" +
                optionE  + ", resposta=" + resposta + ", escolha=" + escolha +
                ", link=" + link + "]";
    }

}