/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LUID1.7
 */
public class PerfilUsuario { //Criando atributos da classe
    private long id;
    private String descricao;
    private List <String> permissoes;
   //Metodo cosntrutor
  public PerfilUsuario(long nId, String nDescricao, List nPermissao){
      this.id = nId;
      this.descricao = nDescricao;
      this.permissoes = nPermissao;
  }
  //Metodos setters e getters
    public void setId (long novoId){
        this.id = novoId;
    }
    public long getId (){
        return id;
    }
    public void setDescricao (String novaDescricao){
        this.descricao = novaDescricao;
    }
    public String getDescricao (){
        return descricao;
    }
    public void setPermissao(List novaPermissao){
        this.permissoes = novaPermissao;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" + "id=" + id + ", descricao=" + descricao + ", permissoes=" + permissoes + '}';
    }
    
}
