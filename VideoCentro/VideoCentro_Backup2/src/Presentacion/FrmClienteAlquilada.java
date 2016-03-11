/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Programación
 */
public class FrmClienteAlquilada extends javax.swing.JFrame {

    /**
     * Creates new form FrmGenero
     */
    public FrmClienteAlquilada() {
        initComponents();
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
        FiltroCodigoCliente = new javax.swing.JLabel();
        FiltroCodigoAlquilada = new javax.swing.JLabel();
        FiltrotxtCodigoAlquilada = new javax.swing.JTextField();
        FiltrotxtCodigoCliente = new javax.swing.JTextField();
        FiltrobtnBusqueda = new javax.swing.JButton();
        FiltrobtnAgregar = new javax.swing.JButton();
        PnlMantenimiento = new javax.swing.JPanel();
        MantenimientoCodigoAlquilada = new javax.swing.JLabel();
        MantenimientoCodigoCliente = new javax.swing.JLabel();
        MantenimientotxtCodigoAlquilada = new javax.swing.JTextField();
        MantenimientotxtCodigoCliente = new javax.swing.JTextField();
        MantenimientobtnGuardar = new javax.swing.JButton();
        PnlResultado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        ClienteAlquiladaTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FiltroCodigoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiltroCodigoCliente.setText("Codigo Cliente");

        FiltroCodigoAlquilada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiltroCodigoAlquilada.setText("Codigo Alquilada");

        FiltrobtnBusqueda.setText("Busqueda");

        FiltrobtnAgregar.setText("Agregar");
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
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FiltroCodigoAlquilada)
                    .addComponent(FiltroCodigoCliente))
                .addGap(18, 18, 18)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FiltrotxtCodigoAlquilada, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(FiltrotxtCodigoCliente))
                .addGap(38, 38, 38)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FiltrobtnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        PnlFilterLayout.setVerticalGroup(
            PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFilterLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroCodigoAlquilada)
                    .addComponent(FiltrotxtCodigoAlquilada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnBusqueda))
                .addGap(17, 17, 17)
                .addGroup(PnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiltroCodigoCliente)
                    .addComponent(FiltrotxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrobtnAgregar))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        TabControl.addTab("Filtro", PnlFilter);

        PnlMantenimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        MantenimientoCodigoAlquilada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoCodigoAlquilada.setText("Codigo Alquilada");

        MantenimientoCodigoCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoCodigoCliente.setText("Codigo Cliente");

        MantenimientotxtCodigoAlquilada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MantenimientotxtCodigoAlquiladaActionPerformed(evt);
            }
        });

        MantenimientobtnGuardar.setText("Guardar");

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoCodigoCliente)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtCodigoCliente))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoCodigoAlquilada)
                        .addGap(18, 18, 18)
                        .addComponent(MantenimientotxtCodigoAlquilada, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoCodigoAlquilada)
                    .addComponent(MantenimientotxtCodigoAlquilada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientoCodigoCliente)
                    .addComponent(MantenimientotxtCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantenimientobtnGuardar))
                .addContainerGap(215, Short.MAX_VALUE))
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

        ClienteAlquiladaTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ClienteAlquiladaTitulo.setText("Mantenimiento Cliente Alquilada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabControl, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClienteAlquiladaTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ClienteAlquiladaTitulo)
                .addGap(18, 18, 18)
                .addComponent(TabControl)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MantenimientotxtCodigoAlquiladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MantenimientotxtCodigoAlquiladaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MantenimientotxtCodigoAlquiladaActionPerformed

    private void FiltrobtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiltrobtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltrobtnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmClienteAlquilada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClienteAlquilada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClienteAlquilada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClienteAlquilada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClienteAlquilada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClienteAlquiladaTitulo;
    private javax.swing.JLabel FiltroCodigoAlquilada;
    private javax.swing.JLabel FiltroCodigoCliente;
    private javax.swing.JButton FiltrobtnAgregar;
    private javax.swing.JButton FiltrobtnBusqueda;
    private javax.swing.JTextField FiltrotxtCodigoAlquilada;
    private javax.swing.JTextField FiltrotxtCodigoCliente;
    private javax.swing.JLabel MantenimientoCodigoAlquilada;
    private javax.swing.JLabel MantenimientoCodigoCliente;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JTextField MantenimientotxtCodigoAlquilada;
    private javax.swing.JTextField MantenimientotxtCodigoCliente;
    private javax.swing.JPanel PnlFilter;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JPanel PnlResultado;
    private javax.swing.JTable ResultadotblLista;
    private javax.swing.JScrollPane ResultadotblListaScrl;
    private javax.swing.JTabbedPane TabControl;
    // End of variables declaration//GEN-END:variables
}
