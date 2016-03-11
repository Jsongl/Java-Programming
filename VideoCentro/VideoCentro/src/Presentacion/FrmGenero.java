/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Genero;
import Mantenimientos.MantenimientoGenero;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FrmGenero extends javax.swing.JFrame {

    MantenimientoGenero mantenimiento = new MantenimientoGenero();
    
    public FrmGenero() {
        initComponents();
        mantenimiento.ListadoGenero();
        
        if (mantenimiento.ListadoGenero().size() <= 0)
        {
            FiltrobtnBusqueda.setEnabled(false);
        }
        else
        {
            FiltrobtnBusqueda.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabControl = new javax.swing.JTabbedPane();
        PnlFilter = new javax.swing.JPanel();
        FiltroNombre = new javax.swing.JLabel();
        FiltroCodigo = new javax.swing.JLabel();
        FiltroEstado = new javax.swing.JLabel();
        FiltrotxtCodigo = new javax.swing.JTextField();
        FiltrotxtNombre = new javax.swing.JTextField();
        FiltrotxtEstado = new javax.swing.JTextField();
        FiltrobtnBusqueda = new javax.swing.JButton();
        FiltrobtnAgregar = new javax.swing.JButton();
        PnlMantenimiento = new javax.swing.JPanel();
        MantenimientoCodigo = new javax.swing.JLabel();
        MantenimientoNombre = new javax.swing.JLabel();
        MantenimientoDescripcion = new javax.swing.JLabel();
        MantenimientoEstado = new javax.swing.JLabel();
        MantenimientotxtCodigo = new javax.swing.JTextField();
        MantenimientotxtNombre = new javax.swing.JTextField();
        MantenimientotxtDescripcion = new javax.swing.JTextField();
        MantenimientotxtEstado = new javax.swing.JTextField();
        MantenimientobtnGuardar = new javax.swing.JButton();
        MantenimientobtnCancelar = new javax.swing.JButton();
        PnlResultado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        GeneroTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        FiltroNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiltroNombre.setText("Nombre");

        FiltroCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiltroCodigo.setText("Codigo");

        FiltroEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiltroEstado.setText("Estado");

        FiltrobtnBusqueda.setText("Busqueda");

        FiltrobtnAgregar.setText("Agregar");
        FiltrobtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltrobtnAgregarMouseClicked(evt);
            }
        });
        FiltrobtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiltrobtnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlFilterLayout = new javax.swing.GroupLayout(PnlFilter);
        PnlFilter.setLayout(PnlFilterLayout);
        PnlFilterLayout.setHorizontalGroup(
            PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlFilterLayout.createSequentialGroup()
                        .addComponent(FiltroCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(FiltrotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlFilterLayout.createSequentialGroup()
                        .addComponent(FiltroNombre)
                        .addGap(18, 18, 18)
                        .addComponent(FiltrotxtNombre))
                    .addGroup(PnlFilterLayout.createSequentialGroup()
                        .addComponent(FiltroEstado)
                        .addGap(18, 18, 18)
                        .addComponent(FiltrotxtEstado)))
                .addGap(46, 46, 46)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FiltrobtnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PnlFilterLayout.setVerticalGroup(
            PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroCodigo)
                    .addComponent(FiltrotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnBusqueda))
                .addGap(17, 17, 17)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroNombre)
                    .addComponent(FiltrotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnAgregar))
                .addGap(18, 18, 18)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroEstado)
                    .addComponent(FiltrotxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        TabControl.addTab("Filtro", PnlFilter);

        PnlMantenimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        MantenimientoCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoCodigo.setText("Codigo");

        MantenimientoNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoNombre.setText("Nombre");

        MantenimientoDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoDescripcion.setText("Descripcion");

        MantenimientoEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoEstado.setText("Estado");

        MantenimientotxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientotxtCodigoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoNombre)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtNombre))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoDescripcion)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtDescripcion))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoEstado)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtEstado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantenimientobtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoCodigo)
                    .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoNombre)
                    .addComponent(MantenimientotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoDescripcion)
                    .addComponent(MantenimientotxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantenimientobtnCancelar))
                .addGap(17, 17, 17)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoEstado)
                    .addComponent(MantenimientotxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantenimientobtnGuardar))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        TabControl.addTab("Mantenimiento", PnlMantenimiento);

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

        javax.swing.GroupLayout PnlResultadoLayout = new javax.swing.GroupLayout(PnlResultado);
        PnlResultado.setLayout(PnlResultadoLayout);
        PnlResultadoLayout.setHorizontalGroup(
            PnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        PnlResultadoLayout.setVerticalGroup(
            PnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlResultadoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        TabControl.addTab("Resultado", PnlResultado);

        GeneroTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GeneroTitulo.setText("Mantenimiento Genero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabControl, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GeneroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(GeneroTitulo)
                .addGap(18, 18, 18)
                .addComponent(TabControl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientotxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientotxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MantenimientotxtCodigoActionPerformed

    private void FiltrobtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrobtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltrobtnAgregarActionPerformed

    private void MantenimientobtnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnCancelarMouseClicked
        TabControl.setEnabledAt(0,true);
        TabControl.setEnabledAt(1,false);
        TabControl.setSelectedIndex(0);
        LimpiarObjetos();
    }//GEN-LAST:event_MantenimientobtnCancelarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TabControl.setEnabledAt(1,false);
        TabControl.setEnabledAt(2,false);
    }//GEN-LAST:event_formWindowOpened

    private void FiltrobtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltrobtnAgregarMouseClicked
        TabControl.setEnabledAt(0,false);
        TabControl.setEnabledAt(1,true);
        TabControl.setSelectedIndex(1);
        LimpiarObjetos();
    }//GEN-LAST:event_FiltrobtnAgregarMouseClicked

    private void MantenimientobtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnGuardarMouseClicked
        int Codigo = 0;
                
        if (!MantenimientotxtCodigo.getText().equals(""))
        {
            Codigo = Integer.parseInt(MantenimientotxtCodigo.getText());
                
            Genero genero = new Genero (
                    Codigo,
                    MantenimientotxtNombre.getText(),
                    MantenimientotxtDescripcion.getText(),
                    true);

            mantenimiento.AddElemento(genero);
            
            ShowTable();
            TabControl.setEnabledAt(0,true);
            TabControl.setEnabledAt(2,true);
            TabControl.setEnabledAt(1,false);
            TabControl.setSelectedIndex(0);
            LimpiarObjetos();
         }
    }//GEN-LAST:event_MantenimientobtnGuardarMouseClicked

    public void LimpiarObjetos()
    {
        FiltrotxtCodigo.setText("");
        FiltrotxtEstado.setText("");
        FiltrotxtNombre.setText("");
        MantenimientotxtCodigo.setText("");
        MantenimientotxtNombre.setText("");
        MantenimientotxtDescripcion.setText("");
        MantenimientotxtEstado.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenero().setVisible(true);
            }
        });
    }

    private void ShowTable()
    {
        ArrayList<Genero> lista = mantenimiento.ListadoGenero();
        
        String[] columnNames = {"Codigo","Nombre","Descripcion","Estado"};
        DefaultTableModel model = new DefaultTableModel ();
        
        model.setColumnIdentifiers (columnNames);
        
        ResultadotblLista.setModel (model);
        
        ResultadotblLista.setForeground(Color.BLACK);
        Font font = new Font ("",1,12);
        ResultadotblLista.setFont(font);
        ResultadotblLista.setRowHeight (30);
        
        for (int i = 0; i < lista.size(); i++)
        {
            int Codigo = lista.get(i).getCodigo();
            String Nombre = lista.get(i).getNombre();
            String Descripcion = lista.get(i).getDescripcion();
            Boolean Estado = lista.get(i).getEstado();
                       
            Object[] data = {Codigo,Nombre,Descripcion,Estado};
            
            model.addRow(data);           
        }        
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FiltroCodigo;
    private javax.swing.JLabel FiltroEstado;
    private javax.swing.JLabel FiltroNombre;
    private javax.swing.JButton FiltrobtnAgregar;
    private javax.swing.JButton FiltrobtnBusqueda;
    private javax.swing.JTextField FiltrotxtCodigo;
    private javax.swing.JTextField FiltrotxtEstado;
    private javax.swing.JTextField FiltrotxtNombre;
    private javax.swing.JLabel GeneroTitulo;
    private javax.swing.JLabel MantenimientoCodigo;
    private javax.swing.JLabel MantenimientoDescripcion;
    private javax.swing.JLabel MantenimientoEstado;
    private javax.swing.JLabel MantenimientoNombre;
    private javax.swing.JButton MantenimientobtnCancelar;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JTextField MantenimientotxtCodigo;
    private javax.swing.JTextField MantenimientotxtDescripcion;
    private javax.swing.JTextField MantenimientotxtEstado;
    private javax.swing.JTextField MantenimientotxtNombre;
    private javax.swing.JPanel PnlFilter;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JPanel PnlResultado;
    private javax.swing.JTable ResultadotblLista;
    private javax.swing.JScrollPane ResultadotblListaScrl;
    private javax.swing.JTabbedPane TabControl;
    // End of variables declaration//GEN-END:variables
}