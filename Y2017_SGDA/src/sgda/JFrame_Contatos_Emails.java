package sgda;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrame_Contatos_Emails extends javax.swing.JFrame {

    public JFrame_Contatos_Emails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JTabbedGeral = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        JTabbedCâmpus = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnLCCâmpusContatos = new javax.swing.JButton();
        btnIDCâmpusContatos = new javax.swing.JButton();
        fmtContatoCâmpus = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnLCCâmpusEmails = new javax.swing.JButton();
        btnIDCâmpusEmails = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtEmailCâmpus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbNomeCâmpus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbCódigoCâmpus = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        JTabbedPessoas = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        btnLCPessoasContatos = new javax.swing.JButton();
        btnIDPessoasContatos = new javax.swing.JButton();
        fmtContatoPessoas = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnLCPessoasEmails = new javax.swing.JButton();
        btnIDPessoasEmails = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmailPessoas = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cmbCódigoPessoa = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cmbNomePessoa = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Contatos e Emails");
        setResizable(false);

        lblImagem.setBackground(new java.awt.Color(255, 255, 255));

        JTabbedGeral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JTabbedGeralStateChanged(evt);
            }
        });

        btnLCCâmpusContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCCâmpusContatos.setText("Limpar Campos");
        btnLCCâmpusContatos.setToolTipText("");
        btnLCCâmpusContatos.setActionCommand("Inserir");
        btnLCCâmpusContatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCCâmpusContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCCâmpusContatosActionPerformed(evt);
            }
        });

        btnIDCâmpusContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDCâmpusContatos.setText("Inserir Dados");
        btnIDCâmpusContatos.setToolTipText("");
        btnIDCâmpusContatos.setActionCommand("Inserir");
        btnIDCâmpusContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDCâmpusContatosActionPerformed(evt);
            }
        });

        try {
            fmtContatoCâmpus.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtContatoCâmpus.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Contato:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(btnLCCâmpusContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIDCâmpusContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fmtContatoCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtContatoCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDCâmpusContatos)
                    .addComponent(btnLCCâmpusContatos))
                .addContainerGap())
        );

        JTabbedCâmpus.addTab("Contatos", jPanel4);

        btnLCCâmpusEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCCâmpusEmails.setText("Limpar Campos");
        btnLCCâmpusEmails.setToolTipText("");
        btnLCCâmpusEmails.setActionCommand("Inserir");
        btnLCCâmpusEmails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCCâmpusEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCCâmpusEmailsActionPerformed(evt);
            }
        });

        btnIDCâmpusEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDCâmpusEmails.setText("Inserir Dados");
        btnIDCâmpusEmails.setToolTipText("");
        btnIDCâmpusEmails.setActionCommand("Inserir");
        btnIDCâmpusEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDCâmpusEmailsActionPerformed(evt);
            }
        });

        jLabel2.setText("Email:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(btnLCCâmpusEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIDCâmpusEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtEmailCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDCâmpusEmails)
                    .addComponent(btnLCCâmpusEmails))
                .addContainerGap())
        );

        JTabbedCâmpus.addTab("Emails", jPanel5);

        JTabbedCâmpus.setSelectedIndex(-1);

        jLabel5.setText("Câmpus:");

        cmbNomeCâmpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomeCâmpusActionPerformed(evt);
            }
        });

        jLabel6.setText("Código:");

        cmbCódigoCâmpus.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedCâmpus)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNomeCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbCódigoCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNomeCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCódigoCâmpus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTabbedCâmpus)
                .addContainerGap())
        );

        JTabbedGeral.addTab("Câmpus", jPanel2);

        btnLCPessoasContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCPessoasContatos.setText("Limpar Campos");
        btnLCPessoasContatos.setToolTipText("");
        btnLCPessoasContatos.setActionCommand("Inserir");
        btnLCPessoasContatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCPessoasContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCPessoasContatosActionPerformed(evt);
            }
        });

        btnIDPessoasContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDPessoasContatos.setText("Inserir Dados");
        btnIDPessoasContatos.setToolTipText("");
        btnIDPessoasContatos.setActionCommand("Inserir");
        btnIDPessoasContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDPessoasContatosActionPerformed(evt);
            }
        });

        try {
            fmtContatoPessoas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtContatoPessoas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Contato:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(btnLCPessoasContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIDPessoasContatos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fmtContatoPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtContatoPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDPessoasContatos)
                    .addComponent(btnLCPessoasContatos))
                .addContainerGap())
        );

        JTabbedPessoas.addTab("Contatos", jPanel8);

        btnLCPessoasEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCPessoasEmails.setText("Limpar Campos");
        btnLCPessoasEmails.setToolTipText("");
        btnLCPessoasEmails.setActionCommand("Inserir");
        btnLCPessoasEmails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCPessoasEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCPessoasEmailsActionPerformed(evt);
            }
        });

        btnIDPessoasEmails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDPessoasEmails.setText("Inserir Dados");
        btnIDPessoasEmails.setToolTipText("");
        btnIDPessoasEmails.setActionCommand("Inserir");
        btnIDPessoasEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDPessoasEmailsActionPerformed(evt);
            }
        });

        jLabel4.setText("Email:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addComponent(btnLCPessoasEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIDPessoasEmails, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtEmailPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDPessoasEmails)
                    .addComponent(btnLCPessoasEmails))
                .addContainerGap())
        );

        JTabbedPessoas.addTab("Emails", jPanel9);

        JTabbedPessoas.setSelectedIndex(-1);

        jLabel27.setText("Código:");

        cmbCódigoPessoa.setEnabled(false);

        jLabel16.setText("Nome da Pessoa:");

        cmbNomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomePessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedPessoas)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27)
                            .addComponent(cmbCódigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCódigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JTabbedPessoas)
                .addContainerGap())
        );

        JTabbedGeral.addTab("Pessoas", jPanel3);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/cross.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedGeral)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabbedGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNomeCâmpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomeCâmpusActionPerformed
        cmbCódigoCâmpus.setSelectedIndex(cmbNomeCâmpus.getSelectedIndex());
    }//GEN-LAST:event_cmbNomeCâmpusActionPerformed

    private void cmbNomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomePessoaActionPerformed
        cmbCódigoPessoa.setSelectedIndex(cmbNomePessoa.getSelectedIndex());
    }//GEN-LAST:event_cmbNomePessoaActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void JTabbedGeralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JTabbedGeralStateChanged
        if (JTabbedGeral.getSelectedIndex() == 0) {
            atualizarDados(cmbCódigoCâmpus, cmbNomeCâmpus, "id_campus", "razao_social", "campus");
            JTabbedCâmpus.setSelectedIndex(-1);
            
        }
        else if (JTabbedGeral.getSelectedIndex() == 1) {
            atualizarDados(cmbCódigoPessoa, cmbNomePessoa, "id_pessoa", "nome", "pessoa");
            JTabbedPessoas.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_JTabbedGeralStateChanged

    private void limparCamposCâmpus() {
        if (JTabbedCâmpus.getSelectedIndex() == 0) {
            fmtContatoCâmpus.setText(null);
            fmtContatoCâmpus.grabFocus();
        }
        else if (JTabbedCâmpus.getSelectedIndex() == 1) {
            txtEmailCâmpus.setText(null);
            txtEmailCâmpus.grabFocus();
        }
    }
    
    private void btnLCCâmpusContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCCâmpusContatosActionPerformed
        limparCamposCâmpus();
    }//GEN-LAST:event_btnLCCâmpusContatosActionPerformed

    private void limparCamposPessoas() {        
        if (JTabbedPessoas.getSelectedIndex() == 0) {
            fmtContatoPessoas.setText(null);
            fmtContatoPessoas.grabFocus();
        }
        else if (JTabbedPessoas.getSelectedIndex() == 1) {
            txtEmailPessoas.setText(null);
            txtEmailPessoas.grabFocus();
        }
    }
    
    private void btnLCPessoasContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCPessoasContatosActionPerformed
        limparCamposPessoas();
    }//GEN-LAST:event_btnLCPessoasContatosActionPerformed

    private void inserirDadosCâmpus(JComboBox comboCódigo, JTextField campoDados, String tabela) {
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO " + tabela + " VALUES (?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, comboCódigo.getSelectedItem().toString());
            database.parametro.setString(2, campoDados.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposCâmpus();
            cmbNomeCâmpus.setSelectedIndex(-1);
            cmbNomeCâmpus.grabFocus();
            JTabbedCâmpus.setSelectedIndex(-1);
        } 
    }
    
    private void inserirDadosCâmpus(JComboBox comboCódigo, JFormattedTextField campoDados, String tabela) {
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO " + tabela + " VALUES (?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, comboCódigo.getSelectedItem().toString());
            database.parametro.setString(2, campoDados.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposCâmpus();
            cmbNomeCâmpus.setSelectedIndex(-1);
            cmbNomeCâmpus.grabFocus();
            JTabbedCâmpus.setSelectedIndex(-1);
        } 
    }
    
    private void btnIDCâmpusContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDCâmpusContatosActionPerformed
        inserirDadosCâmpus(cmbCódigoCâmpus, fmtContatoCâmpus, "campus_contato");
    }//GEN-LAST:event_btnIDCâmpusContatosActionPerformed

    private void btnIDCâmpusEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDCâmpusEmailsActionPerformed
        inserirDadosCâmpus(cmbCódigoCâmpus, txtEmailCâmpus, "campus_email");
    }//GEN-LAST:event_btnIDCâmpusEmailsActionPerformed
    
    private void inserirDadosPessoas(JComboBox comboCódigo, JFormattedTextField campoDados, String tabela) {
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO " + tabela + " VALUES (?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, comboCódigo.getSelectedItem().toString());
            database.parametro.setString(2, campoDados.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposPessoas();
            cmbNomePessoa.setSelectedIndex(-1);
            cmbNomePessoa.grabFocus();
            JTabbedPessoas.setSelectedIndex(-1);
        } 
    }   
    
    private void inserirDadosPessoas(JComboBox comboCódigo, JTextField campoDados, String tabela) {
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO " + tabela + " VALUES (?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, comboCódigo.getSelectedItem().toString());
            database.parametro.setString(2, campoDados.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposPessoas();
            cmbNomePessoa.setSelectedIndex(-1);
            cmbNomePessoa.grabFocus();
            JTabbedPessoas.setSelectedIndex(-1);
        } 
    }
    
    private void btnIDPessoasContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDPessoasContatosActionPerformed
        inserirDadosPessoas(cmbCódigoPessoa, fmtContatoCâmpus, "pessoa_contato");
    }//GEN-LAST:event_btnIDPessoasContatosActionPerformed

    private void btnIDPessoasEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDPessoasEmailsActionPerformed
        inserirDadosPessoas(cmbCódigoPessoa, txtEmailPessoas, "pessoa_email");
    }//GEN-LAST:event_btnIDPessoasEmailsActionPerformed

    private void btnLCCâmpusEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCCâmpusEmailsActionPerformed
        limparCamposCâmpus();
    }//GEN-LAST:event_btnLCCâmpusEmailsActionPerformed

    private void btnLCPessoasEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCPessoasEmailsActionPerformed
        limparCamposPessoas();
    }//GEN-LAST:event_btnLCPessoasEmailsActionPerformed
    
    public JClass_Database database = new JClass_Database();
    public int erro;
    
    private void atualizarDados(JComboBox comboCodigo, JComboBox comboNome, String codigo, String nome, String tabela) {
        List <String> listaCódigo = new ArrayList <> (); 
        List <String> listaNome = new ArrayList <> (); 
        
        database.conectar();
        database.setComando("SELECT * FROM " + tabela);
        database.parametrizar();
        database.consultar();
        
        try {
            while (database.resultado.next()) {
                listaCódigo.add(database.resultado.getString(codigo));
                listaNome.add(database.resultado.getString(nome));                
            }
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        } finally {
            database.desconectar();  
        }
        
        DefaultComboBoxModel modelCodigo = new DefaultComboBoxModel(listaCódigo.toArray());
        comboCodigo.setModel(modelCodigo);  
        
        DefaultComboBoxModel modelNome = new DefaultComboBoxModel(listaNome.toArray());
        comboNome.setModel(modelNome);
        
        comboNome.setSelectedIndex(-1); 
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_Contatos_Emails().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedCâmpus;
    private javax.swing.JTabbedPane JTabbedGeral;
    private javax.swing.JTabbedPane JTabbedPessoas;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIDCâmpusContatos;
    private javax.swing.JButton btnIDCâmpusEmails;
    private javax.swing.JButton btnIDPessoasContatos;
    private javax.swing.JButton btnIDPessoasEmails;
    private javax.swing.JButton btnLCCâmpusContatos;
    private javax.swing.JButton btnLCCâmpusEmails;
    private javax.swing.JButton btnLCPessoasContatos;
    private javax.swing.JButton btnLCPessoasEmails;
    private javax.swing.JComboBox<String> cmbCódigoCâmpus;
    private javax.swing.JComboBox<String> cmbCódigoPessoa;
    private javax.swing.JComboBox<String> cmbNomeCâmpus;
    private javax.swing.JComboBox<String> cmbNomePessoa;
    private javax.swing.JFormattedTextField fmtContatoCâmpus;
    private javax.swing.JFormattedTextField fmtContatoPessoas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtEmailCâmpus;
    private javax.swing.JTextField txtEmailPessoas;
    // End of variables declaration//GEN-END:variables
}
