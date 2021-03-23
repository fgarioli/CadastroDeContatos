/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import domain.Contato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fernando
 */
public class ContatoTableModel extends AbstractTableModel {

    //constantes que vão representar as colunas
    //(só para facilitar o entendimento do código)
    private final int COL_COD = 0;
    private final int COL_NOME = 1;
    private final int COL_TEL = 2;
    private final int COL_FAX = 3;
    private final int COL_CEL = 4;
    //lista dos produtos que serão exibidos
    private List<Contato> contatos;

    public ContatoTableModel() {
        this.contatos = new ArrayList<Contato>();
    }

    public ContatoTableModel(List lista) {
        this();
        contatos.addAll(lista);
    }

    @Override
    public int getRowCount() {
        //cada produto na lista será uma linha
        return contatos.size();
    }

    @Override
    public int getColumnCount() {
        return 5; // Quantidade de Colunas
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //pega o contato da linha
        Contato contato = contatos.get(rowIndex);

        //verifica qual valor deve ser retornado
        if (columnIndex == COL_COD) {
            return contato.getCodigo();
        } else if (columnIndex == COL_NOME) {
            return contato.getNome();
        } else if (columnIndex == COL_TEL) {
            return mascaraTel(contato.getTelefone());
        } else if (columnIndex == COL_FAX) {
            return mascaraTel(contato.getFax());
        } else if (columnIndex == COL_CEL) {
            return mascaraTel(contato.getCelular());
        }
        return "";
    }

    public Contato getValueAt(int rowIndex) {
        //pega o contato da linha
        Contato contato = contatos.get(rowIndex);

        //verifica qual valor deve ser retornado
        return contato;
    }

    @Override
    public String getColumnName(int column) {
        //qual o nome da coluna
        if (column == COL_COD) {
            return "Cód.";
        } else if (column == COL_NOME) {
            return "Nome";
        } else if (column == COL_TEL) {
            return "Telefone";
        } else if (column == COL_FAX) {
            return "Fax";
        } else if (column == COL_CEL) {
            return "Celular";
        }
        return "";
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        //retorna a classe que representa a coluna
        if (columnIndex == COL_COD) {
            return Integer.class;
        } else if (columnIndex == COL_NOME) {
            return String.class;
        } else if (columnIndex == COL_TEL) {
            return String.class;
        } else if (columnIndex == COL_FAX) {
            return String.class;
        } else if (columnIndex == COL_CEL) {
            return String.class;
        }
        return String.class;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //pega o contato da linha
        Contato contato = contatos.get(rowIndex);

        //verifica qual valor vai ser alterado
        if (columnIndex == COL_COD) {
            contato.setCodigo(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == COL_NOME) {
            contato.setNome(aValue.toString());
        } else if (columnIndex == COL_TEL) {
            contato.setTelefone(tiraMascaraTel(aValue.toString()));
        } else if (columnIndex == COL_FAX) {
            contato.setFax(aValue.toString());
        } else if (columnIndex == COL_CEL) {
            contato.setCelular(aValue.toString());
        }

        //avisa que os dados mudaram
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //no nosso caso todas vão ser não editáveis, entao retorna false pra todas
        return false;
    }
    
    public void setData(List<Contato> cont) {
        contatos = new ArrayList<>(cont);
    }

    public void inserir(Contato contato) {
        contatos.add(contato);

        fireTableDataChanged();
    }

    public void excluir(int linha) {
        contatos.remove(linha);

        fireTableDataChanged();
    }

    public void excluir(Contato contato) {
        contatos.remove(contato);

        fireTableDataChanged();
    }

    public void excluirTudo() {
        for (int i = 0; i < contatos.size(); i++) {
            contatos.remove(i);
        }

        fireTableDataChanged();
    }

    public String mascaraTel(String tel) {
        if (tel.length() != 0) {
            char[] telChar = tel.toString().trim().toCharArray();
            String telFormatado = "(" + telChar[0] + telChar[1] + ") " + telChar[2] + telChar[3]
                    + telChar[4] + telChar[5] + "-" + telChar[6] + telChar[7] + telChar[8] + telChar[9];
            return telFormatado;
        }
        return null;
    }

    public String tiraMascaraTel(String comMascara) {
        String semMascara = "";
        semMascara = comMascara.trim();
        semMascara = semMascara.replace("(", "");
        semMascara = semMascara.replace(")", "");
        semMascara = semMascara.replace("-", "");
        semMascara = semMascara.replace(" ", "");
        
        return semMascara;
    }
}
