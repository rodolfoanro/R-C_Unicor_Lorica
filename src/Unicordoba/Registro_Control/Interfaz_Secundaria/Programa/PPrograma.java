/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unicordoba.Registro_Control.Interfaz_Secundaria.Programa;

/**
 *
 * @author AndresFelipe
 */
public class PPrograma extends javax.swing.JPanel {

    /**
     * Creates new form PPrograma
     */
    public PPrograma() {
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

        LFaculdad = new javax.swing.JLabel();
        LNombrePrograma = new javax.swing.JLabel();
        LCodigo = new javax.swing.JLabel();
        LNomJefePrograma = new javax.swing.JLabel();
        TFieldNombrePrograma = new javax.swing.JTextField();
        TFieldCodigo = new javax.swing.JTextField();
        TFieldNomJefePrograma = new javax.swing.JTextField();
        CBFacultades = new javax.swing.JComboBox();

        LFaculdad.setText("Faculdad:");

        LNombrePrograma.setText("Nombre del Programa:");

        LCodigo.setText("Codigo:");

        LNomJefePrograma.setText("Nombre jefe del programa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNombrePrograma)
                            .addComponent(LCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFieldNombrePrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(TFieldCodigo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LNomJefePrograma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LFaculdad)
                                .addGap(92, 92, 92)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBFacultades, 0, 241, Short.MAX_VALUE)
                            .addComponent(TFieldNomJefePrograma))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNombrePrograma)
                    .addComponent(TFieldNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCodigo)
                    .addComponent(TFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LFaculdad)
                    .addComponent(CBFacultades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LNomJefePrograma)
                    .addComponent(TFieldNomJefePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CBFacultades;
    private javax.swing.JLabel LCodigo;
    private javax.swing.JLabel LFaculdad;
    private javax.swing.JLabel LNomJefePrograma;
    private javax.swing.JLabel LNombrePrograma;
    private javax.swing.JTextField TFieldCodigo;
    private javax.swing.JTextField TFieldNomJefePrograma;
    private javax.swing.JTextField TFieldNombrePrograma;
    // End of variables declaration//GEN-END:variables
}
