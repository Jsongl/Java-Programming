/*  Form principal para las Itinerarios.
    
    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Presentaciones;

import Mantenimientos.MantenimientoCuidador;
import Entidades.Cuidador;
import Mantenimientos.MantenimientoEspecie;
import Entidades.Especie;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
        
public class FrmCuidador extends javax.swing.JFrame {

    MantenimientoCuidador mantenimiento = new MantenimientoCuidador ();
    Cuidador temporalCuidador;
    MantenimientoEspecie CargarEspecie = new MantenimientoEspecie ();
    DefaultListModel ModeloLista = new DefaultListModel();
        
    
    public FrmCuidador() {
        initComponents();
        CargarEspecie.CargarDeArchivo();
        mantenimiento.CargarDeArchivo();
        
        if (mantenimiento.ListadoCuidador().size() <= 0)
        {
            BusquedabtnBuscar.setEnabled(false);
        }
        else
        {
            BusquedabtnBuscar.setEnabled(true);
        }
        
        CargarEspecies();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlGeneral = new javax.swing.JTabbedPane();
        PnlBusqueda = new javax.swing.JPanel();
        BusquedaCodigo = new javax.swing.JLabel();
        BusquedatxtCodigo = new javax.swing.JTextField();
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
        MantenimientotxtDireccion = new javax.swing.JTextField();
        MantenimientoDireccion = new javax.swing.JLabel();
        MantenimientoTelefono = new javax.swing.JLabel();
        MantenimientotxtTelefono = new javax.swing.JTextField();
        MantenimientoFechaIngreso = new javax.swing.JLabel();
        MantenimientotxtFechaIngreso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MantenimientolstEspecies = new javax.swing.JList();
        MantenimientoEspecies = new javax.swing.JLabel();
        PnlListado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        ListadobtnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Cuidadores");
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
                        .addComponent(BusquedaCodigo)
                        .addGap(22, 22, 22)
                        .addComponent(BusquedatxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlBusquedaLayout.createSequentialGroup()
                        .addGap(0, 169, Short.MAX_VALUE)
                        .addComponent(BusquedabtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BusquedabtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PnlBusquedaLayout.setVerticalGroup(
            PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlBusquedaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PnlBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusquedaCodigo)
                    .addComponent(BusquedatxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
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

        MantenimientoDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoDireccion.setText("Direccion:");

        MantenimientoTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoTelefono.setText("Telefono:");

        MantenimientoFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoFechaIngreso.setText("Fecha Ingreso:");

        MantenimientolstEspecies.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(MantenimientolstEspecies);

        MantenimientoEspecies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoEspecies.setText("Especies:");

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientoFechaIngreso)
                                    .addComponent(MantenimientoTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MantenimientotxtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                    .addComponent(MantenimientotxtTelefono)))
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientoNombre)
                                    .addComponent(MantenimientoCodigo)
                                    .addComponent(MantenimientoDireccion))
                                .addGap(18, 18, 18)
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                        .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MantenimientoEspecies))
                                    .addComponent(MantenimientotxtNombre)
                                    .addComponent(MantenimientotxtDireccion))))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoCodigo)
                            .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MantenimientoEspecies))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoNombre)
                            .addComponent(MantenimientotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoDireccion)
                            .addComponent(MantenimientotxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoTelefono)
                            .addComponent(MantenimientotxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoFechaIngreso)
                            .addComponent(MantenimientotxtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MantenimientobtnGuardar)
                    .addComponent(MantenimientobtnCancelar)
                    .addComponent(MantenimientobtnRemover))
                .addGap(18, 18, 18))
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
        jLabel1.setText("Mantenimiento de Cuidadores");

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
                .addComponent(PnlGeneral)
                .addContainerGap())
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
        
        temporalCuidador = new Cuidador();
        
        if (MantenimientotxtNombre.getText().isEmpty()
                || MantenimientotxtDireccion.getText().isEmpty()
                || MantenimientotxtTelefono.getText().isEmpty()
                || MantenimientotxtFechaIngreso.getText().isEmpty()
                || MantenimientolstEspecies.getSelectedIndices().length == 0)
        {
            JOptionPane.showMessageDialog(null, "Campos vacios. Llene todos los campos", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            

        if (MantenimientotxtCodigo.getText().isEmpty())
        {
            temporalCuidador.setCodigo(0);
            temporalCuidador.setNombre(MantenimientotxtNombre.getText());
            temporalCuidador.setDireccion(MantenimientotxtDireccion.getText());
            temporalCuidador.setTelefono(MantenimientotxtTelefono.getText());
            temporalCuidador.setFechaIngreso(MantenimientotxtFechaIngreso.getText());
            temporalCuidador.setEspeciesId(ObtenerEspeciesSelecionados());
            
            mantenimiento.AgregarCuidador(temporalCuidador);
        }
        else 
        {    
            temporalCuidador.setCodigo(Integer.parseInt(MantenimientotxtCodigo.getText()));
            temporalCuidador.setNombre(MantenimientotxtNombre.getText());
            temporalCuidador.setDireccion(MantenimientotxtDireccion.getText());
            temporalCuidador.setTelefono(MantenimientotxtTelefono.getText());
            temporalCuidador.setFechaIngreso(MantenimientotxtFechaIngreso.getText());
            temporalCuidador.setEspeciesId(ObtenerEspeciesSelecionados());
            
            mantenimiento.ModificarCuidador(temporalCuidador);
        }
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnGuardarMouseClicked

    private ArrayList<Integer> ObtenerEspeciesSelecionados ()
    {
        int[] list = MantenimientolstEspecies.getSelectedIndices();
        ArrayList<Integer> lista = new ArrayList<> ();
        
        if (list.length > 0)
        {
            for (int contador=0; contador <= list.length-1; contador++)
            {
                lista.add(CargarEspecie.obtenerEspecieID
                            (String.valueOf(ModeloLista.get(list[contador]))));
            }
        }
        
        return lista;
    }
    
    private void PnlGeneralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnlGeneralFocusGained
        CargarTabla();
    }//GEN-LAST:event_PnlGeneralFocusGained

   
    private void BusquedabtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedabtnBuscarMouseClicked

        temporalCuidador = new Cuidador ();
        
        if (BusquedatxtCodigo.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo de busqueda esta vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            temporalCuidador = mantenimiento.BusquedaCuidador(
                Integer.parseInt(BusquedatxtCodigo.getText()));
        }
      
        
        
        if (temporalCuidador == null)
            JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        else
        {
            MantenimientotxtCodigo.setText(String.valueOf(temporalCuidador.getCodigo()));
            MantenimientotxtNombre.setText(temporalCuidador.getNombre());
            MantenimientotxtDireccion.setText(temporalCuidador.getDireccion());
            MantenimientotxtTelefono.setText(temporalCuidador.getTelefono());
            MantenimientotxtFechaIngreso.setText(temporalCuidador.getFechaIngreso());
            
            
            MarcarEspecies(temporalCuidador.getEspeciesId());
            
            PnlGeneral.setEnabledAt(0,false);
            PnlGeneral.setEnabledAt(1,true);
            PnlGeneral.setSelectedIndex(1);
        }
        
        MantenimientobtnGuardar.setEnabled(true);
        MantenimientobtnRemover.setEnabled(true);
                     
    }//GEN-LAST:event_BusquedabtnBuscarMouseClicked

    private void CargarEspecies ()
    {
  
        for (Especie Temporal:CargarEspecie.ListadoEspecie())
        {
            ModeloLista.addElement(Temporal.getNombre());
        }
        
        MantenimientolstEspecies.setModel(ModeloLista);
        MantenimientolstEspecies.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    
    private void MarcarEspecies (ArrayList<Integer> ListaIds)
    {
        int [] ListaIdsArreglo = new int [ListaIds.size()];

        for (int contador=0; contador<=ListaIds.size()-1; contador++)
        {
            ListaIdsArreglo[contador] = ModeloLista.indexOf
                    (CargarEspecie.obtenerEspecieNombre(ListaIds.get(contador)));
        }
        
        MantenimientolstEspecies.setSelectedIndices(ListaIdsArreglo);
    }
    
    private void MantenimientobtnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnRemoverMouseClicked
        mantenimiento.RemoverCuidador(Integer.parseInt(MantenimientotxtCodigo.getText()));
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnRemoverMouseClicked

    private void ListadobtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadobtnEditarMouseClicked
        
        int registrocargar = ResultadotblLista.getSelectedRow();
        temporalCuidador = new Cuidador ();
        
        temporalCuidador = mantenimiento.BusquedaCuidadorIndice(ResultadotblLista.getSelectedRow());
        
        MantenimientotxtCodigo.setText(String.valueOf(temporalCuidador.getCodigo()));
        MantenimientotxtNombre.setText(temporalCuidador.getNombre());
        MantenimientotxtDireccion.setText(temporalCuidador.getDireccion());
        MantenimientotxtTelefono.setText(temporalCuidador.getTelefono());
        MantenimientotxtFechaIngreso.setText(temporalCuidador.getFechaIngreso());
        
        MarcarEspecies(temporalCuidador.getEspeciesId());
            
        PnlGeneral.setEnabledAt(0,false);
        PnlGeneral.setEnabledAt(1,true);
        MantenimientobtnRemover.setEnabled(true);
        PnlGeneral.setSelectedIndex(1);
        
    }//GEN-LAST:event_ListadobtnEditarMouseClicked

    
    
    public void LimpiarCampos ()
    {
        BusquedatxtCodigo.setText("");
        
        MantenimientotxtCodigo.setText("");
        MantenimientotxtNombre.setText("");
        MantenimientotxtDireccion.setText("");
        MantenimientotxtTelefono.setText("");
        MantenimientotxtFechaIngreso.setText("");
        
        MantenimientolstEspecies.clearSelection();
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
            java.util.logging.Logger.getLogger(FrmCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCuidador().setVisible(true);
            }
        });
    }
    
    private void CargarTabla()
    {
        ArrayList<Cuidador> lista = mantenimiento.ListadoCuidador();
        
        String[] columnNames = {"Codigo","Nombre","Direccion","Telefono","FechaIngreso"};
        DefaultTableModel model = new DefaultTableModel ();
        
        model.setColumnIdentifiers (columnNames);
        
        ResultadotblLista.setModel (model);
        
                       
        for (int i = 0; i < lista.size(); i++)
        {
            int Codigo = lista.get(i).getCodigo();
            String Nombre = lista.get(i).getNombre();
            String Direccion = lista.get(i).getDireccion();
            String Telefono = lista.get(i).getTelefono();
            String FechaIngreso = lista.get(i).getFechaIngreso();
            
            Object[] data = {Codigo, Nombre, Direccion, Telefono, FechaIngreso};
            
            model.addRow(data); 
        }        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BusquedaCodigo;
    private javax.swing.JButton BusquedabtnBuscar;
    private javax.swing.JButton BusquedabtnNuevo;
    private javax.swing.JTextField BusquedatxtCodigo;
    private javax.swing.JButton ListadobtnEditar;
    private javax.swing.JLabel MantenimientoCodigo;
    private javax.swing.JLabel MantenimientoDireccion;
    private javax.swing.JLabel MantenimientoEspecies;
    private javax.swing.JLabel MantenimientoFechaIngreso;
    private javax.swing.JLabel MantenimientoNombre;
    private javax.swing.JLabel MantenimientoTelefono;
    private javax.swing.JButton MantenimientobtnCancelar;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JButton MantenimientobtnRemover;
    private javax.swing.JList MantenimientolstEspecies;
    private javax.swing.JTextField MantenimientotxtCodigo;
    private javax.swing.JTextField MantenimientotxtDireccion;
    private javax.swing.JTextField MantenimientotxtFechaIngreso;
    private javax.swing.JTextField MantenimientotxtNombre;
    private javax.swing.JTextField MantenimientotxtTelefono;
    private javax.swing.JPanel PnlBusqueda;
    private javax.swing.JTabbedPane PnlGeneral;
    private javax.swing.JPanel PnlListado;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JTable ResultadotblLista;
    private javax.swing.JScrollPane ResultadotblListaScrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
