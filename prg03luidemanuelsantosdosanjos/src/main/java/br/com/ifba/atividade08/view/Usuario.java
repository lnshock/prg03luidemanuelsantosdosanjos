/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.time.LocalDateTime;

/**
 *
 * @author LUID1.7
 */
public class Usuario {//Criando atributos da classe
    private long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private boolean ativo;
 //Metodo construtor   
 public Usuario (long nId, PerfilUsuario prfl, String nUsr, String emil, String snh, LocalDateTime ultLogin, boolean atv){
     this.id = nId;
     this.perfil = prfl;
     this.nomeUsuario = nUsr;
     this.email = emil;
     this.senha = snh;
     this.ultimoLogin = ultLogin;
     this.ativo = atv;
 } 
 //Metodos getters e setters
   public void setId (long novoID){
       this.id = novoID;
   }
   public long getId (){
       return this.id;
   }
   public void setPerfil (PerfilUsuario novoPerfil){
       this.perfil = novoPerfil;
   }
   public PerfilUsuario getPerfil (){
       return this.perfil;
   }
   public void setNomeUsuario(String novoNome){
       this.nomeUsuario = novoNome;
   }
   public String getNomeUsuario (){
       return this.nomeUsuario;
   }
   public void setEmail (String novoEmail){
       this.email = novoEmail;
   }
   public String getEmail (){
       return this.email;
   }
   public void setSenha (String novaSenha){
       this.senha = novaSenha;
   }
   public String getSenha (){
       return this.senha;
   }
   public void setUltimoLogin (LocalDateTime novoUltimoLogin){
       this.ultimoLogin = novoUltimoLogin;
   }
   public LocalDateTime getUltimoLogin (){
       return this.ultimoLogin;
   }
   public void setAtivo (boolean novoAtivo){
       this.ativo = novoAtivo;
   }
   public boolean getAtivo (){
       return this.ativo;
   }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", perfil=" + perfil + ", nomeUsuario=" + nomeUsuario + ", email=" + email + ", senha=" + senha + ", ultimoLogin=" + ultimoLogin + ", ativo=" + ativo + '}';
    }
    
}
