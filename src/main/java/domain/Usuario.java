package domain;

import com.towel.el.annotation.Resolvable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CBD53C53-17B6-50F1-76AE-CDA21214D77E]
// </editor-fold> 
@Entity
public class Usuario implements Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E6C4858F-5472-1B71-B8CE-E147D4A87103]
    // </editor-fold>
    @Id @GeneratedValue
    @Column(name="cod_usuario")
    @Resolvable(colName = "Cód.")
    private int codUsuario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.86AA2FE2-CA8E-24BF-CC1C-BC45CB8D7661]
    // </editor-fold>
    @Column(name="nome_usuario")
    @Resolvable(colName = "Nome")
    private String nomeUsuario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64C8D77D-7D51-9B4E-3B13-DD8CB96D2EA0]
    // </editor-fold>
    @Column(name="login_usuario", unique=true)
    private String loginUsuario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3B7DA408-389D-F67E-39A8-BBA66E7FE3F2]
    // </editor-fold>
    @Column(name="senha_usuario")
    private String senhaUsuario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8E826D9D-17D5-59B6-966B-B10E5AEE996B]
    // </editor-fold> 
    public Usuario () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7B08936A-F374-C837-03DC-6E4CA8D83EFA]
    // </editor-fold> 
    public int getCodUsuario () {
        return codUsuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.61923E0B-3DD6-FEE3-AD55-6684FD9BB5D7]
    // </editor-fold> 
    public void setCodUsuario (int val) {
        this.codUsuario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2B961D97-E580-3265-388D-AC8BBE0DA777]
    // </editor-fold> 
    public String getLoginUsuario () {
        return loginUsuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8CC6E643-C055-0932-9440-1420BCDDEB5A]
    // </editor-fold> 
    public void setLoginUsuario (String val) {
        this.loginUsuario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06FADF4E-7D35-6916-D818-C16AC111904B]
    // </editor-fold> 
    public String getNomeUsuario () {
        return nomeUsuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.546EA0A4-8123-778C-A6AC-CFEE1DACCE96]
    // </editor-fold> 
    public void setNomeUsuario (String val) {
        this.nomeUsuario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ED22A043-06C5-DB7D-EFCC-DD9D9499F034]
    // </editor-fold> 
    public String getSenhaUsuario () {
        return senhaUsuario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4D0B8987-B413-C933-CE74-6D0435A34611]
    // </editor-fold> 
    public void setSenhaUsuario (String val) {
        this.senhaUsuario = val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.nomeUsuario.equals(((Usuario) obj).getNomeUsuario()) 
                && this.codUsuario == ((Usuario) obj).getCodUsuario()
                && this.loginUsuario.equals(((Usuario) obj).getLoginUsuario())
                && this.senhaUsuario.equals(((Usuario) obj).getSenhaUsuario())) {
            return true;
        }
        return false;
    }

}

