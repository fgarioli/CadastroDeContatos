package dao;

import domain.Cidade; 
import java.util.List; 

public interface CidadeDao {

    public boolean removerCidade (Cidade cidade);

    public boolean alterarCidade (Cidade cidade);

    public boolean inserirCidade (Cidade cidade);

    public List<Cidade> selecionarTodasCidades();
    
    public List<Cidade> selecionarTodasCidadesPorCodigoNome(Cidade cidade);

    public List<Cidade> selecionarTodasCidadesPorUF(Cidade cidade);
    
    public Cidade selecionarCidade (Cidade cidade);

}

