/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade08.view;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LUID1.7
 */ 
public class Main {
   public static void main(String[] args) {
 
        //Criando perfis de usuário com permissões
        List<String> permissoesAdmin = new ArrayList<>();
        permissoesAdmin.add("CRIAR USUARIO");
        permissoesAdmin.add("EDITAR USUARIO");
        permissoesAdmin.add("DELETAR USUARIO");
        List<String> permissoesComum = new ArrayList<>();
        permissoesComum.add("VISUALIZAR");
        permissoesComum.add("EDITAR PROPRIO PERFIL");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permissoesAdmin);
        PerfilUsuario perfilComum = new PerfilUsuario(2L, "Usuario Comum", permissoesComum);
        System.out.println("Perfis criados");
        System.out.println(perfilAdmin);
        System.out.println(perfilComum);
    
        //Criando usuários e associando a perfis
        Usuario usuario1 = new Usuario(1L,perfilAdmin,"joao.admin","joao@email.com","senha123",LocalDateTime.of(2026, 4, 18, 10, 30), true  );
        Usuario usuario2 = new Usuario(2L,perfilComum,"maria.silva","maria@email.com","senha456",LocalDateTime.of(2026, 4, 17, 14, 0),true );
        System.out.println("Usuarios criados");
        System.out.println(usuario1);
        System.out.println(usuario2);

        //Criando sessões para os usuários
        Sessao sessao1 = new Sessao(1L, usuario1, "token-abc-123-admin");
        Sessao sessao2 = new Sessao(2L, usuario2, "token-xyz-456-maria");
 
        System.out.println("ESSÕES CRIADAS");
        System.out.println(sessao1);
        System.out.println(sessao2);
        //Criando logs de auditoria para os usuários
        LogAuditoria log1 = new LogAuditoria(1L,usuario1,"LOGIN", "192.168.0.1", LocalDateTime.of(2026, 4, 19, 8, 0) );
        LogAuditoria log2 = new LogAuditoria( 2L,usuario2, "ALTERACAO DE SENHA", "192.168.2",LocalDateTime.of(2026, 4, 19, 9, 15));
        LogAuditoria log3 = new LogAuditoria( 3L, usuario1, "TENTATIVA DE LOGIN",  "192.168.1",LocalDateTime.of(2026, 4, 19, 10, 45));

        System.out.println("LOGS DE AUDITORIA");
        System.out.println(log1);
        System.out.println(log2);
        System.out.println(log3);
       
        // Atualizando o ultimo login do usuario1
        usuario1.setUltimoLogin(LocalDateTime.now());
        System.out.println("Ultimo login atualizado de " + usuario1.getNomeUsuario() + ": " + usuario1.getUltimoLogin());
 
        // Desativando usuario2
        usuario2.setAtivo(false);
        System.out.println("Status ativo de " + usuario2.getNomeUsuario() + ": " + usuario2.getAtivo());
 
        // Alterando token da sessao1
        sessao1.setToken("novo token admin 123");
        System.out.println("Novo token da sessao de " + sessao1.getUsuario().getNomeUsuario() + ": " + sessao1.getToken());
 
        // Alterando acao do log2
        log2.setAcao("LOGIN");
        System.out.println("Acao atualizada no log " + log2.getId() + ": " + log2.getAcao());
    }
}  

