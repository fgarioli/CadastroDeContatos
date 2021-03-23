/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Contato;
import java.util.List;

/**
 *
 * @author Newcolor
 */
public interface ContatoDao {
    public boolean inserirContato(Contato contato);
    public boolean alterarContato(Contato contato);
    public boolean removerContato(Contato contato);
    public Contato selecionarContato(Contato contato);
    public List<Contato> selecionarTodosContatos();
    public List<Contato> selecionarTodosContatosPorCodigoNomeTelefone(Contato contato);
    
}
