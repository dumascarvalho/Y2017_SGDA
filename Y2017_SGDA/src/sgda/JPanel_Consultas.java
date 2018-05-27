package sgda;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JPanel_Consultas extends javax.swing.JPanel {

    public JPanel_Consultas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGeral = new javax.swing.ButtonGroup();
        btnGroupContatos = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        JTabbedConsultas = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rdoCâmpus = new javax.swing.JRadioButton();
        rdoCursos = new javax.swing.JRadioButton();
        rdoAlunos = new javax.swing.JRadioButton();
        rdoDocentes = new javax.swing.JRadioButton();
        rdoFuncionários = new javax.swing.JRadioButton();
        rdoOcupações = new javax.swing.JRadioButton();
        rdoDisciplinas = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        lblQuantidadeAulas = new javax.swing.JLabel();
        sliQuantidade = new javax.swing.JSlider();
        btnRelaçãoDisciplinasDocentes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cmbCurso = new javax.swing.JComboBox<>();
        btnRelaçãoCursosDisciplinas = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNomeDocente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbDisciplinas = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        txtNomePessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdoContatosAlunos = new javax.swing.JRadioButton();
        rdoContatosDocentes = new javax.swing.JRadioButton();
        rdoContatosFuncionários = new javax.swing.JRadioButton();
        rdoContatosCâmpus = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnEmailCâmpus = new javax.swing.JButton();
        btnEmailPessoas = new javax.swing.JButton();

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setPreferredSize(new java.awt.Dimension(680, 70));

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaDados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tabelaDados);

        JTabbedConsultas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JTabbedConsultasStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rdoCâmpus.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoCâmpus);
        rdoCâmpus.setText("Câmpus");
        rdoCâmpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCâmpusActionPerformed(evt);
            }
        });

        rdoCursos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoCursos);
        rdoCursos.setText("Cursos");
        rdoCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCursosActionPerformed(evt);
            }
        });

        rdoAlunos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoAlunos);
        rdoAlunos.setText("Alunos");
        rdoAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAlunosActionPerformed(evt);
            }
        });

        rdoDocentes.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoDocentes);
        rdoDocentes.setText("Docentes");
        rdoDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDocentesActionPerformed(evt);
            }
        });

        rdoFuncionários.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoFuncionários);
        rdoFuncionários.setText("Funcionários");
        rdoFuncionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFuncionáriosActionPerformed(evt);
            }
        });

        rdoOcupações.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoOcupações);
        rdoOcupações.setText("Ocupações");
        rdoOcupações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoOcupaçõesActionPerformed(evt);
            }
        });

        rdoDisciplinas.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupGeral.add(rdoDisciplinas);
        rdoDisciplinas.setText("Disciplinas");
        rdoDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDisciplinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(rdoCâmpus)
                .addGap(18, 18, 18)
                .addComponent(rdoCursos)
                .addGap(18, 18, 18)
                .addComponent(rdoDisciplinas)
                .addGap(18, 18, 18)
                .addComponent(rdoOcupações)
                .addGap(18, 18, 18)
                .addComponent(rdoAlunos)
                .addGap(18, 18, 18)
                .addComponent(rdoDocentes)
                .addGap(18, 18, 18)
                .addComponent(rdoFuncionários, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCâmpus)
                    .addComponent(rdoCursos)
                    .addComponent(rdoAlunos)
                    .addComponent(rdoDocentes)
                    .addComponent(rdoFuncionários)
                    .addComponent(rdoOcupações)
                    .addComponent(rdoDisciplinas))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JTabbedConsultas.addTab("Geral", jPanel3);

        lblQuantidadeAulas.setText("Pesquisa por Quantidade de Aulas:");

        sliQuantidade.setValue(0);
        sliQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliQuantidadeStateChanged(evt);
            }
        });

        btnRelaçãoDisciplinasDocentes.setText("Relação de Docentes e Disciplinas");
        btnRelaçãoDisciplinasDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelaçãoDisciplinasDocentesActionPerformed(evt);
            }
        });

        jLabel9.setText("Pesquisa por Curso:");

        cmbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCursoActionPerformed(evt);
            }
        });

        btnRelaçãoCursosDisciplinas.setText("Relação de Cursos e Disciplinas");
        btnRelaçãoCursosDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelaçãoCursosDisciplinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(lblQuantidadeAulas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRelaçãoDisciplinasDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(btnRelaçãoCursosDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRelaçãoCursosDisciplinas)
                            .addComponent(btnRelaçãoDisciplinasDocentes)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblQuantidadeAulas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sliQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        JTabbedConsultas.addTab("Cursos e Disciplinas", jPanel7);

        jLabel1.setText("Pesquisa por Nome:");

        txtNomeAluno.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeAlunoCaretUpdate(evt);
            }
        });

        jLabel2.setText("Quantidade por Gênero:");

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feminino", "Masculino", "Outros" }));
        cmbGenero.setSelectedIndex(-1);
        cmbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTabbedConsultas.addTab("Alunos", jPanel4);

        jLabel3.setText("Pesquisa por Nome:");

        txtNomeDocente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomeDocenteCaretUpdate(evt);
            }
        });

        jLabel4.setText("Pequisa por Disciplina:");

        cmbDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisciplinasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(cmbDisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(437, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        JTabbedConsultas.addTab("Docentes", jPanel5);

        txtNomePessoa.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNomePessoaCaretUpdate(evt);
            }
        });

        jLabel5.setText("Pesquisa por Nome:");

        btnGroupContatos.add(rdoContatosAlunos);
        rdoContatosAlunos.setText("Alunos");
        rdoContatosAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoContatosAlunosActionPerformed(evt);
            }
        });

        btnGroupContatos.add(rdoContatosDocentes);
        rdoContatosDocentes.setText("Docentes");
        rdoContatosDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoContatosDocentesActionPerformed(evt);
            }
        });

        btnGroupContatos.add(rdoContatosFuncionários);
        rdoContatosFuncionários.setText("Funcionários");
        rdoContatosFuncionários.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoContatosFuncionáriosActionPerformed(evt);
            }
        });

        btnGroupContatos.add(rdoContatosCâmpus);
        rdoContatosCâmpus.setText("Câmpus");
        rdoContatosCâmpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoContatosCâmpusActionPerformed(evt);
            }
        });

        jLabel6.setText("Contatos por Tipo:");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Emails:  "));

        btnEmailCâmpus.setText("Câmpus");
        btnEmailCâmpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailCâmpusActionPerformed(evt);
            }
        });

        btnEmailPessoas.setText("Pessoas");
        btnEmailPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailPessoasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmailCâmpus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmailPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmailCâmpus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnEmailPessoas)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(rdoContatosAlunos)
                        .addGap(18, 18, 18)
                        .addComponent(rdoContatosDocentes)
                        .addGap(18, 18, 18)
                        .addComponent(rdoContatosFuncionários)
                        .addGap(18, 18, 18)
                        .addComponent(rdoContatosCâmpus))
                    .addComponent(jLabel5)
                    .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(80, 80, 80)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoContatosAlunos)
                            .addComponent(rdoContatosDocentes)
                            .addComponent(rdoContatosFuncionários)
                            .addComponent(rdoContatosCâmpus))))
                .addGap(18, 18, 18))
        );

        JTabbedConsultas.addTab("Contatos e Emails", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTabbedConsultas)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblImagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTabbedConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public JClass_Database database = new JClass_Database();
        
    private void preencherTabela(String tabela) {
        try {            
            database.conectar();
            database.setComando(tabela);
            database.parametrizar();
            database.consultar();
            tabelaDados.setModel(JClass_Formatar.colocarDadosTabela(database.resultado)); 
        } catch (Exception ex) {
            System.out.println("\nExceção: " + ex);
        } finally {
            database.desconectar(); 
            tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            JClass_JTable redimensionar = new JClass_JTable(tabelaDados);
            redimensionar.adjustColumns();   
        }
    } 
    
    private void rdoCâmpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCâmpusActionPerformed
        preencherTabela("SELECT * FROM campus");
    }//GEN-LAST:event_rdoCâmpusActionPerformed

    private void rdoCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCursosActionPerformed
        preencherTabela("SELECT id_curso, descricao, periodo, carga_horaria, razao_social AS 'campus' FROM curso, campus WHERE curso.campus = campus.id_campus");
    }//GEN-LAST:event_rdoCursosActionPerformed

    private void rdoAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAlunosActionPerformed
        preencherTabela("SELECT matricula, nome, data_matricula, descricao AS 'curso', genero, rg, cpf, rua, numero, bairro, estado, cep FROM aluno, pessoa, curso WHERE pessoa.id_pessoa = aluno.pessoa AND aluno.curso = curso.id_curso");
    }//GEN-LAST:event_rdoAlunosActionPerformed

    private void rdoDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDocentesActionPerformed
        preencherTabela("SELECT id_docente, nome, formacao, nivel, salario, genero, rg, cpf, rua, numero, bairro, estado, cep FROM docente, pessoa WHERE pessoa.id_pessoa = docente.pessoa");
    }//GEN-LAST:event_rdoDocentesActionPerformed

    private void rdoOcupaçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoOcupaçõesActionPerformed
        preencherTabela("SELECT * FROM cargo");
    }//GEN-LAST:event_rdoOcupaçõesActionPerformed

    private void rdoFuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFuncionáriosActionPerformed
        preencherTabela("SELECT id_funcionario, nome, descricao AS 'cargo', salario, genero, rg, cpf, rua, numero, bairro, estado, cep FROM funcionario, cargo, pessoa WHERE pessoa.id_pessoa = funcionario.pessoa AND funcionario.cargo = cargo.id_cargo");
    }//GEN-LAST:event_rdoFuncionáriosActionPerformed

    private void rdoDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDisciplinasActionPerformed
        preencherTabela("SELECT * FROM disciplina");
    }//GEN-LAST:event_rdoDisciplinasActionPerformed

    private void atualizarDados(JComboBox comboNome, String nome, String tabela) {
        List <String> listaNome = new ArrayList <> (); 
        
        database.conectar();
        database.setComando("SELECT * FROM " + tabela);
        database.parametrizar();
        database.consultar();
        
        try {
            while (database.resultado.next()) {
                listaNome.add(database.resultado.getString(nome));                
            }
        } catch (SQLException ex) {
            System.out.println("\nExceção: " + ex);
        } finally {
            database.desconectar();  
        }
        
        DefaultComboBoxModel modelNome = new DefaultComboBoxModel(listaNome.toArray());
        comboNome.setModel(modelNome);
        
        comboNome.setSelectedIndex(-1); 
    }
    
    private void JTabbedConsultasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JTabbedConsultasStateChanged
        tabelaDados.setModel(new DefaultTableModel());
        if (JTabbedConsultas.getSelectedIndex() == 1) { 
            atualizarDados(cmbCurso, "descricao", "curso"); 
        }
        else if (JTabbedConsultas.getSelectedIndex() == 3) {
            atualizarDados(cmbDisciplinas, "descricao", "disciplina"); 
        }
        limparCampos();
    }//GEN-LAST:event_JTabbedConsultasStateChanged

    private void limparCampos() {
        txtNomeAluno.setText("");
        txtNomeDocente.setText("");
        txtNomePessoa.setText("");
        cmbDisciplinas.setSelectedIndex(-1);
        cmbGenero.setSelectedIndex(-1);
        btnGroupGeral.clearSelection();
        btnGroupContatos.clearSelection();
        sliQuantidade.setValue(0);
        cmbCurso.setSelectedIndex(-1);
        tabelaDados.setModel(new DefaultTableModel());
    }
    
    private void txtNomeAlunoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeAlunoCaretUpdate
        if (cmbGenero.getSelectedIndex() >= 0) { cmbGenero.setSelectedIndex(-1); }
        if (!"".equals(txtNomeAluno.getText())) {
            preencherTabela("SELECT matricula, nome, data_matricula, curso FROM aluno, pessoa, curso WHERE curso.id_curso = aluno.curso AND pessoa.id_pessoa = aluno.pessoa AND pessoa.nome LIKE '" + txtNomeAluno.getText() + "%'");
        }  
        else {
            tabelaDados.setModel(new DefaultTableModel());
        }
    }//GEN-LAST:event_txtNomeAlunoCaretUpdate

    private void cmbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGeneroActionPerformed
        if (cmbGenero.getSelectedIndex() != -1) {
            preencherTabela("SELECT count(matricula) AS 'qtd_alunos' FROM aluno, pessoa WHERE pessoa.id_pessoa = aluno.pessoa AND genero = '" + cmbGenero.getSelectedItem().toString() + "'");  
        }
    }//GEN-LAST:event_cmbGeneroActionPerformed

    private void cmbDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisciplinasActionPerformed
        if (cmbDisciplinas.getSelectedIndex() != -1) {
            preencherTabela("SELECT id_docente, nome, id_disciplina, descricao FROM docente_disciplina, docente, disciplina, pessoa WHERE docente.pessoa = pessoa.id_pessoa AND docente_disciplina.disciplina = disciplina.id_disciplina AND docente_disciplina.docente = docente.id_docente AND descricao = '" + cmbDisciplinas.getSelectedItem().toString() + "'");  
        }
    }//GEN-LAST:event_cmbDisciplinasActionPerformed

    private void txtNomePessoaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomePessoaCaretUpdate
        if (!"".equals(txtNomePessoa.getText())) {
            preencherTabela("SELECT id_pessoa, nome, contato FROM pessoa_contato, pessoa WHERE pessoa.id_pessoa = pessoa_contato.pessoa AND pessoa.nome LIKE '" + txtNomePessoa.getText() + "%'");
        }
        else {
            tabelaDados.setModel(new DefaultTableModel());
        }       
        btnGroupContatos.clearSelection();
    }//GEN-LAST:event_txtNomePessoaCaretUpdate

    private void txtNomeDocenteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNomeDocenteCaretUpdate
        if (cmbDisciplinas.getSelectedIndex() >= 0) { cmbDisciplinas.setSelectedIndex(-1); }        
        if (!"".equals(txtNomeDocente.getText())) {
            preencherTabela("SELECT id_docente, nome, formacao, nivel, salario FROM docente, pessoa WHERE pessoa.id_pessoa = docente.pessoa AND pessoa.nome LIKE '" + txtNomeDocente.getText() + "%'");
        }
        else {
            tabelaDados.setModel(new DefaultTableModel());
        }
    }//GEN-LAST:event_txtNomeDocenteCaretUpdate

    private void rdoContatosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoContatosAlunosActionPerformed
        preencherTabela("SELECT id_pessoa, matricula, nome, contato FROM aluno, pessoa, pessoa_contato WHERE pessoa.id_pessoa = aluno.pessoa AND pessoa_contato.pessoa = pessoa.id_pessoa  ORDER BY nome");
    }//GEN-LAST:event_rdoContatosAlunosActionPerformed

    private void rdoContatosDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoContatosDocentesActionPerformed
        preencherTabela("SELECT id_pessoa, id_docente, nome, contato FROM docente, pessoa, pessoa_contato WHERE pessoa.id_pessoa = docente.pessoa AND pessoa_contato.pessoa = pessoa.id_pessoa  ORDER BY nome");
    }//GEN-LAST:event_rdoContatosDocentesActionPerformed

    private void rdoContatosFuncionáriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoContatosFuncionáriosActionPerformed
        preencherTabela("SELECT id_pessoa, id_funcionario, nome, contato FROM funcionario, pessoa, pessoa_contato WHERE pessoa.id_pessoa = funcionario.pessoa AND pessoa_contato.pessoa = pessoa.id_pessoa ORDER BY nome");
    }//GEN-LAST:event_rdoContatosFuncionáriosActionPerformed

    private void rdoContatosCâmpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoContatosCâmpusActionPerformed
        preencherTabela("SELECT id_campus, cnpj, razao_social, contato FROM campus, campus_contato WHERE campus.id_campus = campus_contato.campus ORDER BY razao_social");
    }//GEN-LAST:event_rdoContatosCâmpusActionPerformed

    private void sliQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliQuantidadeStateChanged
        lblQuantidadeAulas.setText("Pesquisa por Quantidade de Aulas: " + sliQuantidade.getValue());
        if (sliQuantidade.getValue() > 0) { preencherTabela("SELECT * FROM disciplina WHERE qtd_aulas <= " + sliQuantidade.getValue()); }
    }//GEN-LAST:event_sliQuantidadeStateChanged

    private void btnRelaçãoDisciplinasDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelaçãoDisciplinasDocentesActionPerformed
        if (cmbCurso.getSelectedIndex() >= 0) { cmbCurso.setSelectedIndex(-1); }
        preencherTabela("SELECT id_docente, nome AS 'docente', id_disciplina, descricao, qtd_aulas FROM disciplina, docente, docente_disciplina, pessoa WHERE docente_disciplina.disciplina = disciplina.id_disciplina AND docente_disciplina.docente = docente.id_docente AND docente.pessoa = pessoa.id_pessoa ORDER BY nome, descricao");
        if (sliQuantidade.getValue() > 0) { sliQuantidade.setValue(0); }
    }//GEN-LAST:event_btnRelaçãoDisciplinasDocentesActionPerformed

    private void btnRelaçãoCursosDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelaçãoCursosDisciplinasActionPerformed
        if (cmbCurso.getSelectedIndex() >= 0) { cmbCurso.setSelectedIndex(-1); }
        preencherTabela("SELECT id_curso, curso.descricao, id_disciplina, disciplina.descricao FROM disciplina, curso, curso_disciplina WHERE curso_disciplina.disciplina = disciplina.id_disciplina AND curso_disciplina.curso = curso.id_curso ORDER BY curso.descricao, disciplina.descricao");
        if (sliQuantidade.getValue() > 0) { sliQuantidade.setValue(0); } 
    }//GEN-LAST:event_btnRelaçãoCursosDisciplinasActionPerformed

    private void cmbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCursoActionPerformed
        if (cmbCurso.getSelectedIndex() != -1) {
            preencherTabela("SELECT id_curso, curso.descricao, id_disciplina, disciplina.descricao FROM disciplina, curso, curso_disciplina WHERE curso_disciplina.disciplina = disciplina.id_disciplina AND curso_disciplina.curso = curso.id_curso AND curso.descricao = '" + cmbCurso.getSelectedItem().toString() + "' ORDER BY disciplina.descricao");  
        }
    }//GEN-LAST:event_cmbCursoActionPerformed

    private void btnEmailPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailPessoasActionPerformed
        preencherTabela("SELECT id_pessoa, nome, email FROM pessoa, pessoa_email WHERE pessoa.id_pessoa = pessoa_email.pessoa ORDER BY nome");
    }//GEN-LAST:event_btnEmailPessoasActionPerformed

    private void btnEmailCâmpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailCâmpusActionPerformed
       preencherTabela("SELECT id_campus, razao_social, email FROM campus, campus_email WHERE campus.id_campus = campus_email.campus ORDER BY razao_social");
    }//GEN-LAST:event_btnEmailCâmpusActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedConsultas;
    private javax.swing.JButton btnEmailCâmpus;
    private javax.swing.JButton btnEmailPessoas;
    private javax.swing.ButtonGroup btnGroupContatos;
    private javax.swing.ButtonGroup btnGroupGeral;
    private javax.swing.JButton btnRelaçãoCursosDisciplinas;
    private javax.swing.JButton btnRelaçãoDisciplinasDocentes;
    private javax.swing.JComboBox<String> cmbCurso;
    private javax.swing.JComboBox<String> cmbDisciplinas;
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblQuantidadeAulas;
    private javax.swing.JRadioButton rdoAlunos;
    private javax.swing.JRadioButton rdoContatosAlunos;
    private javax.swing.JRadioButton rdoContatosCâmpus;
    private javax.swing.JRadioButton rdoContatosDocentes;
    private javax.swing.JRadioButton rdoContatosFuncionários;
    private javax.swing.JRadioButton rdoCursos;
    private javax.swing.JRadioButton rdoCâmpus;
    private javax.swing.JRadioButton rdoDisciplinas;
    private javax.swing.JRadioButton rdoDocentes;
    private javax.swing.JRadioButton rdoFuncionários;
    private javax.swing.JRadioButton rdoOcupações;
    private javax.swing.JSlider sliQuantidade;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeDocente;
    private javax.swing.JTextField txtNomePessoa;
    // End of variables declaration//GEN-END:variables
}
