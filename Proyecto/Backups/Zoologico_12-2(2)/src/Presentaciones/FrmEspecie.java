/*  Form principal para las intinerarios.
    
    *Proyecto de programacion I - Tercer cuatrimestre 2015
    Estudiante: JangSong Leung
*/

package Presentaciones;

import Mantenimientos.MantenimientoEspecie;
import Mantenimientos.MantenimientoZona;
import Mantenimientos.MantenimientoHabitat;
import Entidades.Especie;
import Entidades.Zona;
import Entidades.Habitat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
        
public class FrmEspecie extends javax.swing.JFrame {

    MantenimientoEspecie mantenimiento = new MantenimientoEspecie ();
    Especie temporalEspecies;
    MantenimientoZona CargarZona = new MantenimientoZona ();
    MantenimientoHabitat CargarHabitat = new MantenimientoHabitat ();
    DefaultListModel ModeloLista = new DefaultListModel();
    DefaultListModel ModeloLista2 = new DefaultListModel();
        
    
    public FrmEspecie() {
        initComponents();
        CargarZona.CargarDeArchivo();
        CargarHabitat.CargarDeArchivo();
        
        mantenimiento.CargarDeArchivo();
        
        if (mantenimiento.ListadoEspecie().size() <= 0)
        {
            BusquedabtnBuscar.setEnabled(false);
        }
        else
        {
            BusquedabtnBuscar.setEnabled(true);
        }
        
        CargarHabitats();
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
        MantenimientoNombre = new javax.swing.JLabel();
        MantenimientotxtNombre = new javax.swing.JTextField();
        MantenimientobtnGuardar = new javax.swing.JButton();
        MantenimientobtnCancelar = new javax.swing.JButton();
        MantenimientobtnRemover = new javax.swing.JButton();
        MantenimientotxtNombreCientifico = new javax.swing.JTextField();
        MantenimientoNombreCientifico = new javax.swing.JLabel();
        MantenimientoDescripcion = new javax.swing.JLabel();
        MantenimientotxtDescripcion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MantenimientolstHabitats = new javax.swing.JList();
        MantenimientoHabitats = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MantenimientolstZonas = new javax.swing.JList();
        MantenimientoZonas = new javax.swing.JLabel();
        PnlListado = new javax.swing.JPanel();
        ResultadotblListaScrl = new javax.swing.JScrollPane();
        ResultadotblLista = new javax.swing.JTable();
        ListadobtnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Especies");
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
                .addContainerGap(325, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
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

        MantenimientoNombreCientifico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoNombreCientifico.setText("Nombre Cientifico:");

        MantenimientoDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoDescripcion.setText("Descripcion:");

        MantenimientolstHabitats.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(MantenimientolstHabitats);

        MantenimientoHabitats.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoHabitats.setText("Habitats:");

        MantenimientolstZonas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(MantenimientolstZonas);

        MantenimientoZonas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MantenimientoZonas.setText("Zonas:");

        javax.swing.GroupLayout PnlMantenimientoLayout = new javax.swing.GroupLayout(PnlMantenimiento);
        PnlMantenimiento.setLayout(PnlMantenimientoLayout);
        PnlMantenimientoLayout.setHorizontalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(MantenimientobtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MantenimientobtnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MantenimientobtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MantenimientoCodigo)
                                    .addComponent(MantenimientoNombre)
                                    .addComponent(MantenimientoNombreCientifico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MantenimientotxtNombre)
                                    .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MantenimientotxtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(MantenimientoDescripcion)
                                .addGap(18, 18, 18)
                                .addComponent(MantenimientotxtDescripcion)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MantenimientoHabitats))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addComponent(MantenimientoZonas)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        PnlMantenimientoLayout.setVerticalGroup(
            PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientotxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MantenimientoCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientotxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MantenimientoNombre))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoNombreCientifico)
                            .addComponent(MantenimientotxtNombreCientifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoDescripcion)
                            .addComponent(MantenimientotxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientobtnRemover)
                            .addComponent(MantenimientobtnCancelar)
                            .addComponent(MantenimientobtnGuardar))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(PnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MantenimientoZonas)
                            .addComponent(MantenimientoHabitats))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(19, 19, 19))))
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
            .addGroup(PnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ListadobtnEditar)))
                .addContainerGap())
        );
        PnlListadoLayout.setVerticalGroup(
            PnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResultadotblListaScrl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListadobtnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PnlGeneral.addTab("Listado", PnlListado);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Mantenimiento de Especies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PnlGeneral))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 257, Short.MAX_VALUE)
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
        
        temporalEspecies = new Especie();
        
        if (MantenimientotxtNombre.getText().isEmpty()
                || MantenimientotxtNombreCientifico.getText().isEmpty()
                || MantenimientotxtDescripcion.getText().isEmpty()
                || MantenimientolstHabitats.getSelectedIndices().length == 0
                || MantenimientolstZonas.getSelectedIndices().length == 0)
        {
            JOptionPane.showMessageDialog(null, "Campos vacios. Llene todos los campos", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
            

        if (MantenimientotxtCodigo.getText().isEmpty())
        {
            temporalEspecies.setCodigo(0);
            temporalEspecies.setNombre(MantenimientotxtNombre.getText());
            temporalEspecies.setNombreCientifico(MantenimientotxtNombreCientifico.getText());
            temporalEspecies.setDescripcion(MantenimientotxtDescripcion.getText());
            temporalEspecies.setHabitatsId(ObtenerHabitatsSelecionadas());
            temporalEspecies.setZonasId(ObtenerZonasSelecionadas());
            
            mantenimiento.AgregarEspecie(temporalEspecies);
        }
        else 
        {    
            temporalEspecies.setCodigo(Integer.parseInt(MantenimientotxtCodigo.getText()));
            temporalEspecies.setNombre(MantenimientotxtNombre.getText());
            temporalEspecies.setNombreCientifico(MantenimientotxtNombreCientifico.getText());
            temporalEspecies.setDescripcion(MantenimientotxtDescripcion.getText());
            temporalEspecies.setHabitatsId(ObtenerHabitatsSelecionadas());
            temporalEspecies.setZonasId(ObtenerZonasSelecionadas());
            
            mantenimiento.ModificarEspecie(temporalEspecies);
        }
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnGuardarMouseClicked

    private ArrayList<Integer> ObtenerHabitatsSelecionadas ()
    {
        int[] list = MantenimientolstHabitats.getSelectedIndices();
        ArrayList<Integer> lista = new ArrayList<> ();
        
        if (list.length > 0)
        {
            for (int contador=0; contador <= list.length-1; contador++)
            {
                lista.add(CargarHabitat.obtenerHabitatID
                            (String.valueOf(ModeloLista.get(list[contador]))));
            }
        }
        
        return lista;
    }
    
    private ArrayList<Integer> ObtenerZonasSelecionadas ()
    {
        int[] list = MantenimientolstZonas.getSelectedIndices();
        ArrayList<Integer> lista = new ArrayList<> ();
        
        if (list.length > 0)
        {
            for (int contador=0; contador <= list.length-1; contador++)
            {
                lista.add(CargarZona.obtenerZonaID
                            (String.valueOf(ModeloLista2.get(list[contador]))));
            }
        }
        
        return lista;
    }
    
    private void PnlGeneralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PnlGeneralFocusGained
        CargarTabla();
    }//GEN-LAST:event_PnlGeneralFocusGained

   
    private void BusquedabtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedabtnBuscarMouseClicked

        temporalEspecies = new Especie ();
        
        if (BusquedatxtCodigo.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "El campo de busqueda esta vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            temporalEspecies = mantenimiento.BusquedaEspecie(
                Integer.parseInt(BusquedatxtCodigo.getText()));
        }
      
        
        
        if (temporalEspecies == null)
            JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        else
        {
            MantenimientotxtCodigo.setText(String.valueOf(temporalEspecies.getCodigo()));
            MantenimientotxtNombre.setText(temporalEspecies.getNombre());
            MantenimientotxtNombreCientifico.setText(temporalEspecies.getNombreCientifico());
            MantenimientotxtDescripcion.setText(temporalEspecies.getDescripcion());

            MarcarHabitats(temporalEspecies.getHabitatsId());
            MarcarZonas(temporalEspecies.getZonasId());
            
            PnlGeneral.setEnabledAt(0,false);
            PnlGeneral.setEnabledAt(1,true);
            PnlGeneral.setSelectedIndex(1);
        }
        
        MantenimientobtnGuardar.setEnabled(true);
        MantenimientobtnRemover.setEnabled(true);
                     
    }//GEN-LAST:event_BusquedabtnBuscarMouseClicked

    private void CargarHabitats ()
    {
        for (Habitat Temporal:CargarHabitat.ListadoHabitat())
        {
            ModeloLista.addElement(Temporal.getNombre());
        }
        
        MantenimientolstHabitats.setModel(ModeloLista);
        MantenimientolstHabitats.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    
    private void CargarZonas ()
    {
        for (Zona Temporal:CargarZona.ListadoZona())
        {
            ModeloLista2.addElement(Temporal.getNombre());
        }
        
        MantenimientolstZonas.setModel(ModeloLista2);
        MantenimientolstZonas.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
    
    private void MarcarHabitats (ArrayList<Integer> ListaIds)
    {
        int [] ListaIdsArreglo = new int [ListaIds.size()];

        for (int contador=0; contador<=ListaIds.size()-1; contador++)
        {
            ListaIdsArreglo[contador] = ModeloLista.indexOf
                (CargarHabitat.obtenerHabitatNombre(ListaIds.get(contador)));
        }
        
        MantenimientolstHabitats.setSelectedIndices(ListaIdsArreglo);
    }
    
    private void MarcarZonas (ArrayList<Integer> ListaIds)
    {
        int [] ListaIdsArreglo = new int [ListaIds.size()];

        for (int contador=0; contador<=ListaIds.size()-1; contador++)
        {
            ListaIdsArreglo[contador] = ModeloLista2.indexOf
                (CargarZona.obtenerZonaNombre(ListaIds.get(contador)));
        }
        
        MantenimientolstZonas.setSelectedIndices(ListaIdsArreglo);
    }
    
    private void MantenimientobtnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MantenimientobtnRemoverMouseClicked
        mantenimiento.RemoverEspecie(Integer.parseInt(MantenimientotxtCodigo.getText()));
        
        PnlGeneral.setEnabledAt(0,true);
        PnlGeneral.setEnabledAt(1,false);
        PnlGeneral.setSelectedIndex(0);
        LimpiarCampos();
    }//GEN-LAST:event_MantenimientobtnRemoverMouseClicked

    private void ListadobtnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListadobtnEditarMouseClicked
        
        int registrocargar = ResultadotblLista.getSelectedRow();
        temporalEspecies = new Especie();
        
        temporalEspecies = mantenimiento.BusquedaEspecieIndice(ResultadotblLista.getSelectedRow());
        
        MantenimientotxtCodigo.setText(String.valueOf(temporalEspecies.getCodigo()));
        MantenimientotxtNombre.setText(temporalEspecies.getNombre());
        MantenimientotxtNombreCientifico.setText(temporalEspecies.getNombreCientifico());
        MantenimientotxtDescripcion.setText(temporalEspecies.getDescripcion());
        
        MarcarHabitats(temporalEspecies.getHabitatsId());
        MarcarZonas(temporalEspecies.getZonasId());
            
        PnlGeneral.setEnabledAt(0,false);
        PnlGeneral.setEnabledAt(1,true);
        MantenimientobtnRemover.setEnabled(true);
        PnlGeneral.setSelectedIndex(1);
        
    }//GEN-LAST:event_ListadobtnEditarMouseClicked

    
    
    public void LimpiarCampos ()
    {
        BusquedatxtCodigo.setText("");
        
        MantenimientotxtNombre.setText("");
        MantenimientotxtNombreCientifico.setText("");
        MantenimientotxtDescripcion.setText("");
                
        MantenimientolstHabitats.clearSelection();
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
            java.util.logging.Logger.getLogger(FrmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEspecie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmEspecie().setVisible(true);
            }
        });
    }
    
    private void CargarTabla()
    {
        ArrayList<Especie> lista = mantenimiento.ListadoEspecie();
        
        String[] columnNames = {"Codigo","Nombre","Nombre_Cientifico","Descipcion"};
        DefaultTableModel model = new DefaultTableModel ();
        
        model.setColumnIdentifiers (columnNames);
        
        ResultadotblLista.setModel (model);
        
                       
        for (int i = 0; i < lista.size(); i++)
        {
            int Codigo = lista.get(i).getCodigo();
            String Nombre = lista.get(i).getNombre();
            String Nombre_Cientifico = lista.get(i).getNombreCientifico();
            String Descripcion = lista.get(i).getDescripcion();
            
            Object[] data = {Codigo, Nombre, Nombre_Cientifico, Descripcion};
            
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
    private javax.swing.JLabel MantenimientoDescripcion;
    private javax.swing.JLabel MantenimientoHabitats;
    private javax.swing.JLabel MantenimientoNombre;
    private javax.swing.JLabel MantenimientoNombreCientifico;
    private javax.swing.JLabel MantenimientoZonas;
    private javax.swing.JButton MantenimientobtnCancelar;
    private javax.swing.JButton MantenimientobtnGuardar;
    private javax.swing.JButton MantenimientobtnRemover;
    private javax.swing.JList MantenimientolstHabitats;
    private javax.swing.JList MantenimientolstZonas;
    private javax.swing.JTextField MantenimientotxtCodigo;
    private javax.swing.JTextField MantenimientotxtDescripcion;
    private javax.swing.JTextField MantenimientotxtNombre;
    private javax.swing.JTextField MantenimientotxtNombreCientifico;
    private javax.swing.JPanel PnlBusqueda;
    private javax.swing.JTabbedPane PnlGeneral;
    private javax.swing.JPanel PnlListado;
    private javax.swing.JPanel PnlMantenimiento;
    private javax.swing.JTable ResultadotblLista;
    private javax.swing.JScrollPane ResultadotblListaScrl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
