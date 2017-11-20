package projeto_sgda;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JPanel_Disciplinas extends javax.swing.JPanel {

    public JPanel_Disciplinas() {
        initComponents();
        formatar.filtrarSpinner(spnQuantidade);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        cmbDescricaoCurso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbCodigoProfessor = new javax.swing.JComboBox<>();
        cmbNomeProfessor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        spnQuantidade = new javax.swing.JSpinner();
        btnAtualizarCurso = new javax.swing.JButton();
        btnAtualizarProfessor = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_disciplinas.png"))); // NOI18N

        jLabel1.setText("Descrição da Disciplina:");

        jLabel2.setText("Curso:");

        cmbCodigoCurso.setEnabled(false);

        cmbDescricaoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescricaoCursoActionPerformed(evt);
            }
        });

        jLabel3.setText("Professor:");

        cmbCodigoProfessor.setEnabled(false);

        cmbNomeProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomeProfessorActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantidade de Aulas:");

        spnQuantidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        btnAtualizarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/database_refresh.png"))); // NOI18N
        btnAtualizarCurso.setText("   Atualizar");
        btnAtualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCursoActionPerformed(evt);
            }
        });

        btnAtualizarProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/database_refresh.png"))); // NOI18N
        btnAtualizarProfessor.setText("   Atualizar");
        btnAtualizarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProfessorActionPerformed(evt);
            }
        });

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLimparCampos.setText("   Limpar Campos");
        btnLimparCampos.setToolTipText("");
        btnLimparCampos.setActionCommand("Inserir");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnInserirDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/database_add.png"))); // NOI18N
        btnInserirDados.setText("   Inserir Dados");
        btnInserirDados.setToolTipText("");
        btnInserirDados.setActionCommand("Inserir");
        btnInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarProfessor))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbDescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarCurso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserirDados)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarCurso))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCodigoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarProfessor))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirDados)
                    .addComponent(btnLimparCampos))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDescricaoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescricaoCursoActionPerformed
        int index = cmbDescricaoCurso.getSelectedIndex();
        cmbCodigoCurso.setSelectedIndex(index);
    }//GEN-LAST:event_cmbDescricaoCursoActionPerformed

    Formatar_Campos formatar = new Formatar_Campos();
    
    private void btnAtualizarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProfessorActionPerformed
        atualizarProfessor();
    }//GEN-LAST:event_btnAtualizarProfessorActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        inserirDados();
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void btnAtualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCursoActionPerformed
        atualizarCurso();
    }//GEN-LAST:event_btnAtualizarCursoActionPerformed

    private void cmbNomeProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomeProfessorActionPerformed
        int index = cmbNomeProfessor.getSelectedIndex();
        cmbCodigoProfessor.setSelectedIndex(index);
    }//GEN-LAST:event_cmbNomeProfessorActionPerformed

    private void limparCampos() {
        txtDescricao.setText(null);
        cmbCodigoCurso.setSelectedIndex(-1);
        cmbDescricaoCurso.setSelectedIndex(-1);
        cmbCodigoProfessor.setSelectedIndex(-1);
        cmbNomeProfessor.setSelectedIndex(-1);
        spnQuantidade.setValue(0);
    }

    public Conexão_SGDA banco = new Conexão_SGDA();
    public int erro;
        
    private void inserirDados() {
        erro = 0;
        banco.conectar();
        banco.setComando("INSERT INTO disciplinas (cod_disciplina, descricao, curso, professor, qtde_aulas) VALUES (NULL, ?, ?, ?, ?)");
        banco.parametrizar();

        try {
            banco.parametro.setString(1, txtDescricao.getText());
            banco.parametro.setInt(2, Integer.parseInt(cmbCodigoCurso.getSelectedItem().toString()));
            banco.parametro.setInt(3, Integer.parseInt(cmbCodigoProfessor.getSelectedItem().toString()));
            banco.parametro.setInt(4, Integer.parseInt(spnQuantidade.getValue().toString()));
            
            banco.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            banco.desconectar();  
        }
        
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } 
    }
    
    private void atualizarCurso() {
        List <String> codigoCurso = new ArrayList <> (); 
        List <String> descricaoCurso = new ArrayList <> (); 
        
        banco.conectar();
        banco.setComando("SELECT * FROM cursos");
        banco.parametrizar();
        banco.consultar();
        
        try {
            while (banco.resultado.next()) {
                codigoCurso.add(banco.resultado.getString("cod_curso"));
                descricaoCurso.add(banco.resultado.getString("descricao"));                
            }
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        }

        banco.desconectar();
        
        DefaultComboBoxModel codigoComboBox = new DefaultComboBoxModel(codigoCurso.toArray());
        cmbCodigoCurso.setModel(codigoComboBox);  
        
        DefaultComboBoxModel descricaoComboBox = new DefaultComboBoxModel(descricaoCurso.toArray());
        cmbDescricaoCurso.setModel(descricaoComboBox);
    }
    
    private void atualizarProfessor() {
        List <String> codigoProfessor = new ArrayList <> (); 
        List <String> nomeProfessor = new ArrayList <> (); 
        
        banco.conectar();
        banco.setComando("SELECT * FROM funcionarios WHERE cargo = 'Professor(a) (Superior)' OR cargo = 'Professor(a) (Técnico)'");
        banco.parametrizar();
        banco.consultar();
        
        try {
            while (banco.resultado.next()) {
                codigoProfessor.add(banco.resultado.getString("cod_funcionario"));
                nomeProfessor.add(banco.resultado.getString("nome"));                
            }
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        }

        banco.desconectar();
        
        DefaultComboBoxModel codigoComboBox = new DefaultComboBoxModel(codigoProfessor.toArray());
        cmbCodigoProfessor.setModel(codigoComboBox);  
        
        DefaultComboBoxModel descricaoComboBox = new DefaultComboBoxModel(nomeProfessor.toArray());
        cmbNomeProfessor.setModel(descricaoComboBox); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCurso;
    private javax.swing.JButton btnAtualizarProfessor;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbCodigoProfessor;
    private javax.swing.JComboBox<String> cmbDescricaoCurso;
    private javax.swing.JComboBox<String> cmbNomeProfessor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
