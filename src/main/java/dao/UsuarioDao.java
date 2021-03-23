package dao;

import domain.Usuario; 
import java.util.List; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.FEC68DEC-7E94-96B1-5526-DBA8E854859B]
// </editor-fold> 
public interface UsuarioDao {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E887B36B-FB15-74F1-51F4-87C75FAE0F08]
    // </editor-fold> 
    public Usuario selecionarUsuario (Usuario usuario);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA183DC8-153C-FE12-54E6-88A6BC3351B1]
    // </editor-fold> 
    public boolean removerUsuario (Usuario usuario);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.16710D55-B659-3DE4-FB68-EEC4250E0D4A]
    // </editor-fold> 
    public boolean alterarUsuario (Usuario usuario);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.82CD66B4-893E-9109-868C-4A5E5A899F5A]
    // </editor-fold> 
    public boolean inserirUsuario (Usuario usuario);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DE5674A-4BFD-B8F7-A3B5-8A123A9766C4]
    // </editor-fold> 
    public Usuario logarSistema (String login, String senha);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BEED63EA-8AEC-5D31-A603-6B8A20EB4B09]
    // </editor-fold> 
    public List<Usuario> selecionarTodosUsuariosPorCodigoNome (Usuario usuario);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.078112D9-B2D1-6371-E2E1-61B3C1546DCA]
    // </editor-fold> 
    public List<Usuario> selecionarTodosUsuarios ();

}

