package interfaceapp.pantallas;
import interfaceapp.entidades.SmartTV;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class EditarSmartTV extends javax.swing.JFrame {

    private SmartTV smartTV;
    private ListaDeNavegadores padre;

    public EditarSmartTV() {
        initComponents();
    }
    
    public EditarSmartTV(ListaDeNavegadores padre) {
        initComponents();
        this.padre = padre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoEntrada = new javax.swing.JLabel();
        cbTipoEntrada = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTipoEntrada.setText("Tipo Entrada:");

        cbTipoEntrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HDMI", "VGA", "DVI", "DisplayPort", "RCA", "Signal", "SVideo", "Coaxial" }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnGuardar)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoEntrada)
                    .addComponent(cbTipoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnGuardar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (JOptionPane.showConfirmDialog(this, "¿Deseas guardar?")
                == JOptionPane.OK_OPTION) {
            smartTV = new SmartTV();
            smartTV.setTipoEntrada(cbTipoEntrada.getSelectedIndex());
            smartTV.setNombre(smartTV.getNombre());
            this.padre.setSmartTV(smartTV);
            this.padre.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarSmartTV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbTipoEntrada;
    private javax.swing.JLabel lblTipoEntrada;
    // End of variables declaration//GEN-END:variables
}
