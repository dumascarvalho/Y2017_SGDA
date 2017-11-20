package projeto_sgda;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class JPanel_Cursos extends javax.swing.JPanel {

    public JPanel_Cursos() {
        initComponents();
        formatar.filtrarSpinner(spnCarga);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lblImagem = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnCarga = new javax.swing.JSpinner();
        cmbPeriodo = new javax.swing.JComboBox<>();
        btnLimparCampos = new javax.swing.JButton();
        btnInserirDados = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 255, 255));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_sgda/imagens/img_cursos.png"))); // NOI18N

        jLabel1.setText("Descrição do Curso");

        jLabel2.setText("Período:");

        jLabel3.setText("Carga Horária:");

        spnCarga.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10000, 1));

        cmbPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Noturno", "Integral" }));
        cmbPeriodo.setSelectedIndex(-1);

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
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(cmbPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserirDados)
                    .addComponent(btnLimparCampos))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    Formatar_Campos formatar = new Formatar_Campos();
    
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
        banco.setComando("INSERT INTO cursos (cod_curso, descricao, periodo, carga_horaria) VALUES (NULL, ?, ?, ?)");
        banco.parametrizar();

        try {
            banco.parametro.setString(1, txtDescricao.getText());
            banco.parametro.setString(2, cmbPeriodo.getSelectedItem().toString());
            banco.parametro.setInt(3, Integer.parseInt(spnCarga.getValue().toString()));
            
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
        txtDescricao.setText(null);
        cmbPeriodo.setSelectedIndex(-1);
        spnCarga.setValue(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserirDados;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JComboBox<String> cmbPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JSpinner spnCarga;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
