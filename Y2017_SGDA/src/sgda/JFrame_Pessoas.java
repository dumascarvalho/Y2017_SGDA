package sgda;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class JFrame_Pessoas extends javax.swing.JFrame {

    public JFrame_Pessoas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        JTabbedGeral = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
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
        txtRua = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        fmtCEP = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        JTabbedEspecífico = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnLCAlunos = new javax.swing.JButton();
        btnIDAlunos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        fmtDataMátricula = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        cmbNomeCurso = new javax.swing.JComboBox<>();
        cmbCódigoCurso = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLCDocentes = new javax.swing.JButton();
        btnIDDocentes = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbFormação = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbNível = new javax.swing.JComboBox<>();
        fmtSalárioDocente = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnLCFuncionários = new javax.swing.JButton();
        btnIDFuncionários = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        cmbNomeOcupação = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cmbCódigoOcupação = new javax.swing.JComboBox<>();
        fmtSalárioFuncionário = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        cmbCódigoPessoa = new javax.swing.JComboBox<>();
        cmbNomePessoa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoas");
        setResizable(false);

        JTabbedGeral.setAutoscrolls(true);
        JTabbedGeral.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JTabbedGeralStateChanged(evt);
            }
        });

        jLabel1.setText("Nome da Pessoa:");

        jLabel2.setText("Gênero:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outros" }));
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
        fmtDataNascimento.setToolTipText("Formato: AAAA/MM/DD");
        fmtDataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fmtDataNascimentoKeyPressed(evt);
            }
        });

        jLabel6.setText("Rua:");

        jLabel9.setText("Bairro:");

        jLabel10.setText("Cidade:");

        jLabel11.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        cmbEstado.setSelectedIndex(-1);

        jLabel12.setText("Número:");

        btnLimparCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.setToolTipText("");
        btnLimparCampos.setActionCommand("Inserir");
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnInserirDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnInserirDados.setText("Inserir Dados");
        btnInserirDados.setToolTipText("");
        btnInserirDados.setActionCommand("Inserir");
        btnInserirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirDadosActionPerformed(evt);
            }
        });

        jLabel16.setText("CEP:");

        try {
            fmtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnInserirDados, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fmtRG, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtBairro)
                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCidade)
                            .addComponent(jLabel12)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmtCEP))
                        .addContainerGap(67, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fmtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirDados)
                    .addComponent(btnLimparCampos))
                .addContainerGap())
        );

        JTabbedGeral.addTab("Dados Pessoais", jPanel1);

        btnLCAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCAlunos.setText("Limpar Campos");
        btnLCAlunos.setToolTipText("");
        btnLCAlunos.setActionCommand("Inserir");
        btnLCAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCAlunosActionPerformed(evt);
            }
        });

        btnIDAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDAlunos.setText("Inserir Dados");
        btnIDAlunos.setToolTipText("");
        btnIDAlunos.setActionCommand("Inserir");
        btnIDAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDAlunosActionPerformed(evt);
            }
        });

        jLabel20.setText("Data de Matrícula:");

        fmtDataMátricula.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        fmtDataMátricula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmtDataMátricula.setToolTipText("Formato: AAAA/MM/DD");
        fmtDataMátricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fmtDataMátriculaKeyPressed(evt);
            }
        });

        jLabel21.setText("Descrição do Curso:");

        cmbNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomeCursoActionPerformed(evt);
            }
        });

        cmbCódigoCurso.setEnabled(false);

        jLabel22.setText("Código:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addComponent(btnLCAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIDAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(cmbNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(cmbCódigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fmtDataMátricula, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCódigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtDataMátricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDAlunos)
                    .addComponent(btnLCAlunos))
                .addContainerGap())
        );

        JTabbedEspecífico.addTab("Alunos", jPanel3);

        btnLCDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCDocentes.setText("Limpar Campos");
        btnLCDocentes.setToolTipText("");
        btnLCDocentes.setActionCommand("Inserir");
        btnLCDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCDocentesActionPerformed(evt);
            }
        });

        btnIDDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDDocentes.setText("Inserir Dados");
        btnIDDocentes.setToolTipText("");
        btnIDDocentes.setActionCommand("Inserir");
        btnIDDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDDocentesActionPerformed(evt);
            }
        });

        jLabel13.setText("Formação:");

        cmbFormação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bacharelado", "Licenciatura", "Especializado", "Pós-Graduação", "Mestrado", "Doutorado" }));
        cmbFormação.setSelectedIndex(-1);

        jLabel14.setText("Nível:");

        cmbNível.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Médio", "Técnico", "Superior" }));
        cmbNível.setSelectedIndex(-1);

        fmtSalárioDocente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmtSalárioDocente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel15.setText("Salário:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbNível, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                .addComponent(cmbFormação, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                                .addComponent(fmtSalárioDocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 180, Short.MAX_VALUE)
                        .addComponent(btnLCDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIDDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFormação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbNível, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtSalárioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDDocentes)
                    .addComponent(btnLCDocentes))
                .addContainerGap())
        );

        JTabbedEspecífico.addTab("Docentes", jPanel4);

        btnLCFuncionários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/application_form_delete.png"))); // NOI18N
        btnLCFuncionários.setText("Limpar Campos");
        btnLCFuncionários.setToolTipText("");
        btnLCFuncionários.setActionCommand("Inserir");
        btnLCFuncionários.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLCFuncionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLCFuncionáriosActionPerformed(evt);
            }
        });

        btnIDFuncionários.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/database_add.png"))); // NOI18N
        btnIDFuncionários.setText("Inserir Dados");
        btnIDFuncionários.setToolTipText("");
        btnIDFuncionários.setActionCommand("Inserir");
        btnIDFuncionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDFuncionáriosActionPerformed(evt);
            }
        });

        jLabel23.setText("Ocupação:");

        cmbNomeOcupação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomeOcupaçãoActionPerformed(evt);
            }
        });

        jLabel24.setText("Código:");

        cmbCódigoOcupação.setEnabled(false);

        fmtSalárioFuncionário.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fmtSalárioFuncionário.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setText("Salário:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(fmtSalárioFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(cmbNomeOcupação, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cmbCódigoOcupação, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLCFuncionários, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIDFuncionários, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNomeOcupação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCódigoOcupação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtSalárioFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIDFuncionários)
                    .addComponent(btnLCFuncionários))
                .addContainerGap())
        );

        JTabbedEspecífico.addTab("Funcionários", jPanel5);

        JTabbedEspecífico.setSelectedIndex(-1);

        cmbCódigoPessoa.setEnabled(false);

        cmbNomePessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNomePessoaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome da Pessoa:");

        jLabel8.setText("Código:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedEspecífico)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbNomePessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cmbCódigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCódigoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(JTabbedEspecífico)
                .addContainerGap())
        );

        JTabbedGeral.addTab("Atribuições", jPanel2);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sgda/imagens/cross.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTabbedGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTabbedGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public JClass_Formatar formatar = new JClass_Formatar();
    
    private void fmtDataNascimentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataNascimentoKeyPressed
        formatar.formataçãoData(fmtDataNascimento, evt);
    }//GEN-LAST:event_fmtDataNascimentoKeyPressed

    private void JTabbedGeralStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JTabbedGeralStateChanged
        JTabbedEspecífico.setSelectedIndex(-1);
        cmbNomePessoa.setSelectedIndex(-1);       
        if (JTabbedGeral.getSelectedIndex() == 1) {
            atualizarDados(cmbCódigoPessoa, cmbNomePessoa, "id_pessoa", "nome", "pessoa");
            atualizarDados(cmbCódigoCurso, cmbNomeCurso, "id_curso", "descricao", "curso");
            atualizarDados(cmbCódigoOcupação, cmbNomeOcupação, "id_cargo", "descricao", "cargo");   
        }
        limparCamposAlunos();
        limparCamposDocentes();
        limparCamposFuncionários();         
    }//GEN-LAST:event_JTabbedGeralStateChanged

    private void limparCampos() {
        txtNome.setText(null);
        cmbGenero.setSelectedIndex(-1);
        fmtRG.setText(null);
        fmtCPF.setText(null);
        fmtDataNascimento.setText(null);
        txtRua.setText(null);
        txtNumero.setText(null);
        txtBairro.setText(null);
        txtCidade.setText(null);
        cmbEstado.setSelectedIndex(-1);
        fmtCEP.setText(null);
        txtNome.grabFocus();
    }
    
    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnInserirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirDadosActionPerformed
        inserirDados();
    }//GEN-LAST:event_btnInserirDadosActionPerformed

    private void inserirDados() {
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO pessoa VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, txtNome.getText());
            database.parametro.setString(2, cmbGenero.getSelectedItem().toString());
            database.parametro.setString(3, fmtRG.getText());
            database.parametro.setString(4, fmtCPF.getText());
            database.parametro.setString(5, fmtDataNascimento.getText());
            database.parametro.setString(6, txtRua.getText());
            database.parametro.setString(7, txtNumero.getText());
            database.parametro.setString(8, txtBairro.getText());
            database.parametro.setString(9, txtCidade.getText());
            database.parametro.setString(10, cmbEstado.getSelectedItem().toString());  
            database.parametro.setString(11, fmtCEP.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        } 
    }
    
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cmbNomeOcupaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomeOcupaçãoActionPerformed
        cmbCódigoOcupação.setSelectedIndex(cmbNomeOcupação.getSelectedIndex());
    }//GEN-LAST:event_cmbNomeOcupaçãoActionPerformed

    private void cmbNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomeCursoActionPerformed
        cmbCódigoCurso.setSelectedIndex(cmbNomeCurso.getSelectedIndex());
    }//GEN-LAST:event_cmbNomeCursoActionPerformed

    private void fmtDataMátriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmtDataMátriculaKeyPressed
        formatar.formataçãoData(fmtDataMátricula, evt);
    }//GEN-LAST:event_fmtDataMátriculaKeyPressed

    private void cmbNomePessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNomePessoaActionPerformed
        cmbCódigoPessoa.setSelectedIndex(cmbNomePessoa.getSelectedIndex());
    }//GEN-LAST:event_cmbNomePessoaActionPerformed

    private void limparCamposAlunos() {
        cmbNomeCurso.setSelectedIndex(-1);
        fmtDataMátricula.setText(null);
        cmbNomeCurso.grabFocus();
    }
    
    private void btnLCAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCAlunosActionPerformed
        limparCamposAlunos();
    }//GEN-LAST:event_btnLCAlunosActionPerformed

    private void btnIDAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDAlunosActionPerformed
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO aluno VALUES (NULL, ?, ?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, cmbCódigoPessoa.getSelectedItem().toString());
            database.parametro.setString(2, cmbCódigoCurso.getSelectedItem().toString());
            database.parametro.setString(3, fmtDataMátricula.getText());
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposAlunos();
            cmbNomePessoa.setSelectedIndex(-1);
            JTabbedEspecífico.setSelectedIndex(-1);
            cmbNomePessoa.grabFocus();
        } 
    }//GEN-LAST:event_btnIDAlunosActionPerformed
    
    private void limparCamposDocentes() {
        cmbFormação.setSelectedIndex(-1);
        cmbNível.setSelectedIndex(-1);
        fmtSalárioDocente.setText(null);
        cmbFormação.grabFocus();
    }
    
    private void btnLCDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCDocentesActionPerformed
        limparCamposDocentes();
    }//GEN-LAST:event_btnLCDocentesActionPerformed

    private void btnIDDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDDocentesActionPerformed
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO docente VALUES (NULL, ?, ?, ?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, cmbCódigoPessoa.getSelectedItem().toString());
            database.parametro.setString(2, cmbFormação.getSelectedItem().toString());
            database.parametro.setString(3, cmbNível.getSelectedItem().toString());
            database.parametro.setBigDecimal(4, new BigDecimal(fmtSalárioDocente.getText().replace(",", ".")));
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposDocentes();
            cmbNomePessoa.setSelectedIndex(-1);
            JTabbedEspecífico.setSelectedIndex(-1);
            cmbNomePessoa.grabFocus();
        } 
    }//GEN-LAST:event_btnIDDocentesActionPerformed
    
    private void limparCamposFuncionários() {
        cmbNomeOcupação.setSelectedIndex(-1);
        fmtSalárioFuncionário.setText(null);
        cmbNomeOcupação.grabFocus();
    }
    
    private void btnLCFuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLCFuncionáriosActionPerformed
        limparCamposFuncionários();
    }//GEN-LAST:event_btnLCFuncionáriosActionPerformed

    private void btnIDFuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDFuncionáriosActionPerformed
        erro = 0;   
        database.conectar();
        database.setComando("INSERT INTO funcionario VALUES (NULL, ?, ?, ?)");
        database.parametrizar();

        try {
            database.parametro.setString(1, cmbCódigoPessoa.getSelectedItem().toString());
            database.parametro.setString(2, cmbCódigoOcupação.getSelectedItem().toString());
            database.parametro.setBigDecimal(3, new BigDecimal(fmtSalárioFuncionário.getText().replace(",", ".")));
            database.parametro.execute();
        } catch (SQLException | NullPointerException ex) {
            JOptionPane.showConfirmDialog(this, "Algum campo encontra-se vazio ou em formato inválido!\n\nInformações técnicas sobre o erro: " + ex, "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            erro = 1;
        } finally {
            database.desconectar();  
        }      
        if (erro != 1) { 
            JOptionPane.showConfirmDialog(this, "Os dados foram inseridos com sucesso!", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limparCamposFuncionários();
            cmbNomePessoa.setSelectedIndex(-1);
            JTabbedEspecífico.setSelectedIndex(-1);
            cmbNomePessoa.grabFocus();
        } 
    }//GEN-LAST:event_btnIDFuncionáriosActionPerformed

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
    
    public JClass_Database database = new JClass_Database();
    public int erro;  
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_Pessoas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedEspecífico;
    private javax.swing.JTabbedPane JTabbedGeral;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIDAlunos;
    private javax.swing.JButton btnIDDocentes;
    private javax.swing.JButton btnIDFuncionários;
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLCAlunos;
    private javax.swing.JButton btnLCDocentes;
    private javax.swing.JButton btnLCFuncionários;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbCódigoCurso;
    private javax.swing.JComboBox<String> cmbCódigoOcupação;
    private javax.swing.JComboBox<String> cmbCódigoPessoa;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbFormação;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbNomeCurso;
    private javax.swing.JComboBox<String> cmbNomeOcupação;
    private javax.swing.JComboBox<String> cmbNomePessoa;
    private javax.swing.JComboBox<String> cmbNível;
    private javax.swing.JFormattedTextField fmtCEP;
    private javax.swing.JFormattedTextField fmtCPF;
    private javax.swing.JFormattedTextField fmtDataMátricula;
    private javax.swing.JFormattedTextField fmtDataNascimento;
    private javax.swing.JFormattedTextField fmtRG;
    private javax.swing.JFormattedTextField fmtSalárioDocente;
    private javax.swing.JFormattedTextField fmtSalárioFuncionário;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
