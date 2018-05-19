package projeto_sgda;

import javax.swing.JTable;

public class JFrame_Consultas extends javax.swing.JFrame {

    public JFrame_Consultas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdoCursos = new javax.swing.JRadioButton();
        rdoFuncionarios = new javax.swing.JRadioButton();
        rdoDisciplinas = new javax.swing.JRadioButton();
        rdoAlunos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Dados");
        setAutoRequestFocus(false);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_consulta.png"))); // NOI18N
        lblImagem.setPreferredSize(new java.awt.Dimension(680, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Escolha uma das Alternativas:  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rdoCursos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(rdoCursos);
        rdoCursos.setText("  Cursos");
        rdoCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCursosActionPerformed(evt);
            }
        });

        rdoFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(rdoFuncionarios);
        rdoFuncionarios.setText("  Funcionários");
        rdoFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFuncionariosActionPerformed(evt);
            }
        });

        rdoDisciplinas.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(rdoDisciplinas);
        rdoDisciplinas.setText("  Disciplinas");
        rdoDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDisciplinasActionPerformed(evt);
            }
        });

        rdoAlunos.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup.add(rdoAlunos);
        rdoAlunos.setText("  Alunos");
        rdoAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoCursos)
                .addGap(18, 18, 18)
                .addComponent(rdoFuncionarios)
                .addGap(18, 18, 18)
                .addComponent(rdoDisciplinas)
                .addGap(18, 18, 18)
                .addComponent(rdoAlunos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCursos)
                    .addComponent(rdoFuncionarios)
                    .addComponent(rdoDisciplinas)
                    .addComponent(rdoAlunos))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/application_delete.png"))); // NOI18N
        btnFechar.setText("   Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Conexão_SGDA banco = new Conexão_SGDA();
        
    private void preencherTabela(String tabela) {
        try {
            
        banco.conectar();
        banco.setComando("SELECT * FROM " + tabela);
        banco.parametrizar();
        banco.consultar();
        
        tabelaDados.setModel(Formatar_Campos.colocarDadosTabela(banco.resultado)); 
        
        } catch (Exception ex) {
            System.out.println("\nExceção: " + ex);
        } finally {
            banco.desconectar(); 

            tabelaDados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            Redimensionar_JTabela redimensionar = new Redimensionar_JTabela(tabelaDados);
            redimensionar.adjustColumns();   
        }
    }
        
    private void rdoCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCursosActionPerformed
        preencherTabela("curso");
    }//GEN-LAST:event_rdoCursosActionPerformed

    private void rdoFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFuncionariosActionPerformed
        preencherTabela("funcionario");
    }//GEN-LAST:event_rdoFuncionariosActionPerformed

    private void rdoDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDisciplinasActionPerformed
        preencherTabela("disciplina");
    }//GEN-LAST:event_rdoDisciplinasActionPerformed

    private void rdoAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoAlunosActionPerformed
        preencherTabela("aluno");
    }//GEN-LAST:event_rdoAlunosActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_Consultas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JRadioButton rdoAlunos;
    private javax.swing.JRadioButton rdoCursos;
    private javax.swing.JRadioButton rdoDisciplinas;
    private javax.swing.JRadioButton rdoFuncionarios;
    private javax.swing.JTable tabelaDados;
    // End of variables declaration//GEN-END:variables
}
