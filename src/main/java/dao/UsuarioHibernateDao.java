package dao;

import domain.Usuario;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.EC88FEC9-1D51-C9C5-57B6-7325A026E2E3]
// </editor-fold> 
public class UsuarioHibernateDao implements UsuarioDao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2803A246-AF02-07D1-666F-022B9F643F57]
    // </editor-fold> 
    private Session session;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0A0C6AE-8F07-3233-8E59-C85A8EA7C3A6]
    // </editor-fold> 
    public UsuarioHibernateDao() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C0927804-8F84-690E-9BBA-8100FAF5577D]
    // </editor-fold> 
    public Session getSession() {
        return session;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8DA344B6-F8C7-6846-4881-B2236C87BD07]
    // </editor-fold> 
    public void setSession(Session val) {
        this.session = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB62D826-6AE3-C7F6-1ADC-5278E7D90330]
    // </editor-fold> 
    @Override
    public boolean inserirUsuario(Usuario usuario) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(usuario);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B3C7E5F1-8E32-5E33-4252-C7E6DF11CE24]
    // </editor-fold> 
    @Override
    public boolean alterarUsuario(Usuario usuario) {
        Transaction tx = this.session.beginTransaction();
        this.session.flush();
        this.session.clear();
        this.session.update(usuario);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E8812E34-2F0E-DC9E-44FA-968E7E99E341]
    // </editor-fold> 
    @Override
    public boolean removerUsuario(Usuario usuario) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(usuario);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A060B403-611A-7B7C-607C-92EE2B726A83]
    // </editor-fold> 
    @Override
    public Usuario selecionarUsuario(Usuario usuario) {
        return (Usuario) session.load(Usuario.class, usuario.getCodUsuario());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.657557BC-5E2C-475F-43B2-3777A4AB32A3]
    // </editor-fold> 
    @Override
    public Usuario logarSistema(String login, String senha) {
        Usuario usuario = (Usuario) session.createCriteria(Usuario.class).add(Restrictions.eq("loginUsuario", login)).add(Restrictions.eq("senhaUsuario", senha)).uniqueResult();
        return usuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.20CFD611-20E1-8935-A103-E02C21212E22]
    // </editor-fold> 
    @Override
    public List<Usuario> selecionarTodosUsuariosPorCodigoNome(Usuario usuario) {
        if (usuario.getCodUsuario() == 0 && usuario.getNomeUsuario().length() == 0) {
            List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
            return usuarios;
        } else if (usuario.getNomeUsuario().length() == 0) {
            List<Usuario> usuarios = session.createCriteria(Usuario.class).add(Restrictions.eq("codUsuario", usuario.getCodUsuario())).list();
            return usuarios;
        } else if (usuario.getCodUsuario() == 0) {
            List<Usuario> usuarios = session.createCriteria(Usuario.class).add(Restrictions.like("nomeUsuario", usuario.getNomeUsuario(), MatchMode.ANYWHERE)).list();
            return usuarios;
        } else {
            List<Usuario> usuarios = session.createCriteria(Usuario.class).add(Restrictions.eq("codUsuario", usuario.getCodUsuario())).add(Restrictions.like("nomeUsuario", usuario.getNomeUsuario(), MatchMode.ANYWHERE)).list();
            return usuarios;
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E25B7137-6375-1C00-1CC9-988B077949ED]
    // </editor-fold> 
    @Override
    public List<Usuario> selecionarTodosUsuarios() {
        List<Usuario> usuarios = session.createCriteria(Usuario.class).list();
        return usuarios;
    }
}
