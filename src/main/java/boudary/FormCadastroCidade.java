/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boudary;

import boudary.listar.ListarTodasCidades;
import control.Control;
import domain.Cidade;
import javax.swing.JOptionPane;
import util.BloquearCampos;

/**
 *
 * @author Newcolor
 */
public class FormCadastroCidade extends javax.swing.JDialog {

    private int tipoOperacao;
    private Cidade contato;
    private ListarTodasCidades formListCid;

    /**
     * Creates new form FormCadastroCidade
     */
    public FormCadastroCidade(ListarTodasCidades parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formListCid = parent;
    }

    public FormCadastroCidade(ListarTodasCidades parent, boolean modal, int tipoOp, Cidade cid) {
        super(parent, modal);
        initComponents();

        formListCid = parent;
        contato = cid;
        tipoOperacao = tipoOp;
        setarCidade(contato);

        if (tipoOperacao == 1) {
            btAction.setText("Alterar");
        } else if (tipoOperacao == 2) {
            btAction.setText("Remover");
            BloquearCampos.bloqueiaCampo(this);
        } else if (tipoOperacao == 3) {
            BloquearCampos.bloqueiaCampo(this);
            btAction.setText("Fechar");
        }
    }

    public void inserirCidade() {
        if (validarForm()) {
            Cidade cidade = new Cidade();
            cidade.setNomeCidade(tfNome.getText());
            cidade.setUf((String) cbUF.getSelectedItem());
            if (Control.inserirCidade(cidade)) {
                JOptionPane.showMessageDialog(null, "Cidade salva com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                formListCid.listarCidadesPorCodigoNome();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao salvar cidade!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void alterarCidade() {
        if (validarForm()) {
            Cidade cidade = new Cidade();
            cidade.setCodCidade(Integer.parseInt(tfCodigo.getText()));
            cidade.setNomeCidade(tfNome.getText());
            cidade.setUf((String) cbUF.getSelectedItem());

            if (Control.alterarCidade(cidade)) {
                JOptionPane.showMessageDialog(null, "Cidade alterada com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                formListCid.listarCidadesPorCodigoNome();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao alterar cidade!", "Erro!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void removerCidade() {
        Cidade cidade = new Cidade();
        cidade.setCodCidade(Integer.parseInt(tfCodigo.getText()));
        cidade.setNomeCidade(tfNome.getText());
        cidade.setUf((String) cbUF.getSelectedItem());

        if (Control.removerCidade(cidade)) {
            JOptionPane.showMessageDialog(null, "Cidade removida com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            formListCid.listarCidadesPorCodigoNome();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao remover cidade!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean validarForm() {
        if (tfNome.getText().length() != 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Insira o nome da cidade!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void setarCidade(Cidade cidade) {
        tfCodigo.setText(String.valueOf(cidade.getCodCidade()));
        tfNome.setText(cidade.getNomeCidade());
        cbUF.setSelectedItem(cidade.getUf());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox();
        btAction = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setModal(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbCodigo.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setFocusable(false);

        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbNome.setText("Nome:");

        lbUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUF.setText("UF:");

        cbUF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Selecione--", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        btAction.setText("Salvar");
        btAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(lbUF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfNome))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(btAction, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUF)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAction)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionActionPerformed
        // TODO add your handling code here:
        if (tipoOperacao == 1) {
            alterarCidade();
        } else if (tipoOperacao == 2) {
            removerCidade();
        } else if (tipoOperacao == 3) {
            this.dispose();
        } else {
            inserirCidade();
        }
    }//GEN-LAST:event_btActionActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAction;
    private javax.swing.JComboBox cbUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbUF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}