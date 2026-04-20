/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;

/**
 *
 * @author LUID1.7
 */
public class Sessao {
    private long id;
    private Usuario usuario;
    private String token;
    //metodo construtor
   public  Sessao (long nId, Usuario nUsuario, String nToken) {
      this.id = nId;
      this.usuario = nUsuario;
      this.token = nToken;
   }  
   //Metodos setters e getters
   public void setId (long novoId){
       this.id = novoId;
   }
   public long getId (){
       return id;
   }
   public void setUsuario (Usuario novoUsuario){
       this.usuario = novoUsuario;
   }
   public Usuario getUsuario (){
       return usuario;
   }
   public void setToken (String novoToken){
       this.token = novoToken;
   }
   public String getToken (){
       return token;
   }

    @Override
    public String toString() {
        return "Sessao{" + "id=" + id + ", usuario=" + usuario + ", token=" + token + '}';
    }
   
    
}
