/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Contato;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Newcolor
 */
public class ContatoHibernateDao implements ContatoDao {

    private Session session;

    public ContatoHibernateDao() {
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean inserirContato(Contato contato) {
        Transaction tx = session.beginTransaction();
        session.save(contato);
        tx.commit();
        return true;
    }

    @Override
    public boolean alterarContato(Contato contato) {
        Transaction tx = session.beginTransaction();
        this.session.flush();
        this.session.clear();
        session.update(contato);
        tx.commit();
        return true;
    }

    @Override
    public boolean removerContato(Contato contato) {
        Transaction tx = session.beginTransaction();
        this.session.clear();
        session.delete(contato);
        tx.commit();
        return true;
    }

    @Override
    public Contato selecionarContato(Contato contato) {
        return (Contato) session.load(Contato.class, contato.getCodigo());
    }

    @Override
    public List<Contato> selecionarTodosContatos() {
        return this.session.createCriteria(Contato.class).list();
    }

    @Override
    public List<Contato> selecionarTodosContatosPorCodigoNomeTelefone(Contato contato) {
        if (contato.getCodigo() == 0 && contato.getNome().length() == 0 && contato.getTelefone().length() == 0) {
            List<Contato> contatos = session.createCriteria(Contato.class).list();
            return contatos;
        } else if (contato.getNome().length() == 0 && contato.getTelefone().length() == 0) {
            List<Contato> contatos = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).list();
            return contatos;
        } else if (contato.getCodigo() == 0 && contato.getTelefone().length() == 0) {
            List<Contato> contatos = session.createCriteria(Contato.class).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).list();
            return contatos;
        } else if (contato.getCodigo() == 0 && contato.getNome().length() == 0) {
            List<Contato> contatosTel = session.createCriteria(Contato.class).add(Restrictions.eq("telefone", contato.getTelefone())).list();
            if (contatosTel.size() == 0) {
                List<Contato> contatosFax = session.createCriteria(Contato.class).add(Restrictions.eq("fax", contato.getFax())).list();
                if (contatosFax.size() == 0) {
                    List<Contato> contatosCel = session.createCriteria(Contato.class).add(Restrictions.eq("celular", contato.getCelular())).list();
                    if (contatosCel.size() == 0) {
                        return contatosTel;
                    } else {
                        return contatosCel;
                    }
                } else {
                    return contatosFax;
                }
            } else {
                return contatosTel;
            }            
        } else if (contato.getCodigo() == 0) {
            List<Contato> contatosTel = session.createCriteria(Contato.class).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("telefone", contato.getTelefone())).list();
            if (contatosTel.size() == 0) {
                List<Contato> contatosFax = session.createCriteria(Contato.class).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("fax", contato.getFax())).list();
                if (contatosFax.size() == 0) {
                    List<Contato> contatosCel = session.createCriteria(Contato.class).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("celular", contato.getCelular())).list();
                    if (contatosCel.size() == 0) {
                        return contatosTel;
                    } else {
                        return contatosCel;
                    }
                } else {
                    return contatosFax;
                }
            } else {
                return contatosTel;
            }            
        } else if (contato.getNome().length() == 0) {
            List<Contato> contatosTel = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.eq("telefone", contato.getTelefone())).list();
            if (contatosTel.size() == 0) {
                List<Contato> contatosFax = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.eq("fax", contato.getFax())).list();
                if (contatosFax.size() == 0) {
                    List<Contato> contatosCel = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.eq("celular", contato.getCelular())).list();
                    if (contatosCel.size() == 0) {
                        return contatosTel;
                    } else {
                        return contatosCel;
                    }
                } else {
                    return contatosFax;
                }
            } else {
                return contatosTel;
            }          
        } else if (contato.getTelefone().length() == 0) {
            List<Contato> contatos = session.createCriteria(Contato.class).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("codigo", contato.getCodigo())).list();
            return contatos;
        } else {
            List<Contato> contatosTel = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("telefone", contato.getTelefone())).list();
            if (contatosTel.size() == 0) {
                List<Contato> contatosFax = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("fax", contato.getFax())).list();
                if (contatosFax.size() == 0) {
                    List<Contato> contatosCel = session.createCriteria(Contato.class).add(Restrictions.eq("codigo", contato.getCodigo())).add(Restrictions.like("nome", contato.getNome(), MatchMode.ANYWHERE)).add(Restrictions.eq("celular", contato.getCelular())).list();
                    if (contatosCel.size() == 0) {
                        return contatosTel;
                    } else {
                        return contatosCel;
                    }
                } else {
                    return contatosFax;
                }
            } else {
                return contatosTel;
            }            
        }
    }
}
