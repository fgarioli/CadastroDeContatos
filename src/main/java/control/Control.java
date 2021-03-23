/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.CidadeDao;
import dao.CidadeHibernateDao;
import dao.ConfDao;
import dao.ConfTextFileDao;
import dao.ContatoDao;
import dao.ContatoHibernateDao;
import dao.FabricaDao;
import dao.UsuarioDao;
import dao.UsuarioHibernateDao;
import domain.Cidade;
import domain.Contato;
import domain.Usuario;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Newcolor
 */
public class Control {
    private static Session session;
    private static Usuario usuario;
    private static boolean serverMode;

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        Control.session = session;
    }

    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        Control.usuario = usuario;
    }   

    public static boolean getServerMode() {
        return serverMode;
    }

    public static void setServerMode(boolean mode) {
        Control.serverMode = mode;
    }
    
    public static boolean inserirContato(Contato contato) {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.inserirContato(contato);
    }

    
    public static boolean alterarContato(Contato contato) {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.alterarContato(contato);
    }

    
    public static boolean removerContato(Contato contato) {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.removerContato(contato);
    }

    
    public static Contato selecionarContato(Contato contato) {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.selecionarContato(contato);
    }

    
    public static List<Contato> selecionarTodosContatos() {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.selecionarTodosContatos();
    }

    
    public static List<Contato> selecionarTodosContatosPorCodigoNomeTelefone(Contato contato) {
        ContatoDao contatoDao = FabricaDao.getContatoDao("HBD");
        ((ContatoHibernateDao) contatoDao).setSession(session);
        return contatoDao.selecionarTodosContatosPorCodigoNomeTelefone(contato);
    }
    
    public static boolean inserirCidade(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.inserirCidade(cidade);
    }
    
    public static boolean alterarCidade(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.alterarCidade(cidade);
    }
    
    public static boolean removerCidade(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.removerCidade(cidade);
    }

    public static List<Cidade> selecionarTodasCidades() {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.selecionarTodasCidades();
    }
    
    public static Cidade selecionarCidade(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.selecionarCidade(cidade);
    }
    
    public static List<Cidade> selecionarTodasCidadesPorCodigoNome(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.selecionarTodasCidadesPorCodigoNome(cidade);
    }
    
    public static List<Cidade> selecionarTodasCidadesPorUF(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.selecionarTodasCidadesPorUF(cidade);
    }
    
    public static List<Cidade> selecionarTodosCidadesUF(Cidade cidade) {
        CidadeDao cidadeDao = FabricaDao.getCidadeDao("HBD");
        ((CidadeHibernateDao) cidadeDao).setSession(session);
        return cidadeDao.selecionarTodasCidades();
    }
    
    public static boolean inserirUsuario(Usuario usuario) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        usuarioDao.inserirUsuario(usuario);
        return true;
    }
    
    public static boolean alterarUsuario(Usuario usuario) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        usuarioDao.alterarUsuario(usuario);
        return true;
    }

    public static boolean removerUsuario(Usuario usuario) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        usuarioDao.removerUsuario(usuario);
        return true;
    }
    
    public static Usuario selecionarUsuario(Usuario usuario) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);

        return usuarioDao.selecionarUsuario(usuario);
    }
    
    public static List<Usuario> selecionarTodosUsuarios() {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        return usuarioDao.selecionarTodosUsuarios();
    }
    
    public static List<Usuario> selecionarTodosUsuariosPorCodigoNome(Usuario usuario) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        return usuarioDao.selecionarTodosUsuariosPorCodigoNome(usuario);
    }
    
    public static Usuario logarSistema(String login, String senha) {
        UsuarioDao usuarioDao = FabricaDao.getUsuarioDao("HBD");
        ((UsuarioHibernateDao) usuarioDao).setSession(session);
        return usuarioDao.logarSistema(login, senha);
    }
    
    public static boolean alterarIP(String ip) {
        ConfDao confDao = FabricaDao.getConfDao("TXT");
        ((ConfTextFileDao) confDao).alterarIP(ip);
        return true;
    }
    
    public static String selecionarIP() {
        ConfDao confDao = FabricaDao.getConfDao("TXT");
        return ((ConfTextFileDao) confDao).selecionarIP();
    }
}
