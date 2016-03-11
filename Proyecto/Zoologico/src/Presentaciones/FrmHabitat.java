/*  Form principal para los habitads.
    Caracteristicas:
        Codigo: Integer.
        Nombre: String.

    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Presentaciones;

import Mantenimientos.MantenimientoHabitat;
import Entidades.Habitat;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
        
public class FrmHabitat extends javax.swing.JFrame {

    MantenimientoHabitat mantenimiento = new MantenimientoHabitat ();
    Habitat temporalHabitat;
    
    public FrmHabitat() {
        initComponents();
        mantenimiento.CargarDeArchivo();
        
        if (mantenimiento.ListadoHabitat().size() <= 0)
        {
            BusquedabtnBuscar.setEnabled(false);
        }
        else
        {
            BusquedabtnBuscar.setEnabled(true);
        }
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlGeneral = new javax.swing.JTabbedPane();
        PnlBusqueda = new javax.swing.JPanel();
        BusquedaCodigo = new javax.swing.JLabel();
        BusquedaNombre = new javax.swing.JLabel();
        BusquedatxtCodigo = new javax.swing.JTextField();
        BusquedatxtNombre = new javax.swing.JTextField();
        BusquedabtnBuscar = new javax.swing.JButton();
        BusquedabtnNuevo = new javax.swing.JButton();
        PnlMantenimiento = new javax.swing.JPanel();
        MantenimientoCodigo = new javax.swing.JLabel();
        MantenimientotxtCodigo = new javax.swing.JTextField();
        MantenimientoNombre = new javax.swing.JLabel();
        MantenimientotxtNombre = new javax.swing.JTextField();
        MantenimientobtnGuardar = new javax.swing.JButton();
        MantenimientobtnCancelar = new javax.swing.JButton();
        MantenimientobtnRemover = new javax.swing.JButton();
        PnlListado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        ListadobtnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Habitats");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PnlGeneral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PnlGeneralFocusGained(evt);
            }
        });

        BusquedaCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BusquedaCodigo.setText("Codigo:");

        BusquedaNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BusquedaNombre.setText("Nombre:");

        BusquedatxtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BusquedatxtCodigoFocusGained(evt);
            }
        });

        BusquedatxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BusquedatxtNombreFocusGained(evt);
            }
        });

        BusquedabtnBuscar.setText("Buscar");
        BusquedabtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedabtnBuscarMouseClicked(evt);
            }
        });

        BusquedabtnNuevo.setText("Nuevo");
        BusquedabtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedabtnNuevoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlBusquedaLayout = new javax.swing.GroupLayout(PnlBusqueda);
        PnlBusqueda.setLayout(PnlBusquedaLayout);
        PnlBusquedaLayout.setHorizontalGroup(
            PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlBusquedaLayout.createSequentialGroup()
                        .addComponent(BusquedaNombre)
                        .addGap(18, 18, 18)
                        .addComponent(BusquedatxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlBusquedaLayout.createSequentialGroup()
                        .addComponent(BusquedaCodigo)
                        .addGap(22, 22, 22)
                        .addComponent(BusquedatxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBusquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BusquedabtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BusquedabtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PnlBusquedaLayout.setVerticalGroup(
            PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBusquedaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusquedaCodigo)
                    .addComponent(BusquedatxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusquedaNombre)
                    .addComponent(BusquedatxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusquedabtnBuscar)
                    .addComponent(BusquedabtnNuevo))
                .addContainerGap())
        );

        PnlGeneral.addTab("Busqueda", PnlBusqueda);

        MantenimientoCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoCodigo.setText("Codigo:");

        MantenimientotxtCodigo.setEditable(false);
        MantenimientotxtCodigo.setFocusable(false);

        MantenimientoNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoNombre.setText("Nombre:");

        MantenimientobtnGuardar.setText("Guardar");
        MantenimientobtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MantenimientobtnGuardarMouseClicked(evt);
            }
        });

        MantenimientobtnCancelar.setText("Cancelar");
        MantenimientobtnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MantenimientobtnCancelarMouseClicked(evt);
            }
        });

        MantenimientobtnRemover.setText("Remover");
        MantenimientobtnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MantenimientobtnRemoverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnRemover)
                        .addGap(5, 5, 5)
                        .addComponent(MantenimientobtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MantenimientoNombre)
                            .addComponent(MantenimientoCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MantenimientotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoCodigo)
                    .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoNombre)
                    .addComponent(MantenimientotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientobtnGuardar)
                    .addComponent(MantenimientobtnCancelar)
                    .addComponent(MantenimientobtnRemover))
                .addContainerGap())
        );

        PnlGeneral.addTab("Mantenimiento", PnlMantenimiento);

        ResultadotblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ResultadotblListaScrl.setViewportView(ResultadotblLista);

        ListadobtnEditar.setText("Editar registro");
        ListadobtnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListadobtnEditarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlListadoLayout = new javax.swing.GroupLayout(PnlListado);
        PnlListado.setLayout(PnlListadoLayout);
        PnlListadoLayout.setHorizontalGroup(
            PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListadobtnEditar)
                .addContainerGap())
        );
        PnlListadoLayout.setVerticalGroup(
            PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListadoLayout.createSequentialGroup()
                .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListadobtnEditar)
                .addContainerGap())
        );

        PnlGeneral.addTab("Listado", PnlListado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento de Habitats");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PnlGeneral.setEnabledAt(1, false);
        PnlGeneral.setEnabledAt(2, true);
    }//GEN-LAST:event_formWindowOpened

    private void BusquedabtnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedabtnNuevoMouseClicked
        PnlGeneral.setEnabledAt(0,false);
        PnlGeneral.setEnabledAt(1,true);
        PnlGeneral.setSelectedIndex(1);
        MantenimientobtnRemover.setEnabled(false);
        LimpiarCampos();
    }//GEN-LAST:event_BusquedabtnNuevoMouseClicked

    private void MantenimientobtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnCancelarMouseClicked
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnCancelarMouseClicked

    private void MantenimientobtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnGuardarMouseClicked
        
        temporalHabitat = new Habitat();
        

        if (MantenimientotxtCodigo.getText().isEmpty())
        {
            temporalHabitat.setCodigo(0);
            temporalHabitat.setNombre(MantenimientotxtNombre.getText());
            
            mantenimiento.AgregarHabitat(temporalHabitat);
        }
        else 
        {    
            temporalHabitat.setCodigo(Integer.parseInt(MantenimientotxtCodigo.getText()));
            temporalHabitat.setNombre(MantenimientotxtNombre.getText());
            
            mantenimiento.ModificarHabitat(temporalHabitat);
        }
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnGuardarMouseClicked

    private void PnlGeneralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnlGeneralFocusGained
        CargarTabla();
    }//GEN-LAST:event_PnlGeneralFocusGained

    private void BusquedabtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedabtnBuscarMouseClicked

        temporalHabitat = new Habitat ();
        
        if (BusquedatxtCodigo.getText().isEmpty() && BusquedatxtNombre.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "Los campos de busqueda estan vacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (BusquedatxtNombre.getText().isEmpty())
        {
            temporalHabitat = mantenimiento.BusquedaHabitat(
                1, 
                Integer.parseInt(BusquedatxtCodigo.getText()),  
                "");
        }
        else
        {
                temporalHabitat = mantenimiento.BusquedaHabitat(
                2, 0, BusquedatxtNombre.getText());
        }
        
        
        if (temporalHabitat == null)
            JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        else
        {
            MantenimientotxtCodigo.setText(String.valueOf(temporalHabitat.getCodigo()));
            MantenimientotxtNombre.setText(temporalHabitat.getNombre());
            
            PnlGeneral.setEnabledAt(0,false);
            PnlGeneral.setEnabledAt(1,true);
            PnlGeneral.setSelectedIndex(1);
        }
        
        MantenimientobtnGuardar.setEnabled(true);
        MantenimientobtnRemover.setEnabled(true);
                     
    }//GEN-LAST:event_BusquedabtnBuscarMouseClicked

    private void BusquedatxtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BusquedatxtCodigoFocusGained
        BusquedatxtNombre.setText("");
    }//GEN-LAST:event_BusquedatxtCodigoFocusGained

    private void BusquedatxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BusquedatxtNombreFocusGained
        BusquedatxtCodigo.setText("");
    }//GEN-LAST:event_BusquedatxtNombreFocusGained

    private void MantenimientobtnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnRemoverMouseClicked
        mantenimiento.RemoverHabitat(Integer.parseInt(MantenimientotxtCodigo.getText()));
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnRemoverMouseClicked

    private void ListadobtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadobtnEditarMouseClicked
        
        int registrocargar = ResultadotblLista.getSelectedRow();
        temporalHabitat = new Habitat ();
        
        temporalHabitat = mantenimiento.BusquedaHabitatIndice(ResultadotblLista.getSelectedRow());
        
        MantenimientotxtCodigo.setText(String.valueOf(temporalHabitat.getCodigo()));
        MantenimientotxtNombre.setText(temporalHabitat.getNombre());
            
        PnlGeneral.setEnabledAt(0,false);
        PnlGeneral.setEnabledAt(1,true);
        MantenimientobtnRemover.setEnabled(true);
        PnlGeneral.setSelectedIndex(1);
        
    }//GEN-LAST:event_ListadobtnEditarMouseClicked

    
    
    public void LimpiarCampos ()
    {
        BusquedatxtCodigo.setText("");
        BusquedatxtNombre.setText("");
        MantenimientotxtCodigo.setText("");
        MantenimientotxtNombre.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitat().setVisible(true);
            }
        });
    }
    
    private void CargarTabla()
    {
        ArrayList<Habitat> lista = mantenimiento.ListadoHabitat();
        
        String[] columnNames = {"Codigo","Nombre"};
        DefaultTableModel model = new DefaultTableModel ();
        
        model.setColumnIdentifiers (columnNames);
        
        ResultadotblLista.setModel (model);
        
                       
        for (int i = 0; i < lista.size(); i++)
        {
            int Codigo = lista.get(i).getCodigo();
            String Nombre = lista.get(i).getNombre();
            
            Object[] data = {Codigo, Nombre};
            
            model.addRow(data); 
        }        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BusquedaCodigo;
    private javax.swing.JLabel BusquedaNombre;
    private javax.swing.JButton BusquedabtnBuscar;
    private javax.swing.JButton BusquedabtnNuevo;
    private javax.swing.JTextField BusquedatxtCodigo;
    private javax.swing.JTextField BusquedatxtNombre;
    private javax.swing.JButton ListadobtnEditar;
    private javax.swing.JLabel MantenimientoCodigo;
    private javax.swing.JLabel MantenimientoNombre;
    private javax.swing.JButton MantenimientobtnCancelar;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JButton MantenimientobtnRemover;
    private javax.swing.JTextField MantenimientotxtCodigo;
    private javax.swing.JTextField MantenimientotxtNombre;
    private javax.swing.JPanel PnlBusqueda;
    private javax.swing.JTabbedPane PnlGeneral;
    private javax.swing.JPanel PnlListado;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JTable ResultadotblLista;
    private javax.swing.JScrollPane ResultadotblListaScrl;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
