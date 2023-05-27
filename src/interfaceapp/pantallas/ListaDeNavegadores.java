package interfaceapp.pantallas;

import interfaceapp.entidades.Celular;
import interfaceapp.entidades.Navegador;
import interfaceapp.entidades.SmartTV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Andres
 */
public class ListaDeNavegadores extends javax.swing.JFrame {

    List<Celular> celulares = new ArrayList<>();
    List<SmartTV> televisores = new ArrayList<>();
    List<Navegador> navegadores = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();
    
    public ListaDeNavegadores() {
        initComponents();
       lstNavegadores.setModel(modeloLista);
    }
    
    public void actualizarLista() {
        modeloLista.removeAllElements();
        
        for (Navegador navegador : navegadores) {
          modeloLista.addElement(navegador.getNombre());  
        }
        
    }
    
    public void setCelular(Celular celular) {
        celulares.add(celular);
        navegadores.add(celular);
        actualizarLista();
    }
    
    public void setSmartTV(SmartTV smartTV) {
        televisores.add(smartTV);
        navegadores.add(smartTV);
        actualizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNavegadores = new javax.swing.JList<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregarCelular = new javax.swing.JButton();
        btnAgregarSmartTv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla principal");

        jScrollPane1.setViewportView(lstNavegadores);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAgregarCelular.setText("Agregar Celular");
        btnAgregarCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCelularActionPerformed(evt);
            }
        });

        btnAgregarSmartTv.setText("Agregar SmartTV");
        btnAgregarSmartTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarSmartTvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarSmartTv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCelular))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscar))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCelular)
                    .addComponent(btnAgregarSmartTv))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarSmartTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarSmartTvActionPerformed

        EditarSmartTV editar = new EditarSmartTV(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarSmartTvActionPerformed

    private void btnAgregarCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCelularActionPerformed

        EditarCelular editar = new EditarCelular(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgregarCelularActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            actualizarLista();
            return;
        }
        
        modeloLista.removeAllElements();
        
        for (Navegador navegador : navegadores) {
            if (navegador.getNombre()
                    .toLowerCase()
                    .contains(txtBuscar.getText())){
                modeloLista.addElement(navegador.getNombre()); 
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        if (txtBuscar.getText().isEmpty()) {
            actualizarLista();
            return;
        }
        
        modeloLista.removeAllElements();
        
        for (Navegador navegador : navegadores) {
            if (navegador.getNombre()
                    .toLowerCase()
                    .contains(txtBuscar.getText())){
                modeloLista.addElement(navegador.getNombre()); 
            }
        } 
    }//GEN-LAST:event_txtBuscarKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeNavegadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCelular;
    private javax.swing.JButton btnAgregarSmartTv;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNavegadores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
