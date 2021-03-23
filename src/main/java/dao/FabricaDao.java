package dao;
// #[regen=yes,id=DCE.BDDB4A4A-7089-71A3-6419-65C644345C3E]
// </editor-fold> 
public class FabricaDao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E2A18BBD-303F-6E07-3E05-E6D558721108]
    // </editor-fold> 
    public FabricaDao () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0676EA8D-9827-B3B5-B6CD-8182ABB40353]
    // </editor-fold> 
    public static CidadeDao getCidadeDao (String tipo) {
        if (tipo.equals("HBD")) {
            return new CidadeHibernateDao();
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1E5E2B9A-9645-6471-D118-94AFA513C233]
    // </editor-fold> 
    public static ConfDao getConfDao (String tipo) {
        if (tipo.equals("TXT")) {
            return new ConfTextFileDao();
        }
        return null;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4CF670DA-4B2D-5156-C032-A5A4A4784FE1]
    // </editor-fold> 
    public static UsuarioDao getUsuarioDao (String tipo) {
        if (tipo.equals("HBD")) {
            return new UsuarioHibernateDao();
        }
        return null;
    }
    
    public static ContatoDao getContatoDao (String tipo) {
        if (tipo.equals("HBD")) {
            return new ContatoHibernateDao();
        }
        return null;
    }

}

