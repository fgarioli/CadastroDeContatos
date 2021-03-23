/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import com.towel.el.annotation.Resolvable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;
import util.TelFormatter;

/**
 *
 * @author Newcolor
 */
@Entity
@Table(name = "contato")
public class Contato implements Serializable {
    
    @Id @GeneratedValue
    @Column(name = "codigo")
    @Resolvable(colName = "Cód.")
    private int codigo;
    
    @Column(name = "nome")
    @Resolvable(colName = "Nome")
    private String nome;
    
    @Column(name = "endereco")
    private String endereco;
    
    @Column(name = "bairro")
    private String bairro;
    
    @Column(name = "complemento")
    private String complemento;
    
    @ManyToOne
    @ForeignKey(name="fk_conato_cidade")
    private Cidade cidade;
    
    @Column(name = "telefone")
    @Resolvable(colName = "Telefone", formatter = TelFormatter.class)
    private String telefone;
    
    @Column(name = "fax")
    @Resolvable(colName = "Fax", formatter = TelFormatter.class)
    private String fax;
    
    @Column(name = "celular")
    @Resolvable(colName = "Celular", formatter = TelFormatter.class)
    private String celular;
    
    @Column(name = "informacoes_adicionais")
    private String infoAd;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String Celular) {
        this.celular = Celular;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }

    public String getInfoAd() {
        return infoAd;
    }

    public void setInfoAd(String infoAd) {
        this.infoAd = infoAd;
    }
    
    @Override
    public boolean equals(Object obj) {
        Contato cont = (Contato) obj;
        if (this.getNome().equals(cont.getNome())) {
            return true;
        }
        return false;
    }
    
}
