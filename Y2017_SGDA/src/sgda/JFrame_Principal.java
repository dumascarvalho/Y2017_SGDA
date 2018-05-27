package sgda;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JFrame_Principal extends javax.swing.JFrame {
    
    public JFrame_Principal() {
        initComponents();
        
        JPanel_Consultas consultas = new JPanel_Consultas();      
        setPainel(consultas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        JItemCampus = new javax.swing.JMenuItem();
        JItemCursos = new javax.swing.JMenuItem();
        JItemOcupações = new javax.swing.JMenuItem();
        JItemPessoas = new javax.swing.JMenuItem();
        JItemDisciplinas = new javax.swing.JMenuItem();
        JItemContatosEmails = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JItemRelaçãoCursos = new javax.swing.JMenuItem();
        JItemRelaçãoDocentes = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        JItemBlocoNotas = new javax.swing.JMenuItem();
        JItemCalculadora = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        JItemFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Dados Acadêmicos");
        setName("frmPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu3.setText("Cadastros");

        JItemCampus.setText("Câmpus");
        JItemCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemCampusActionPerformed(evt);
            }
        });
        jMenu3.add(JItemCampus);

        JItemCursos.setText("Cursos");
        JItemCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemCursosActionPerformed(evt);
            }
        });
        jMenu3.add(JItemCursos);

        JItemOcupações.setText("Ocupações");
        JItemOcupações.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemOcupaçõesActionPerformed(evt);
            }
        });
        jMenu3.add(JItemOcupações);

        JItemPessoas.setText("Pessoas");
        JItemPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemPessoasActionPerformed(evt);
            }
        });
        jMenu3.add(JItemPessoas);

        JItemDisciplinas.setText("Disciplinas");
        JItemDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemDisciplinasActionPerformed(evt);
            }
        });
        jMenu3.add(JItemDisciplinas);

        JItemContatosEmails.setText("Contatos e Emails");
        JItemContatosEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemContatosEmailsActionPerformed(evt);
            }
        });
        jMenu3.add(JItemContatosEmails);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Relações");

        JItemRelaçãoCursos.setText("Cursos e Disciplinas");
        JItemRelaçãoCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemRelaçãoCursosActionPerformed(evt);
            }
        });
        jMenu2.add(JItemRelaçãoCursos);

        JItemRelaçãoDocentes.setText("Docentes e Disciplinas");
        JItemRelaçãoDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemRelaçãoDocentesActionPerformed(evt);
            }
        });
        jMenu2.add(JItemRelaçãoDocentes);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Ferramentas");

        JItemBlocoNotas.setText("Bloco de Notas");
        JItemBlocoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemBlocoNotasActionPerformed(evt);
            }
        });
        jMenu4.add(JItemBlocoNotas);

        JItemCalculadora.setText("Calculadora");
        JItemCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemCalculadoraActionPerformed(evt);
            }
        });
        jMenu4.add(JItemCalculadora);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Outros");

        JItemFechar.setText("Encerrar");
        JItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JItemFecharActionPerformed(evt);
            }
        });
        jMenu5.add(JItemFechar);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void JItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemFecharActionPerformed
        encerrarPrograma();
    }//GEN-LAST:event_JItemFecharActionPerformed

    private void encerrarPrograma() {
        if (JOptionPane.showConfirmDialog(null, "Para que o sistema seja encerrado, favor confirmar!", "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { System.exit(0); }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        encerrarPrograma();
    }//GEN-LAST:event_formWindowClosing
        
    private void JItemBlocoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemBlocoNotasActionPerformed
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException ex) {
            Logger.getLogger(JFrame_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JItemBlocoNotasActionPerformed

    private void JItemCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemCalculadoraActionPerformed
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException ex) {
            Logger.getLogger(JFrame_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JItemCalculadoraActionPerformed

    private void abrirTela(JFrame tela) {
        tela.setVisible(true);
        tela.pack();
    }
    
    private void setPainel(JPanel painel){
        this.setContentPane(painel);
        this.validate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
        
    private void JItemPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemPessoasActionPerformed
      JFrame_Pessoas pessoas = new JFrame_Pessoas();
      abrirTela(pessoas);
    }//GEN-LAST:event_JItemPessoasActionPerformed

    private void JItemCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemCampusActionPerformed
        JFrame_Câmpus câmpus = new JFrame_Câmpus();
        abrirTela(câmpus);
    }//GEN-LAST:event_JItemCampusActionPerformed

    private void JItemOcupaçõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemOcupaçõesActionPerformed
        JFrame_Ocupações ocupações = new JFrame_Ocupações();
        abrirTela(ocupações);
    }//GEN-LAST:event_JItemOcupaçõesActionPerformed

    private void JItemDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemDisciplinasActionPerformed
        JFrame_Disciplinas disciplinas = new JFrame_Disciplinas();
        abrirTela(disciplinas);
    }//GEN-LAST:event_JItemDisciplinasActionPerformed

    private void JItemContatosEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemContatosEmailsActionPerformed
        JFrame_Contatos_Emails contatos_emails = new JFrame_Contatos_Emails();
        abrirTela(contatos_emails);
    }//GEN-LAST:event_JItemContatosEmailsActionPerformed

    private void JItemCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemCursosActionPerformed
        JFrame_Cursos cursos = new JFrame_Cursos();
        abrirTela(cursos);
    }//GEN-LAST:event_JItemCursosActionPerformed

    private void JItemRelaçãoCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemRelaçãoCursosActionPerformed
        JFrame_Cursos_Disciplinas cursos_disciplias = new JFrame_Cursos_Disciplinas();
        abrirTela(cursos_disciplias);
    }//GEN-LAST:event_JItemRelaçãoCursosActionPerformed

    private void JItemRelaçãoDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JItemRelaçãoDocentesActionPerformed
        JFrame_Docentes_Disciplinas disciplinas_docentes = new JFrame_Docentes_Disciplinas();
        abrirTela(disciplinas_docentes);
    }//GEN-LAST:event_JItemRelaçãoDocentesActionPerformed
    
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JItemBlocoNotas;
    private javax.swing.JMenuItem JItemCalculadora;
    private javax.swing.JMenuItem JItemCampus;
    private javax.swing.JMenuItem JItemContatosEmails;
    private javax.swing.JMenuItem JItemCursos;
    private javax.swing.JMenuItem JItemDisciplinas;
    private javax.swing.JMenuItem JItemFechar;
    private javax.swing.JMenuItem JItemOcupações;
    private javax.swing.JMenuItem JItemPessoas;
    private javax.swing.JMenuItem JItemRelaçãoCursos;
    private javax.swing.JMenuItem JItemRelaçãoDocentes;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
