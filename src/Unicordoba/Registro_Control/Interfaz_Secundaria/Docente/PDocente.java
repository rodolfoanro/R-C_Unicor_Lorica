/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Docente;

/**
 *
 * @author AndresFelipe
 */
public class PDocente extends javax.swing.JPanel {

    /**
     * Creates new form PDocente
     */
    public PDocente() {
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

        LNombre = new javax.swing.JLabel();
        LApellidos = new javax.swing.JLabel();
        LCodigo = new javax.swing.JLabel();
        LCorreo = new javax.swing.JLabel();
        LIdentificacion = new javax.swing.JLabel();
        LTelefono = new javax.swing.JLabel();
        TFieldNombre = new javax.swing.JTextField();
        TFieldApellidos = new javax.swing.JTextField();
        TFieldCodigo = new javax.swing.JTextField();
        TFieldCorreo = new javax.swing.JTextField();
        TFieldIdentificacion = new javax.swing.JTextField();
        TFieldTelefono = new javax.swing.JTextField();
        TFieldCidigoHuella = new javax.swing.JTextField();
        LCodigoHuella = new javax.swing.JLabel();
        LClave = new javax.swing.JLabel();
        TFieldClave = new javax.swing.JTextField();

        LNombre.setText("Nombres:");

        LApellidos.setText("Apellidos:");

        LCodigo.setText("Codigo:");

        LCorreo.setText("Correo:");

        LIdentificacion.setText("Identificación:");

        LTelefono.setText("Telefono");

        LCodigoHuella.setText("Codigo Huella:");

        LClave.setText("Clave:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LNombre)
                    .addComponent(LApellidos)
                    .addComponent(LCodigo)
                    .addComponent(LCorreo)
                    .addComponent(LIdentificacion)
                    .addComponent(LTelefono)
                    .addComponent(LCodigoHuella)
                    .addComponent(LClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFieldCidigoHuella)
                    .addComponent(TFieldApellidos)
                    .addComponent(TFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFieldCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFieldIdentificacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TFieldNombre)
                    .addComponent(TFieldClave, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNombre)
                    .addComponent(TFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LApellidos)
                    .addComponent(TFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCodigo)
                    .addComponent(TFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCorreo)
                    .addComponent(TFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIdentificacion)
                    .addComponent(TFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LTelefono)
                    .addComponent(TFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFieldCidigoHuella, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCodigoHuella))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LClave)
                    .addComponent(TFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LApellidos;
    private javax.swing.JLabel LClave;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LCodigoHuella;
    private javax.swing.JLabel LCorreo;
    private javax.swing.JLabel LIdentificacion;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LTelefono;
    private javax.swing.JTextField TFieldApellidos;
    private javax.swing.JTextField TFieldCidigoHuella;
    private javax.swing.JTextField TFieldClave;
    private javax.swing.JTextField TFieldCodigo;
    private javax.swing.JTextField TFieldCorreo;
    private javax.swing.JTextField TFieldIdentificacion;
    private javax.swing.JTextField TFieldNombre;
    private javax.swing.JTextField TFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
