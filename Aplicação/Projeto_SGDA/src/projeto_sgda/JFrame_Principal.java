package projeto_sgda;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JFrame_Principal extends javax.swing.JFrame {
    
    public JFrame_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Dados Acadêmicos");
        setName("frmPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_principal.png"))); // NOI18N

        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/database.png"))); // NOI18N
        jMenu3.setText("Cadastros");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/world.png"))); // NOI18N
        jMenuItem1.setText("Cursos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/user_gray.png"))); // NOI18N
        jMenuItem2.setText("Funcionários");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/book.png"))); // NOI18N
        jMenuItem3.setText("Disciplinas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/group.png"))); // NOI18N
        jMenuItem4.setText("Alunos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/magnifier.png"))); // NOI18N
        jMenu6.setText("Consultas");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/wrench.png"))); // NOI18N
        jMenu4.setText("Ferramentas");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/pencil.png"))); // NOI18N
        jMenuItem7.setText("Bloco de Notas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/calculator.png"))); // NOI18N
        jMenuItem8.setText("Calculadora");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/folder.png"))); // NOI18N
        jMenu5.setText("Outros");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/information.png"))); // NOI18N
        jMenuItem5.setText("Sobre o Sistema");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/door_out.png"))); // NOI18N
        jMenuItem6.setText("Fechar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        encerrarPrograma();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void encerrarPrograma() {
        if (JOptionPane.showConfirmDialog(null, "Deseja encerrar o sistema?", "Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { System.exit(0); }
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        encerrarPrograma();
    }//GEN-LAST:event_formWindowClosing
    
    private void setPainel(JPanel painel){
        this.setContentPane(painel);
        this.validate();
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JPanel painel = new JPanel_Cursos();
        setPainel(painel); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JPanel painel = new JPanel_Funcionários();
        setPainel(painel);     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JPanel painel = new JPanel_Disciplinas();
        setPainel(painel); 
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JPanel painel = new JPanel_Alunos();
        setPainel(painel); 
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            Runtime.getRuntime().exec("notepad");
        } catch (IOException ex) {
            Logger.getLogger(JFrame_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException ex) {
            Logger.getLogger(JFrame_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        JFrame_Consultas consultas = new JFrame_Consultas();
        consultas.setVisible(true);
        consultas.pack();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFrame_Sobre sobre = new JFrame_Sobre();
        sobre.setVisible(true);
        sobre.pack();
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
