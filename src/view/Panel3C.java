/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author yesen
 */
public class Panel3C extends javax.swing.JPanel {

    /**
     * Creates new form Panel1
     */
    public Panel3C() {
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

        textNombreC = new javax.swing.JLabel();
        textComercialFNombre = new javax.swing.JTextField();
        textEdadC = new javax.swing.JLabel();
        textComercialFEdad = new javax.swing.JTextField();
        textSalarioC = new javax.swing.JLabel();
        textComerciaSalario = new javax.swing.JTextField();
        textComision = new javax.swing.JLabel();
        textComerciaFComision = new javax.swing.JTextField();
        btnSgteComerciaF = new javax.swing.JButton();
        btnCargarC = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComercial = new javax.swing.JTable();

        textNombreC.setText("NOMBRE");

        textComercialFNombre.setToolTipText("Ej: Yesenia");

        textEdadC.setText("EDAD");

        textComercialFEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComercialFEdadActionPerformed(evt);
            }
        });

        textSalarioC.setText("SALARIO");

        textComerciaSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComerciaSalarioActionPerformed(evt);
            }
        });

        textComision.setText("COMISIÓN");

        textComerciaFComision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textComerciaFComisionActionPerformed(evt);
            }
        });

        btnSgteComerciaF.setText("CREAR");
        btnSgteComerciaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSgteComerciaFActionPerformed(evt);
            }
        });

        btnCargarC.setText("CARGAR");

        btnGuardarC.setText("GUARDAR");

        tablaComercial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaComercial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreC)
                            .addComponent(textEdadC)
                            .addComponent(textSalarioC)
                            .addComponent(textComision))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textComerciaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textComercialFNombre)
                                .addComponent(textComercialFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSgteComerciaF)
                                    .addComponent(textComerciaFComision, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCargarC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardarC)))))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombreC)
                    .addComponent(textComercialFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEdadC)
                    .addComponent(textComercialFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textSalarioC)
                    .addComponent(textComerciaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textComision)
                    .addComponent(textComerciaFComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargarC)
                    .addComponent(btnSgteComerciaF)
                    .addComponent(btnGuardarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textComercialFEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComercialFEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComercialFEdadActionPerformed

    private void textComerciaSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComerciaSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComerciaSalarioActionPerformed

    private void textComerciaFComisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textComerciaFComisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textComerciaFComisionActionPerformed

    private void btnSgteComerciaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSgteComerciaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSgteComerciaFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarC;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnSgteComerciaF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaComercial;
    private javax.swing.JTextField textComerciaFComision;
    private javax.swing.JTextField textComerciaSalario;
    private javax.swing.JTextField textComercialFEdad;
    private javax.swing.JTextField textComercialFNombre;
    private javax.swing.JLabel textComision;
    private javax.swing.JLabel textEdadC;
    private javax.swing.JLabel textNombreC;
    private javax.swing.JLabel textSalarioC;
    // End of variables declaration//GEN-END:variables
}

