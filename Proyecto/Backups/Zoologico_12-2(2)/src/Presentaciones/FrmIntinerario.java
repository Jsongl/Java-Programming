/*  Form principal para las intinerarios.
    
    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Presentaciones;

import Mantenimientos.MantenimientoIntinerario;
import Entidades.Intinerario;
import Mantenimientos.MantenimientoZona;
import Entidades.Zona;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
        
public class FrmIntinerario extends javax.swing.JFrame {

    MantenimientoIntinerario mantenimiento = new MantenimientoIntinerario ();
    Intinerario temporalIntinerario;
    MantenimientoZona CargarZona = new MantenimientoZona ();
    DefaultListModel ModeloLista = new DefaultListModel();
        
    
    public FrmIntinerario() {
        initComponents();
        CargarZona.CargarDeArchivo();
        mantenimiento.CargarDeArchivo();
        
        if (mantenimiento.ListadoIntinerario().size() <= 0)
        {
            BusquedabtnBuscar.setEnabled(false);
        }
        else
        {
            BusquedabtnBuscar.setEnabled(true);
        }
        
        CargarZonas();
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
        MantenimientoDuracion = new javax.swing.JLabel();
        MantenimientotxtDuracion = new javax.swing.JTextField();
        MantenimientobtnGuardar = new javax.swing.JButton();
        MantenimientobtnCancelar = new javax.swing.JButton();
        MantenimientobtnRemover = new javax.swing.JButton();
        MantenimientotxtLongitud = new javax.swing.JTextField();
        MantenimientoLongitud = new javax.swing.JLabel();
        MantenimientoMaxVisitantes = new javax.swing.JLabel();
        MantenimientotxtMaxVisitantes = new javax.swing.JTextField();
        MantenimientoNumEspecies = new javax.swing.JLabel();
        MantenimientotxtNumEspecies = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MantenimientolstZonas = new javax.swing.JList();
        MantenimientoZonas = new javax.swing.JLabel();
        PnlListado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        ListadobtnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Intinerarios");
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
                .addComponent(BusquedaCodigo)
                .addGap(22, 22, 22)
                .addComponent(BusquedatxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
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

        MantenimientoDuracion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoDuracion.setText("Duracion:");

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

        MantenimientoLongitud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoLongitud.setText("Longitud");

        MantenimientoMaxVisitantes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoMaxVisitantes.setText("Maximo de Visitantes:");

        MantenimientoNumEspecies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoNumEspecies.setText("Numero de Especies:");

        MantenimientolstZonas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(MantenimientolstZonas);

        MantenimientoZonas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoZonas.setText("Zonas:");

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientoDuracion)
                                    .addComponent(MantenimientoCodigo)
                                    .addComponent(MantenimientoLongitud))
                                .addGap(18, 18, 18)
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientotxtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MantenimientotxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(MantenimientoZonas))))
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientoMaxVisitantes)
                                    .addComponent(MantenimientoNumEspecies))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientotxtNumEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MantenimientotxtMaxVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMantenimientoLayout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(MantenimientoZonas))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoDuracion)
                            .addComponent(MantenimientotxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoLongitud)
                            .addComponent(MantenimientotxtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoMaxVisitantes)
                            .addComponent(MantenimientotxtMaxVisitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoNumEspecies)
                            .addComponent(MantenimientotxtNumEspecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        jLabel1.setText("Mantenimiento de Intinerarios");

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
        
        temporalIntinerario = new Intinerario();
        
        if (MantenimientotxtDuracion.getText().isEmpty()
                || MantenimientotxtLongitud.getText().isEmpty()
                || MantenimientotxtMaxVisitantes.getText().isEmpty()
                || MantenimientotxtNumEspecies.getText().isEmpty()
                || MantenimientolstZonas.getSelectedIndices().length == 0)
        {
            JOptionPane.showMessageDialog(null, "Campos vacios. Llene todos los campos", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            

        if (MantenimientotxtCodigo.getText().isEmpty())
        {
            temporalIntinerario.setCodigo(0);
            temporalIntinerario.setDuracion(Integer.parseInt(MantenimientotxtDuracion.getText()));
            temporalIntinerario.setLongitud(Integer.parseInt(MantenimientotxtLongitud.getText()));
            temporalIntinerario.setMaximoVisitantes(Integer.parseInt(MantenimientotxtMaxVisitantes.getText()));
            temporalIntinerario.setNumeroEspecies(Integer.parseInt(MantenimientotxtNumEspecies.getText()));
            temporalIntinerario.setZonasId(ObtenerZonasSelecionadas());
            
            mantenimiento.AgregarIntinerario(temporalIntinerario);
        }
        else 
        {    
            temporalIntinerario.setCodigo(Integer.parseInt(MantenimientotxtCodigo.getText()));
            temporalIntinerario.setDuracion(Integer.parseInt(MantenimientotxtDuracion.getText()));
            temporalIntinerario.setLongitud(Integer.parseInt(MantenimientotxtLongitud.getText()));
            temporalIntinerario.setMaximoVisitantes(Integer.parseInt(MantenimientotxtMaxVisitantes.getText()));
            temporalIntinerario.setNumeroEspecies(Integer.parseInt(MantenimientotxtNumEspecies.getText()));
            temporalIntinerario.setZonasId(ObtenerZonasSelecionadas());
            
            mantenimiento.ModificarIntinerario(temporalIntinerario);
        }
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnGuardarMouseClicked

    private ArrayList<Integer> ObtenerZonasSelecionadas ()
    {
        int[] list = MantenimientolstZonas.getSelectedIndices();
        ArrayList<Integer> lista = new ArrayList<> ();
        
        if (list.length > 0)
        {
            for (int contador=0; contador <= list.length-1; contador++)
            {
                lista.add(CargarZona.obtenerZonaID
                            (String.valueOf(ModeloLista.get(list[contador]))));
            }
        }
        
        return lista;
    }
    
    private void PnlGeneralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnlGeneralFocusGained
        CargarTabla();
    }//GEN-LAST:event_PnlGeneralFocusGained

   
    private void BusquedabtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedabtnBuscarMouseClicked

        temporalIntinerario = new Intinerario ();
        
        if (BusquedatxtCodigo.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo de busqueda esta vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            temporalIntinerario = mantenimiento.BusquedaIntinerario(
                Integer.parseInt(BusquedatxtCodigo.getText()));
        }
      
        
        
        if (temporalIntinerario == null)
            JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        else
        {
            MantenimientotxtCodigo.setText(String.valueOf(temporalIntinerario.getCodigo()));
            MantenimientotxtDuracion.setText(String.valueOf(temporalIntinerario.getDuracion()));
            MantenimientotxtLongitud.setText(String.valueOf(temporalIntinerario.getLongitud()));
            MantenimientotxtMaxVisitantes.setText(String.valueOf(temporalIntinerario.getMaximoVisitantes()));
            MantenimientotxtNumEspecies.setText(String.valueOf(temporalIntinerario.getNumeroEspecies()));
            
            
            MarcarZonas(temporalIntinerario.getZonasId());
            
            PnlGeneral.setEnabledAt(0,false);
            PnlGeneral.setEnabledAt(1,true);
            PnlGeneral.setSelectedIndex(1);
        }
        
        MantenimientobtnGuardar.setEnabled(true);
        MantenimientobtnRemover.setEnabled(true);
                     
    }//GEN-LAST:event_BusquedabtnBuscarMouseClicked

    private void CargarZonas ()
    {
        
        for (Zona Temporal:CargarZona.ListadoZona())
        {
            ModeloLista.addElement(Temporal.getNombre());
        }
        
        MantenimientolstZonas.setModel(ModeloLista);
        MantenimientolstZonas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    
    private void MarcarZonas (ArrayList<Integer> ListaIds)
    {
        int [] ListaIdsArreglo = new int [ListaIds.size()];

        for (int contador=0; contador<=ListaIds.size()-1; contador++)
        {
            ListaIdsArreglo[contador] = ModeloLista.indexOf
                (CargarZona.obtenerZonaNombre(ListaIds.get(contador)));
        }
        
        MantenimientolstZonas.setSelectedIndices(ListaIdsArreglo);
    }
    
    private void MantenimientobtnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnRemoverMouseClicked
        mantenimiento.RemoverIntinerario(Integer.parseInt(MantenimientotxtCodigo.getText()));
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnRemoverMouseClicked

    private void ListadobtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadobtnEditarMouseClicked
        
        int registrocargar = ResultadotblLista.getSelectedRow();
        temporalIntinerario = new Intinerario ();
        
        temporalIntinerario = mantenimiento.BusquedaIntinerarioIndice(ResultadotblLista.getSelectedRow());
        
        MantenimientotxtCodigo.setText(String.valueOf(temporalIntinerario.getCodigo()));
        MantenimientotxtDuracion.setText(String.valueOf(temporalIntinerario.getDuracion()));
        MantenimientotxtLongitud.setText(String.valueOf(temporalIntinerario.getLongitud()));
        MantenimientotxtMaxVisitantes.setText(String.valueOf(temporalIntinerario.getMaximoVisitantes()));
        MantenimientotxtNumEspecies.setText(String.valueOf(temporalIntinerario.getNumeroEspecies()));
        
        MarcarZonas(temporalIntinerario.getZonasId());
            
        PnlGeneral.setEnabledAt(0,false);
        PnlGeneral.setEnabledAt(1,true);
        MantenimientobtnRemover.setEnabled(true);
        PnlGeneral.setSelectedIndex(1);
        
    }//GEN-LAST:event_ListadobtnEditarMouseClicked

    
    
    public void LimpiarCampos ()
    {
        BusquedatxtCodigo.setText("");
        
        MantenimientotxtCodigo.setText("");
        MantenimientotxtDuracion.setText("");
        MantenimientotxtLongitud.setText("");
        MantenimientotxtMaxVisitantes.setText("");
        MantenimientotxtNumEspecies.setText("");
        
        MantenimientolstZonas.clearSelection();
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
            java.util.logging.Logger.getLogger(FrmIntinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIntinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIntinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIntinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIntinerario().setVisible(true);
            }
        });
    }
    
    private void CargarTabla()
    {
        ArrayList<Intinerario> lista = mantenimiento.ListadoIntinerario();
        
        String[] columnNames = {"Codigo","Duracion","Longitud","MaximoVisitantes","NumeroEspecies"};
        DefaultTableModel model = new DefaultTableModel ();
        
        model.setColumnIdentifiers (columnNames);
        
        ResultadotblLista.setModel (model);
        
                       
        for (int i = 0; i < lista.size(); i++)
        {
            int Codigo = lista.get(i).getCodigo();
            int duracion = lista.get(i).getDuracion();
            int longitud = lista.get(i).getLongitud();
            int maximoVisitantes = lista.get(i).getMaximoVisitantes();
            int numeroEspecies = lista.get(i).getNumeroEspecies();
            
            Object[] data = {Codigo, duracion, longitud, maximoVisitantes, numeroEspecies};
            
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
    private javax.swing.JLabel MantenimientoDuracion;
    private javax.swing.JLabel MantenimientoLongitud;
    private javax.swing.JLabel MantenimientoMaxVisitantes;
    private javax.swing.JLabel MantenimientoNumEspecies;
    private javax.swing.JLabel MantenimientoZonas;
    private javax.swing.JButton MantenimientobtnCancelar;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JButton MantenimientobtnRemover;
    private javax.swing.JList MantenimientolstZonas;
    private javax.swing.JTextField MantenimientotxtCodigo;
    private javax.swing.JTextField MantenimientotxtDuracion;
    private javax.swing.JTextField MantenimientotxtLongitud;
    private javax.swing.JTextField MantenimientotxtMaxVisitantes;
    private javax.swing.JTextField MantenimientotxtNumEspecies;
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
