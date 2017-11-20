package projeto_sgda;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JPanel_Alunos extends javax.swing.JPanel {

    public JPanel_Alunos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fmtRG = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        fmtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        fmtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        fmtContato = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fmtCEP = new javax.swing.JFormattedTextField();
        fmtDataMatricula = new javax.swing.JFormattedTextField();
        btnAtualizarCurso = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbCodigoCurso = new javax.swing.JComboBox<>();
        cmbDescricaoCurso = new javax.swing.JComboBox<>();
        btnLimparCampos = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_alunos.png"))); // NOI18N

        jLabel8.setText("CEP:");

        jLabel9.setText("Contato:");

        jLabel10.setText("E-mail:");

        jLabel1.setText("Nome do Aluno:");

        jLabel2.setText("Gênero:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        cmbGenero.setSelectedIndex(-1);

        jLabel3.setText("RG:");

        try {
            fmtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("CPF:");

        try {
            fmtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Data de Nascimento:");

        fmtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        fmtDataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmtDataNascimento.setToolTipText("Formato da Data: aaaa/mm/dd");
        fmtDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fmtDataNascimentoKeyPressed(evt);
            }
        });

        jLabel12.setText("Data da Matrícula:");

        try {
            fmtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtContato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("Endereço:");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Nº:");

        try {
            fmtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fmtDataMatricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        fmtDataMatricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmtDataMatricula.setToolTipText("Formato da Data: aaaa/mm/dd");
        fmtDataMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fmtDataMatriculaKeyPressed(evt);
            }
        });

        btnAtualizarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/database_refresh.png"))); // NOI18N
        btnAtualizarCurso.setText("   Atualizar");
        btnAtualizarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCursoActionPerformed(evt);
            }
        });

        jLabel13.setText("Curso:");

        cmbCodigoCurso.setEnabled(false);

        cmbDescricaoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescricaoCursoActionPerformed(evt);
            }
        });

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLimparCampos.setText("   Limpar Campos");
        btnLimparCampos.setToolTipText("");
        btnLimparCampos.setActionCommand("Inserir");
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                    .addComponent(jLabel5)
                    .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbDescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fmtRG, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(fmtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtDataMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescricaoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirDados)
                    .addComponent(btnLimparCampos))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public Formatar_Campos formatar = new Formatar_Campos();
    
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
        } finally {
            banco.desconectar();  
        }
        
        DefaultComboBoxModel codigoComboBox = new DefaultComboBoxModel(codigoCurso.toArray());
        cmbCodigoCurso.setModel(codigoComboBox);  
        
        DefaultComboBoxModel descricaoComboBox = new DefaultComboBoxModel(descricaoCurso.toArray());
        cmbDescricaoCurso.setModel(descricaoComboBox);
    }
    
    private void cmbDescricaoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescricaoCursoActionPerformed
        int index = cmbDescricaoCurso.getSelectedIndex();
        cmbCodigoCurso.setSelectedIndex(index);
    }//GEN-LAST:event_cmbDescricaoCursoActionPerformed
    
    private void fmtDataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataNascimentoKeyPressed
       formatar.formataçãoData(fmtDataNascimento, evt);
    }//GEN-LAST:event_fmtDataNascimentoKeyPressed

    private void fmtDataMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataMatriculaKeyPressed
       formatar.formataçãoData(fmtDataMatricula, evt);
    }//GEN-LAST:event_fmtDataMatriculaKeyPressed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        inserirDados();
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void btnAtualizarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCursoActionPerformed
        atualizarCurso();
    }//GEN-LAST:event_btnAtualizarCursoActionPerformed
       
    private void limparCampos() {
        txtNome.setText(null);
        cmbGenero.setSelectedIndex(-1);
        fmtRG.setText(null);
        fmtCPF.setText(null);
        fmtDataNascimento.setText(null);
        cmbCodigoCurso.setSelectedIndex(-1);
        cmbDescricaoCurso.setSelectedIndex(-1);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        fmtCEP.setText(null);
        fmtContato.setText(null);
        txtEmail.setText(null);
        fmtDataMatricula.setText(null);
    }
    
    public Conexão_SGDA banco = new Conexão_SGDA();
    public int erro;
    
    private void inserirDados() {
        erro = 0;
        banco.conectar();
        banco.setComando("INSERT INTO alunos (matricula, nome, genero, rg, cpf, dtnasc, curso, endereco, num, cep, contato, email, dtmatricula) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        banco.parametrizar();

        try {
            banco.parametro.setString(1, txtNome.getText());
            banco.parametro.setString(2, cmbGenero.getSelectedItem().toString());
            banco.parametro.setString(3, fmtRG.getText());
            banco.parametro.setString(4, fmtCPF.getText());
            banco.parametro.setString(5, fmtDataNascimento.getText());
            banco.parametro.setInt(6, Integer.parseInt(cmbCodigoCurso.getSelectedItem().toString()));
            banco.parametro.setString(7, txtEndereco.getText());
            banco.parametro.setString(8, txtNumero.getText());
            banco.parametro.setString(9, fmtCEP.getText());
            banco.parametro.setString(10, fmtContato.getText());
            banco.parametro.setString(11, txtEmail.getText());
            banco.parametro.setString(12, fmtDataMatricula.getText());
            
            banco.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        }
        
        banco.desconectar();
        
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCurso;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbCodigoCurso;
    private javax.swing.JComboBox<String> cmbDescricaoCurso;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JFormattedTextField fmtCEP;
    private javax.swing.JFormattedTextField fmtCPF;
    private javax.swing.JFormattedTextField fmtContato;
    private javax.swing.JFormattedTextField fmtDataMatricula;
    private javax.swing.JFormattedTextField fmtDataNascimento;
    private javax.swing.JFormattedTextField fmtRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
