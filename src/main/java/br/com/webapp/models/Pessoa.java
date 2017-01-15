package br.com.webapp.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by odilon on 14/01/17.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Pessoa implements Serializable{

    private String nome;
    private SituacaoPessoa situacao = SituacaoPessoa.ATIVO;
    private Date dataCadastro = new Date();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SituacaoPessoa getSituacao() {
        return situacao;
    }

    public void ativar(){
        this.situacao = SituacaoPessoa.ATIVO;
    }

    public void desativar(){
        this.situacao = SituacaoPessoa.INATIVO;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
