/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import com.towel.el.annotation.Resolvable;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Newcolor
 */
@Entity
public class Cidade implements Serializable {
    
    @Id @GeneratedValue
    @Resolvable(colName = "Cód.")
    private int codCidade;
    
    @Resolvable(colName = "Nome")
    private String nomeCidade;
    
    @Resolvable(colName = "UF")
    private String uf;

    public int getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    @Override
    public String toString() {
        return this.nomeCidade;
    }
}
