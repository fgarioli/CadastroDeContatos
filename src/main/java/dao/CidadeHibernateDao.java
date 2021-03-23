package dao;

import domain.Cidade;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.221ABF9D-3B5F-2ECB-05EE-BA09FF9B94A8]
// </editor-fold> 
public class CidadeHibernateDao implements CidadeDao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28C97621-7680-99A5-BBE5-BA0DE253C022]
    // </editor-fold> 
    private Session session;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B495E68A-5FCF-9F90-CB54-EF3FC05F0C18]
    // </editor-fold> 
    public CidadeHibernateDao() {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2B59B0EF-7D92-FCE6-9C60-ADED97B6DCA7]
    // </editor-fold> 
    public Session getSession() {
        return session;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.91F0804B-83A1-FEF7-426F-3A4C8DB8F5CA]
    // </editor-fold> 
    public void setSession(Session val) {
        this.session = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.456C8A35-F78D-9DA7-0A46-A14955AC4B13]
    // </editor-fold> 
    @Override
    public boolean inserirCidade(Cidade cidade) {
        Transaction tx = this.session.beginTransaction();
        this.session.save(cidade);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2BBDED25-0629-A7F0-E5FC-14BF78CF397D]
    // </editor-fold> 
    @Override
    public boolean alterarCidade(Cidade cidade) {
        Transaction tx = this.session.beginTransaction();
        this.session.flush();
        this.session.clear();
        this.session.update(cidade);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.84B94A7E-206A-9366-F4C3-A7E44369177F]
    // </editor-fold> 
    @Override
    public boolean removerCidade(Cidade cidade) {
        Transaction tx = this.session.beginTransaction();
        this.session.delete(cidade);
        tx.commit();
        return true;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A0FE2568-E414-166E-E70F-541457D16DBA]
    // </editor-fold> 
    @Override
    public Cidade selecionarCidade(Cidade cidade) {
        return (Cidade) session.load(Cidade.class, cidade.getCodCidade());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F3447D73-3DCA-DC8F-D9C2-79631D0EDC1E]
    // </editor-fold> 
    @Override
    public List<Cidade> selecionarTodasCidades() {
        return this.session.createCriteria(Cidade.class).list();
    }

    @Override
    public List<Cidade> selecionarTodasCidadesPorCodigoNome(Cidade cidade) {
        if (cidade.getCodCidade() == 0 && cidade.getNomeCidade().length() == 0) {
            List<Cidade> usuarios = session.createCriteria(Cidade.class).list();
            return usuarios;
        } else if (cidade.getNomeCidade().length() == 0) {
            List<Cidade> usuarios = session.createCriteria(Cidade.class).add(Restrictions.eq("codCidade", cidade.getCodCidade())).list();
            return usuarios;
        } else if (cidade.getCodCidade() == 0) {
            List<Cidade> usuarios = session.createCriteria(Cidade.class).add(Restrictions.like("nomeCidade", cidade.getNomeCidade(), MatchMode.ANYWHERE)).list();
            return usuarios;
        } else {
            List<Cidade> cidades = session.createCriteria(Cidade.class).add(Restrictions.eq("codCidade", cidade.getCodCidade())).add(Restrictions.like("nomecodCidade", cidade.getNomeCidade(), MatchMode.ANYWHERE)).list();
            return cidades;
        }
    }
    
    @Override
    public List<Cidade> selecionarTodasCidadesPorUF(Cidade cidade) {
        List<Cidade> cidades = session.createCriteria(Cidade.class).add(Restrictions.eq("uf", cidade.getUf())).list();
        return cidades;
    }
    
}
