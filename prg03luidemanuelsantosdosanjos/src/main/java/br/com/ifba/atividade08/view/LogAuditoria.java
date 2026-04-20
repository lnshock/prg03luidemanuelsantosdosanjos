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
public class LogAuditoria {//Criando atributos de classe
    private long id;
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;
 //Metodo construtor   
 public LogAuditoria (long nId, Usuario nUsuario, String nAcao, String nIp, LocalDateTime nDataHora){
     this.id = nId;
     this.usuario = nUsuario;
     this.acao = nAcao;
     this.ip = nIp;
     this.dataHora = nDataHora;
 } 
 
//Metodos setters e getters    
   public void setId (long novoID){
       this.id = novoID;
   }
   public long getId (){
       return this.id;
   }    
   public void setUsuario (Usuario novoUsuario){
       this.usuario = novoUsuario;
   }
   public Usuario getUsuario (){
       return usuario;
   }
     public void setDataHora (LocalDateTime novoDataHora){
       this.dataHora = novoDataHora;
   }
   public LocalDateTime getDataHora (){
       return this.dataHora;
   }
   public void setAcao (String novaAcao){
       this.acao = novaAcao;
   }
   public String getAcao(){
       return acao;
   }
   public void setIp (String novoIp){
       this.ip = novoIp;
   }
   public String getIp (){
       return ip;
   }

    @Override
    public String toString() {
        return "LogAuditoria{" + "id=" + id + ", usuario=" + usuario + ", acao=" + acao + ", dataHora=" + dataHora + ", ip=" + ip + '}';
    }
   
}
