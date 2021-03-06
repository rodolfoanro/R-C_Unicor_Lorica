/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Horario;

import Unicordoba.Registro_Control.Base_de_Datos.Controlador.HorarioJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.MateriaJpaController;
import Unicordoba.Registro_Control.Base_de_Datos.Controlador.exceptions.NonexistentEntityException;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Horario;
import Unicordoba.Registro_Control.Base_de_Datos.Entity.Materia;
import Unicordoba.Registro_Control.Interfaz_Secundaria.BasicaUno.Estado_Ventana;
import Unicordoba.Registro_Control.Interfaz_Secundaria.BasicaUno.IPanelEdicion;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.jpa.jpql.parser.EntryExpressionFactory;

/**
 *
 * @author Hp
 */
public class PHorario extends javax.swing.JPanel implements IPanelEdicion{

    /**
     * Creates new form PHorario
     */
    public PHorario() {
        initComponents();
        CargarMateria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cDia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cMateria = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        hID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cInicio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cSalida = new javax.swing.JTextField();

        cDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDiaActionPerformed(evt);
            }
        });

        jLabel6.setText("DIA");

        jLabel1.setText("MATERIA");

        hID.setBackground(new java.awt.Color(255, 255, 255));
        hID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        hID.setOpaque(true);

        jLabel2.setText("ID HORARIO");

        cInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cInicioActionPerformed(evt);
            }
        });

        jLabel4.setText("HORA INICIO");

        jLabel5.setText("HORA SALIDA");

        cSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cDia)
                            .addComponent(cSalida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cInicio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cMateria, javax.swing.GroupLayout.Alignment.LEADING, 0, 152, Short.MAX_VALUE))
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDiaActionPerformed

    private void cInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cInicioActionPerformed

    private void cSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cDia;
    private javax.swing.JTextField cInicio;
    private javax.swing.JComboBox cMateria;
    private javax.swing.JTextField cSalida;
    private javax.swing.JLabel hID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    private EntityManagerFactory factory;
    private Horario horario = null;
    @Override
    public void Guardar(Estado_Ventana estado_Ventana) {
    
        try {
         factory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
         
         horario.setDia(cDia.getText());
         horario.setHoraInicio(cInicio.getText());
         horario.setHoraSalida(cSalida.getText());
         horario.setMateriaid((Materia) cMateria.getSelectedItem());
            HorarioJpaController hjc = new HorarioJpaController(factory);
         if (estado_Ventana.equals(Estado_Ventana.NUEVO)) {
               hjc.create(horario);
            } else {
              hjc.edit(horario);
            }    
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void Eliminar() {
        try {
             factory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
    
            HorarioJpaController hjc = new HorarioJpaController(factory);
            hjc.destroy(horario.getId());
            
        }catch (NonexistentEntityException ex) {
            Logger.getLogger(PHorario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    @Override
    public void ActivarEdicion() {
        
    }

    @Override
    public void Nuevo() {
    horario = new Horario();
    }

    @Override
    public void Seleccionar(Vector vectorSeleccion) {
         factory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        HorarioJpaController hjc = new HorarioJpaController(factory);
        this.horario = hjc.findHorario(Integer.valueOf(vectorSeleccion.get(0).toString()));
        hID.setText(horario.getId().toString());
        cInicio.setText(horario.getHoraInicio());
        cSalida.setText(horario.getHoraSalida());
        cDia.setText(horario.getDia());
        
        cMateria.setSelectedItem(horario.getMateriaid());
        
    }

    @Override
    public List<Object[]> getListaParaTabla() {
        factory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        HorarioJpaController hjc = new HorarioJpaController(factory);
        
        List<Object[]> list = new ArrayList();
        for(Horario horario : hjc.findHorarioEntities()){
        list.add(new Object[]{
        horario.getDia(),
        horario.getHoraInicio(),
        horario.getHoraSalida()
        });
        }
        return list;
    }

    @Override
    public String[] getNombreDeColumnas() {
        return new String[]{"Dia", "Hora Inicio", "Hora Salida"};
    }
    
    
    private void CargarMateria() {
        factory = Persistence.createEntityManagerFactory("R-C_Unicor_LoricaPU");
        MateriaJpaController mjc = new MateriaJpaController(factory);
        List<Materia> list = mjc.findMateriaEntities();
        for (Materia list1 : list) {
            cMateria.addItem(list1);
        }
    }
    
    
}
