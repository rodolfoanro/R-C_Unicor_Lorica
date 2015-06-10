/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Materia;

import Unicordoba.Registro_Control.Base_de_Datos.Controlador.MateriaJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.ProgramaJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.exceptions.IllegalOrphanException;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.exceptions.NonexistentEntityException;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Materia;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Programa;
import Unicordoba.Registro_Control.Interfaz_Secundaria.Basica.Estado_Ventana;
import Unicordoba.Registro_Control.Interfaz_Secundaria.Basica.IPanelEdicion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author AndresFelipe
 */
public class PMateria extends javax.swing.JPanel implements IPanelEdicion {
    
    /**
     * Creates new form PMateria
     */
    public PMateria() {
        initComponents();
        CarcarCBUniversidades();
    }
    
    public void CarcarCBUniversidades(){        
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        List<Programa> list = new ProgramaJpaController(entityManagerFactory).findProgramaEntities();
        for (Programa list1 : list) {
            CBListaProgramas.addItem(list1);
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

        LNombreMateria = new javax.swing.JLabel();
        LCodigo = new javax.swing.JLabel();
        LSemestre = new javax.swing.JLabel();
        LContenido = new javax.swing.JLabel();
        LCantidadCreditos = new javax.swing.JLabel();
        LProgramaAcedimico = new javax.swing.JLabel();
        TFieldNombreMateria = new javax.swing.JTextField();
        TFieldCodigo = new javax.swing.JTextField();
        ScrollPanelContenido = new javax.swing.JScrollPane();
        TAreaContenido = new javax.swing.JTextArea();
        CBSemestre = new javax.swing.JComboBox();
        CBCantidadCreditos = new javax.swing.JComboBox();
        CBListaProgramas = new javax.swing.JComboBox();

        LNombreMateria.setText("Nombre de la Materia:");

        LCodigo.setText("Codigo:");

        LSemestre.setText("Semestre:");

        LContenido.setText("Contenido:");

        LCantidadCreditos.setText("Cantidad de Credito:");

        LProgramaAcedimico.setText("Programa Academico:");

        TAreaContenido.setColumns(20);
        TAreaContenido.setRows(5);
        ScrollPanelContenido.setViewportView(TAreaContenido);

        CBSemestre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Primer Semestre", "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre", "Quinto Semestre", "Sexto Semestre", "Septimo Semestre", "Octavo Semestre", "Noveno Semestre", "Decimo Semestre" }));
        CBSemestre.setSelectedIndex(1);

        CBCantidadCreditos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNombreMateria)
                            .addComponent(LCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFieldNombreMateria)
                            .addComponent(TFieldCodigo)))
                    .addComponent(ScrollPanelContenido)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LSemestre)
                            .addComponent(LProgramaAcedimico)
                            .addComponent(LContenido))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(LCantidadCreditos)
                                .addGap(18, 18, 18)
                                .addComponent(CBCantidadCreditos, 0, 45, Short.MAX_VALUE))
                            .addComponent(CBListaProgramas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBSemestre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LNombreMateria))
                    .addComponent(TFieldNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LCodigo))
                    .addComponent(TFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LSemestre))
                    .addComponent(CBSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LProgramaAcedimico))
                    .addComponent(CBListaProgramas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBCantidadCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LCantidadCreditos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LContenido)))
                .addGap(6, 6, 6)
                .addComponent(ScrollPanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBCantidadCreditos;
    private javax.swing.JComboBox CBListaProgramas;
    private javax.swing.JComboBox CBSemestre;
    private javax.swing.JLabel LCantidadCreditos;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LContenido;
    private javax.swing.JLabel LNombreMateria;
    private javax.swing.JLabel LProgramaAcedimico;
    private javax.swing.JLabel LSemestre;
    private javax.swing.JScrollPane ScrollPanelContenido;
    private javax.swing.JTextArea TAreaContenido;
    private javax.swing.JTextField TFieldCodigo;
    private javax.swing.JTextField TFieldNombreMateria;
    // End of variables declaration//GEN-END:variables

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Materia materia = null;
    
    @Override
    public void Guardar(Estado_Ventana estado_Ventana ) {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
            
            materia.setNombre(TFieldNombreMateria.getText());
            materia.setCodigo(Integer.valueOf(TFieldCodigo.getText())); 
            materia.setSemestre(Integer.valueOf(CBSemestre.getSelectedIndex()));
            materia.setContenido(TAreaContenido.getText());
            materia.setCreditos(Integer.valueOf(CBCantidadCreditos.getSelectedItem().toString()));
            MateriaJpaController materiaJpaController = new MateriaJpaController(entityManagerFactory);
            
            if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
                materiaJpaController.create(materia);
            } else {
                materia.setId(materia.getId());
                materiaJpaController.edit(materia);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
            MateriaJpaController materiaJpaController = new MateriaJpaController(entityManagerFactory);
            materiaJpaController.destroy(materia.getId());          

        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        } catch (IllegalOrphanException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void ActivarEdicion() {
        
    }

    @Override
    public void Nuevo() {
        materia = new Materia();
    }

    @Override
    public void Seleccionar(Vector vectorSeleccion) {
        
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        MateriaJpaController materiaJpaController = new  MateriaJpaController(entityManagerFactory);
        
        
        this.materia = materiaJpaController.findMateria(Integer.valueOf(vectorSeleccion.get(0).toString()));
        TFieldNombreMateria.setText(materia.getNombre());
        TFieldCodigo.setText(materia.getCodigo()+"");
        CBSemestre.setSelectedItem(materia.getSemestre());
        TAreaContenido.setText(materia.getContenido());
        CBCantidadCreditos.setSelectedItem(materia.getCreditos());
    }

    @Override
    public List<Object[]> getListaParaTabla() {
        entityManagerFactory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        MateriaJpaController materiaJpaController = new MateriaJpaController(entityManagerFactory);
        
        List<Object[]> list = new ArrayList();
        for (Materia materia : materiaJpaController.findMateriaEntities()){
            list.add(new Object[]{
                materia.getId(),
                materia.getNombre(),
                materia.getCodigo(),
                materia.getSemestre(),                
                materia.getCreditos(),
                materia.getContenido()               
            });
        }
        return list;
    }

    @Override
    public String[] getNombreDeColumnas() {
        return new String[]{"ID", "Nombre", "Codigo", "Semestre","Credito","Contenido"};
    }
}
