package projeto_sgda;

import java.math.BigDecimal;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JPanel_Funcionários extends javax.swing.JPanel {

    public JPanel_Funcionários() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fmtRG = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        fmtCPF = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        fmtDataNascimento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fmtCEP = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        fmtSalario = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        fmtContato = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        fmtDataAdmissao = new javax.swing.JFormattedTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_funcionarios.png"))); // NOI18N

        jLabel1.setText("Nome do Funcionário:");

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

        jLabel6.setText("Endereço:");

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Nº:");

        try {
            fmtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("CEP:");

        jLabel9.setText("Contato:");

        jLabel10.setText("E-mail:");

        jLabel11.setText("Cargo:");

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor(a) (Superior)", "Professor(a) (Técnico)", "Secretário(a)", "Orientador(a)", "Coordenador(a) de Curso", "Responsável Técnico", "Reitor(a)", "Servente", "N/A", " " }));
        cmbCargo.setSelectedIndex(-1);

        fmtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmtSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Salário:");

        try {
            fmtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtContato.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setText("Data de Admissão:");

        fmtDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        fmtDataAdmissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmtDataAdmissao.setToolTipText("Formato da Data: aaaa/mm/dd");
        fmtDataAdmissao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fmtDataAdmissaoKeyPressed(evt);
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fmtRG, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5)
                    .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail)
                        .addComponent(cmbCargo, 0, 210, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addComponent(fmtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(fmtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
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
    
    private void fmtDataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataNascimentoKeyPressed
       formatar.formataçãoData(fmtDataNascimento, evt);
    }//GEN-LAST:event_fmtDataNascimentoKeyPressed

    private void fmtDataAdmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataAdmissaoKeyPressed
       formatar.formataçãoData(fmtDataAdmissao, evt);
    }//GEN-LAST:event_fmtDataAdmissaoKeyPressed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        inserirDados();
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    public Conexão_SGDA banco = new Conexão_SGDA();
    public int erro;
    
    private void inserirDados() {
        erro = 0;
        banco.conectar();
        banco.setComando("INSERT INTO funcionarios (cod_funcionario, nome, genero, rg, cpf, dtnasc, endereco, num, cep, contato, email, cargo, salario, dtadmissao) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        banco.parametrizar();

        try {
            banco.parametro.setString(1, txtNome.getText());
            banco.parametro.setString(2, cmbGenero.getSelectedItem().toString());
            banco.parametro.setString(3, fmtRG.getText());
            banco.parametro.setString(4, fmtCPF.getText());
            banco.parametro.setString(5, fmtDataNascimento.getText());
            banco.parametro.setString(6, txtEndereco.getText());
            banco.parametro.setString(7, txtNumero.getText());
            banco.parametro.setString(8, fmtCEP.getText());
            banco.parametro.setString(9, fmtContato.getText());
            banco.parametro.setString(10, txtEmail.getText());
            banco.parametro.setString(11, cmbCargo.getSelectedItem().toString());
            banco.parametro.setBigDecimal(12, new BigDecimal(fmtSalario.getText().replace(",", ".")));
            banco.parametro.setString(13, fmtDataAdmissao.getText());
            
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
    
    private void limparCampos() {
        txtNome.setText(null);
        cmbGenero.setSelectedIndex(-1);
        fmtRG.setText(null);
        fmtCPF.setText(null);
        fmtDataNascimento.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        fmtCEP.setText(null);
        fmtContato.setText(null);
        txtEmail.setText(null);
        cmbCargo.setSelectedIndex(-1);
        fmtSalario.setText(null);
        fmtDataAdmissao.setText(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JFormattedTextField fmtCEP;
    private javax.swing.JFormattedTextField fmtCPF;
    private javax.swing.JFormattedTextField fmtContato;
    private javax.swing.JFormattedTextField fmtDataAdmissao;
    private javax.swing.JFormattedTextField fmtDataNascimento;
    private javax.swing.JFormattedTextField fmtRG;
    private javax.swing.JFormattedTextField fmtSalario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
