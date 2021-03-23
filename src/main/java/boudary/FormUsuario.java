/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormUsuario.java
 *
 * Created on 06/12/2010, 22:59:21
 */
package boudary;

import boudary.listar.ListarTodosUsuariosPorCodigoNome;
import control.Control;
import domain.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.BloquearCampos;
import util.DesbloquearCampos;
import util.LimparCampos;

/**
 *
 * @author Fernando
 */
public class FormUsuario extends javax.swing.JDialog {

    /** Creates new form FormUsuario */
    public FormUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL url = getClass().getResource("/boundary/Icones/usuario16x16.png");
        Image imagem = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagem);

        this.atualizarArray();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btPrimeiroUsuario = new javax.swing.JButton();
        btVoltarUsuario = new javax.swing.JButton();
        btAvancarUsuario = new javax.swing.JButton();
        btUltimoUsuario = new javax.swing.JButton();
        btPesquisarUsuario = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbLogin = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        lbVerificacaoSenha = new javax.swing.JLabel();
        tfVerificacaoSenha = new javax.swing.JPasswordField();
        btAlterarCancelarUsuario = new javax.swing.JButton();
        btInserirUsuario = new javax.swing.JButton();
        btExcluirUsuario = new javax.swing.JButton();
        btSalvarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Usuários");
        setIconImage(null);
        setModal(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btPrimeiroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/go-first.png"))); // NOI18N
        btPrimeiroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroUsuarioActionPerformed(evt);
            }
        });

        btVoltarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/go-previous.png"))); // NOI18N
        btVoltarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarUsuarioActionPerformed(evt);
            }
        });

        btAvancarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/go-next.png"))); // NOI18N
        btAvancarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvancarUsuarioActionPerformed(evt);
            }
        });

        btUltimoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/go-last.png"))); // NOI18N
        btUltimoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoUsuarioActionPerformed(evt);
            }
        });

        btPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/pesquisar_Formulario.png"))); // NOI18N
        btPesquisarUsuario.setText("Pesquisar");
        btPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarUsuarioActionPerformed(evt);
            }
        });

        lbCodigo.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setEnabled(false);

        lbNome.setText("*Nome:");

        lbLogin.setText("*Login:");

        lbSenha.setText("*Senha:");

        lbVerificacaoSenha.setText("*Repita a Senha:");

        btAlterarCancelarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/editar.png"))); // NOI18N
        btAlterarCancelarUsuario.setText("Alterar");
        btAlterarCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarCancelarUsuarioActionPerformed(evt);
            }
        });

        btInserirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/inserir.png"))); // NOI18N
        btInserirUsuario.setText("Inserir");
        btInserirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirUsuarioActionPerformed(evt);
            }
        });

        btExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/remover.png"))); // NOI18N
        btExcluirUsuario.setText("Excluir");
        btExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUsuarioActionPerformed(evt);
            }
        });

        btSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boundary/Icones/salvar.png"))); // NOI18N
        btSalvarUsuario.setText("Salvar");
        btSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarUsuarioActionPerformed(evt);
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
                        .addComponent(btPrimeiroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAvancarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btUltimoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                        .addComponent(btPesquisarUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbVerificacaoSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfVerificacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btInserirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterarCancelarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPrimeiroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAvancarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUltimoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVerificacaoSenha)
                    .addComponent(tfVerificacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btAlterarCancelarUsuario)
                    .addComponent(btExcluirUsuario)
                    .addComponent(btSalvarUsuario)
                    .addComponent(btInserirUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarUsuarioActionPerformed
        // TODO add your handling code here:
        ListarTodosUsuariosPorCodigoNome listarTodosUsuariosPorCodigoNome = new ListarTodosUsuariosPorCodigoNome(this, false, tfNome.getText());
        listarTodosUsuariosPorCodigoNome.setLocationRelativeTo(null);
        listarTodosUsuariosPorCodigoNome.setVisible(true);
}//GEN-LAST:event_btPesquisarUsuarioActionPerformed

    private void btPrimeiroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroUsuarioActionPerformed
        // TODO add your handling code here:
        if (btPrimeiroUsuario.isEnabled()) {
            if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados no Sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                LimparCampos.limpaCampo(this);
                usuarioCorrente = usuarios.get(0);

                setarUsuario(usuarioCorrente);
            }
        }
    }//GEN-LAST:event_btPrimeiroUsuarioActionPerformed

    private void btVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarUsuarioActionPerformed
        // TODO add your handling code here:
        if (btVoltarUsuario.isEnabled()) {
            if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados no Sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                if (tfCodigo.getText().equals("")) {
                    LimparCampos.limpaCampo(this);
                    usuarioCorrente = usuarios.get(usuarios.size() - 1);

                    setarUsuario(usuarioCorrente);
                } else {

                    int i = 0;
                    for (Usuario u : usuarios) {
                        if (tfCodigo.getText().equals(String.valueOf(u.getCodUsuario()))) {
                            if (i == 0) {
                                LimparCampos.limpaCampo(this);
                                int max = usuarios.size() - 1;
                                usuarioCorrente = usuarios.get(max);
                                setarUsuario(usuarioCorrente);
                                break;
                            } else {
                                LimparCampos.limpaCampo(this);
                                usuarioCorrente = usuarios.get(i - 1);
                                setarUsuario(usuarioCorrente);
                                break;
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }//GEN-LAST:event_btVoltarUsuarioActionPerformed

    private void btAvancarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvancarUsuarioActionPerformed
        // TODO add your handling code here:
        if (btAvancarUsuario.isEnabled()) {
            if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados no Sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                if (tfCodigo.getText().equals("")) {
                    LimparCampos.limpaCampo(this);
                    usuarioCorrente = usuarios.get(0);

                    setarUsuario(usuarioCorrente);
                } else {
                    int i = 0;
                    for (Usuario u : usuarios) {
                        if (tfCodigo.getText().equals(String.valueOf(u.getCodUsuario()))) {
                            if (i == usuarios.size() - 1) {
                                LimparCampos.limpaCampo(this);
                                usuarioCorrente = usuarios.get(0);
                                setarUsuario(usuarioCorrente);
                                break;
                            } else {
                                LimparCampos.limpaCampo(this);
                                usuarioCorrente = usuarios.get(i + 1);
                                setarUsuario(usuarioCorrente);
                                break;
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }//GEN-LAST:event_btAvancarUsuarioActionPerformed

    private void btUltimoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoUsuarioActionPerformed
        // TODO add your handling code here:
        if (btUltimoUsuario.isEnabled()) {
            if (usuarios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há usuários cadastrados no Sistema!", "Atenção", JOptionPane.WARNING_MESSAGE);
            } else {
                LimparCampos.limpaCampo(this);

                int posicao;
                posicao = usuarios.size();
                usuarioCorrente = usuarios.get(posicao - 1);

                setarUsuario(usuarioCorrente);
            }
        }
    }//GEN-LAST:event_btUltimoUsuarioActionPerformed

    private void btInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirUsuarioActionPerformed
        // TODO add your handling code here:
        if (setado) {
            URL url = getClass().getResource("/boundary/Icones/inserir.png");
            Image imagem = Toolkit.getDefaultToolkit().getImage(url);
            ImageIcon icon = new ImageIcon(imagem);
            btInserirUsuario.setIcon(icon);
            btInserirUsuario.setText("Inserir");
            setado = false;
            usuarioCorrente = new Usuario();
            LimparCampos.limpaCampo(this);
            DesbloquearCampos.desbloqueiaCampo(this);
            tfCodigo.setEditable(false);
            if (altera) {
                altera = false;
                URL url2 = getClass().getResource("/boundary/Icones/editar.png");
                Image imagem2 = Toolkit.getDefaultToolkit().getImage(url2);
                ImageIcon icon2 = new ImageIcon(imagem2);
                btAlterarCancelarUsuario.setIcon(icon2);
                btAlterarCancelarUsuario.setText("Alterar");
            }
        } else {
            if (validarFormUsuario()) {
                if (validarSenha()) {
                    Usuario usuario = new Usuario();
                    usuario.setNomeUsuario(tfNome.getText());
                    usuario.setLoginUsuario(tfLogin.getText());
                    //usuario.setSenhaUsuario(this.formatarSenha(tfSenha.getPassword()));
                    usuario.setSenhaUsuario(new String(tfSenha.getPassword()));

                    if (Control.inserirUsuario(usuario)) {
                        LimparCampos.limpaCampo(this);
                        atualizarArray();
                        JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao inserir usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não coincidem!\nDigite-as novamente.", "Erro!", JOptionPane.ERROR_MESSAGE);
                    tfSenha.setText("");
                    tfVerificacaoSenha.setText("");
                }
            }
        }
    }//GEN-LAST:event_btInserirUsuarioActionPerformed

    private void btAlterarCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarCancelarUsuarioActionPerformed
        // TODO add your handling code here:
        if (usuarioCorrente.getCodUsuario() != 0) {
            if (altera) {
                URL url = getClass().getResource("/boundary/Icones/editar.png");
                Image imagem = Toolkit.getDefaultToolkit().getImage(url);
                ImageIcon icon = new ImageIcon(imagem);
                btAlterarCancelarUsuario.setIcon(icon);
                btAlterarCancelarUsuario.setText("Alterar");
                altera = false;
                BloquearCampos.bloqueiaCampo(this);
                setarUsuario(usuarioCorrente);
            } else {
                URL url = getClass().getResource("/boundary/Icones/cancelar.png");
                Image imagem = Toolkit.getDefaultToolkit().getImage(url);
                ImageIcon icon = new ImageIcon(imagem);
                btAlterarCancelarUsuario.setIcon(icon);
                btAlterarCancelarUsuario.setText("Cancelar");
                altera = true;
                DesbloquearCampos.desbloqueiaCampo(this);
                tfCodigo.setEditable(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não há nenhum usuário setado para ser alterado!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarCancelarUsuarioActionPerformed

    private void btSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarUsuarioActionPerformed
        // TODO add your handling code here:
        if (tfNome.isEditable()) {
            if (usuarioCorrente.getCodUsuario() != 0) {
                if (validarFormUsuario()) {
                    if (validarSenha()) {
                        Usuario usuario = new Usuario();
                        usuario.setCodUsuario(Integer.parseInt(tfCodigo.getText()));
                        usuario.setNomeUsuario(tfNome.getText());
                        usuario.setLoginUsuario(tfLogin.getText());
                        //usuario.setSenhaUsuario(this.formatarSenha(tfSenha.getPassword()));
                        usuario.setSenhaUsuario(new String(tfSenha.getPassword()));

                        if (!usuario.equals(usuarioCorrente)) {
                            if (Control.alterarUsuario(usuario)) {
                                atualizarArray();
                                usuarioCorrente = usuario;
                                JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);

                                URL url = getClass().getResource("/boundary/Icones/editar.png");
                                Image imagem = Toolkit.getDefaultToolkit().getImage(url);
                                ImageIcon icon = new ImageIcon(imagem);
                                btAlterarCancelarUsuario.setIcon(icon);
                                btAlterarCancelarUsuario.setText("Alterar");
                                altera = false;
                                BloquearCampos.bloqueiaCampo(this);
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao salvar usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            URL url = getClass().getResource("/boundary/Icones/editar.png");
                            Image imagem = Toolkit.getDefaultToolkit().getImage(url);
                            ImageIcon icon = new ImageIcon(imagem);
                            btAlterarCancelarUsuario.setIcon(icon);
                            btAlterarCancelarUsuario.setText("Alterar");
                            altera = false;
                            BloquearCampos.bloqueiaCampo(this);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "As senhas não coincidem!\nDigite-as novamente.", "Erro!", JOptionPane.ERROR_MESSAGE);
                        tfSenha.setText("");
                        tfVerificacaoSenha.setText("");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe um usuário setado para ser salvo!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Somente é possível salvar um usuário alterado!\nClique em alterar para fazer alterações.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarUsuarioActionPerformed

    private void btExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUsuarioActionPerformed
        // TODO add your handling code here:
        if (usuarioCorrente.getCodUsuario() != 0) {
            if (altera == false) {
                if (Control.selecionarTodosUsuarios().size() <= 1) {
                    JOptionPane.showMessageDialog(null, "Não é possível excluir este usuário!\nÉ necessário pelo menos um usuário cadastrado no sistema.", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String opt[] = {"Sim", "Não"};
                    int confirmacao = 0;
                    confirmacao = JOptionPane.showOptionDialog(this, "Deseja realmente excluir este usuário?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
                    if (confirmacao == 0) {
                        if (Control.removerUsuario(usuarioCorrente)) {
                            atualizarArray();
                            LimparCampos.limpaCampo(this);
                            DesbloquearCampos.desbloqueiaCampo(this);
                            tfCodigo.setEditable(false);
                            usuarioCorrente = new Usuario();

                            URL url2 = getClass().getResource("/boundary/Icones/inserir.png");
                            Image imagem2 = Toolkit.getDefaultToolkit().getImage(url2);
                            ImageIcon icon2 = new ImageIcon(imagem2);
                            btInserirUsuario.setIcon(icon2);
                            btInserirUsuario.setText("Inserir");

                            JOptionPane.showMessageDialog(null, "Usuário removido com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao remover usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível excluir um usuário em edição!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existe um usuário setado para ser excluído!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirUsuarioActionPerformed

    // Executa a validação Completa do Formulário
    public boolean validarFormUsuario() {
        String password = tfSenha.getPassword().toString();
        String passwordVerificacao = tfVerificacaoSenha.getPassword().toString();
        if (tfNome.getText().length() != 0
                && tfLogin.getText().length() != 0
                && password.length() != 0
                && passwordVerificacao.length() != 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean validarSenha() {
        char[] password = tfSenha.getPassword();
        char[] passwordVerificacao = tfVerificacaoSenha.getPassword();
        String passwordString = "", verificacaoString = "";

        // adicionando os arrays de char nas strings declaradas acima
        for (int i = 0; i < password.length; i++) {
            passwordString = passwordString + password[i];
        }
        for (int i = 0; i < passwordVerificacao.length; i++) {
            verificacaoString = verificacaoString + passwordVerificacao[i];
        }

        // verificando
        if (passwordString.equals(verificacaoString)) {
            return true;
        } else {
            return false;
        }
    }

    // Método que seta um usuário no formulário
    public void setarUsuario(Usuario usuario) {
        tfCodigo.setText(String.valueOf(usuario.getCodUsuario()));
        tfNome.setText(usuario.getNomeUsuario());
        tfLogin.setText(usuario.getLoginUsuario());
        tfSenha.setText(usuario.getSenhaUsuario());
        tfVerificacaoSenha.setText(usuario.getSenhaUsuario());
        setado = true;
        altera = false;

        URL url = getClass().getResource("/boundary/Icones/pincel32x32.png");
        Image imagem = Toolkit.getDefaultToolkit().getImage(url);
        ImageIcon icon = new ImageIcon(imagem);
        btInserirUsuario.setIcon(icon);
        btInserirUsuario.setText("Limpar");

        URL url2 = getClass().getResource("/boundary/Icones/editar.png");
        Image imagem2 = Toolkit.getDefaultToolkit().getImage(url2);
        ImageIcon icon2 = new ImageIcon(imagem2);
        btAlterarCancelarUsuario.setIcon(icon2);
        btAlterarCancelarUsuario.setText("Alterar");

        this.usuarioCorrente = usuario;

        // Bloqueia todos os campos para a não-edição
        BloquearCampos.bloqueiaCampo(this);
    }

    private void atualizarArray() {
        usuarios = (ArrayList<Usuario>) Control.selecionarTodosUsuarios();
    }

    // Formata a senha para ser inserida no banco
    public String formatarSenha(char[] senha) {
        String senhaFormatada = "";
        for (int i = 0; i < senha.length; i++) {
            senhaFormatada = senhaFormatada + senha[i];
        }
        return senhaFormatada;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarCancelarUsuario;
    private javax.swing.JButton btAvancarUsuario;
    private javax.swing.JButton btExcluirUsuario;
    private javax.swing.JButton btInserirUsuario;
    private javax.swing.JButton btPesquisarUsuario;
    private javax.swing.JButton btPrimeiroUsuario;
    private javax.swing.JButton btSalvarUsuario;
    private javax.swing.JButton btUltimoUsuario;
    private javax.swing.JButton btVoltarUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbVerificacaoSenha;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JPasswordField tfVerificacaoSenha;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private Usuario usuarioCorrente = new Usuario();
    private boolean altera = true;
    private boolean setado = false;
}
